package com.sogeti.atlantic.service;

import java.util.List;

import com.sogeti.atlantic.model.Document;

public interface DocumentService {
	
	void save(Document document);

	void update(Document document);

	void delete(Document document);

	Document findDocumentById(int id);
	
	List<Document> findAllDocuments();
}
