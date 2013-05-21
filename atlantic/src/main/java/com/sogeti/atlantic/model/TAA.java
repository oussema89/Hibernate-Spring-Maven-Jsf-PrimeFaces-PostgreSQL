package com.sogeti.atlantic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Taa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class TAA {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "licenseNumber")
	private String licenseNumber;

	@Column(name = "versionNumber")
	private String versionNumber;

	@Column(name = "subject")
	private String subject;

	@Column(name = "signatories")
	private String signatories;

	@Column(name = "sublicencing")
	private String sublicencing;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "documentId")
//	private List<Document> documents;

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSignatories() {
		return signatories;
	}

	public void setSignatories(String signatories) {
		this.signatories = signatories;
	}

	public String getSublicencing() {
		return sublicencing;
	}

	public void setSublicencing(String sublicencing) {
		this.sublicencing = sublicencing;
	}

//	public List<Document> getDocuments() {
//		return documents;
//	}
//
//	public void setDocuments(List<Document> documents) {
//		this.documents = documents;
//	}

}
