package com.sogeti.atlantic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sogeti.atlantic.dao.DocumentDao;
import com.sogeti.atlantic.model.Document;

@Service
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	private DocumentDao documentDao;

	@Transactional
	public void save(Document document) {
		documentDao.save(document);
	}

	@Transactional
	public void update(Document document) {
		documentDao.update(document);
	}

	@Transactional
	public void delete(Document document) {
		documentDao.delete(document);
	}

	@Transactional
	public Document findDocumentById(int id) {
		return documentDao.findDocumentById(id);
	}

	@Transactional
	public List<Document> findAllDocuments() {
		return documentDao.findAllDocuments();
	}

	public DocumentDao getDocumentDao() {
		return documentDao;
	}

	public void setDocumentDao(DocumentDao documentDao) {
		this.documentDao = documentDao;
	}
}
