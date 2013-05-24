package com.sogeti.atlantic.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sogeti.atlantic.model.GenericTAA;
import com.sogeti.atlantic.model.SpecificTAA;
import com.sogeti.atlantic.service.GenericTAAService;
import com.sogeti.atlantic.service.SpecificTAAService;

@ManagedBean(name = "board")
@SessionScoped
public class Board implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<SpecificTAA> specificTAAs;

	private List<GenericTAA> genericTAAs;

	private ApplicationContext appContext;

	private SpecificTAAService specificTAAService;

	private GenericTAAService genericTAAService;
	
	private SpecificTAA specificTAAEdit;
	
	private GenericTAA genericTAAEdit;

	public Board() {
		specificTAAs = new ArrayList<SpecificTAA>();
		genericTAAs = new ArrayList<GenericTAA>();
		appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		specificTAAService = (SpecificTAAService) appContext
				.getBean("specificTAAService");
		genericTAAService = (GenericTAAService) appContext
				.getBean("genericTAAService");
		getSpecificTAA();
		getGenericTAA();
	}
	
	public void removeSpecificTAA(SpecificTAA specificTAA) {
		specificTAAService.delete(specificTAA);
		specificTAAs.remove(specificTAA);
	}
	
	public void removeGenericTAA(GenericTAA genericTAA) {
		genericTAAService.delete(genericTAA);
		genericTAAs.remove(genericTAA);
	}

	public void getSpecificTAA() {
		specificTAAs = specificTAAService.findAllSpecificTAA();
	}

	public void getGenericTAA() {
		genericTAAs = genericTAAService.findAllGenericTAA();
	}

	public List<SpecificTAA> getSpecificTAAs() {
		return specificTAAs;
	}

	public void setSpecificTAAs(List<SpecificTAA> specificTAAs) {
		this.specificTAAs = specificTAAs;
	}

	public List<GenericTAA> getGenericTAAs() {
		return genericTAAs;
	}

	public void setGenericTAAs(List<GenericTAA> genericTAAs) {
		this.genericTAAs = genericTAAs;
	}

	public SpecificTAA getSpecificTAAEdit() {
		return specificTAAEdit;
	}

	public void setSpecificTAAEdit(SpecificTAA specificTAAEdit) {
		this.specificTAAEdit = specificTAAEdit;
	}

	public GenericTAA getGenericTAAEdit() {
		return genericTAAEdit;
	}

	public void setGenericTAAEdit(GenericTAA genericTAAEdit) {
		this.genericTAAEdit = genericTAAEdit;
	}
	
	

}