package com.reader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reader.model.Reader;
import com.reader.service.IReaderService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ReaderController {
	
	@Autowired
	IReaderService readerService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/saveReader")
	Integer createReader(@RequestBody Reader reader) {
		Integer id = readerService.saveReader(reader);
		return id;
	}
	
	@GetMapping("/getAllReaders")
	List<Reader> getReaders() {
		return readerService.getAllReaders();
	}
	
	@GetMapping("/getReaderbyType")
	List<Reader> getReaderByType(@PathVariable String type ) {
		List<Reader> readers = readerService.getReaderByType(type);
		return readers;
	}
	
	@GetMapping("/getReaderbyPhone")
	List<Reader> getReaderByPhone(@PathVariable String phone ) {
		List<Reader> readers = readerService.getReaderByPhone(phone);
		return readers;
	}
	
	@GetMapping("getBooksBy/{phone}")
	public Reader getBooks(@PathVariable("phone") String phone) {
		Reader reader =  (Reader) this.readerService.getReaderByPhone(phone);
		
		List books = this.restTemplate.getForObject("http:Author-Microservice/getBook/" + phone, List.class);
		//reader.setBooks(books);
		return reader;
		
	}
	
	
}
