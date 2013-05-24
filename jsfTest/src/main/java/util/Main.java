package util;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sogeti.atlantic.model.Document;
import com.sogeti.atlantic.model.GenericTAA;
import com.sogeti.atlantic.model.SpecificTAA;
import com.sogeti.atlantic.service.DocumentService;
import com.sogeti.atlantic.service.GenericTAAService;
import com.sogeti.atlantic.service.SpecificTAAService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		SpecificTAAService genericTAAService = (SpecificTAAService) appContext.getBean("specificTAAService");
		
		SpecificTAA genericTAA = new SpecificTAA();
		genericTAA.setApprovedByDos(new Date());
		genericTAA.setDraft(new Date());
		genericTAA.setFullyExecuted(new Date());
		genericTAA.setSubmissionToDoS(new Date());
		genericTAA.setLicenseNumber("test2");
		genericTAA.setSubject("test2");
		genericTAA.setVersionNumber("test2");
	
		
		genericTAAService.save(genericTAA);
		
		
	
	}

}
