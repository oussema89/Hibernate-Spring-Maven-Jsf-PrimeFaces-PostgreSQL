package util;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sogeti.atlantic.model.Document;
import com.sogeti.atlantic.service.DocumentService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		DocumentService documentService = (DocumentService) appContext.getBean("documentService");
		
		Document document = new Document();
		document.setDate(new Date());
		document.setName("test");
		document.setObject("ultime");
		
		documentService.save(document);
	
	}

}
