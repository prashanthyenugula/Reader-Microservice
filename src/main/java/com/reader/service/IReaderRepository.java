package com.reader.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reader.model.Reader;

public interface IReaderRepository extends JpaRepository<Reader, Integer> {
	
	public List<Reader> getReaderByType(String readerType);

	public List<Reader> getReaderByPhone(String phone);
}
