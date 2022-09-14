package com.reader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reader.model.Reader;

@Service
public class ReaderServiceImpl implements IReaderService {
	
	@Autowired
	IReaderRepository readerRepository;

	@Override
	public Integer saveReader(Reader reader) {
		Reader savedReader = readerRepository.save(reader);
		return savedReader.getId();
		
	}

	@Override
	public List<Reader> getAllReaders() {
		return readerRepository.findAll();
	}

	@Override
	public List<Reader> getReaderByType(String readerType) {
		return readerRepository.getReaderByType(readerType);
	}

	@Override
	public List<Reader> getReaderByPhone(String phone) {
		return readerRepository.getReaderByPhone(phone);
	}
	

}
