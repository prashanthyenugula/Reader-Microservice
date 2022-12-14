package com.reader.service;

import java.util.List;

import com.reader.model.Reader;

public interface IReaderService {
	
	Integer saveReader(Reader reader);

	public List<Reader> getAllReaders();

	public List<Reader> getReaderByType(String readerType);

	public List<Reader> getReaderByPhone(String phone);
	
}
