package com.sogeti.atlantic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SpecificTAA extends TAA {
	@Column(name = "draft")
	private Date draft;
	
	@Column(name = "submissionToDoS")
	private Date submissionToDoS;

	@Column(name = "approvedByDos")
	private Date approvedByDos;

	@Column(name = "fullyExecuted")
	private Date fullyExecuted;

	public Date getDraft() {
		return draft;
	}

	public void setDraft(Date draft) {
		this.draft = draft;
	}

	public Date getSubmissionToDoS() {
		return submissionToDoS;
	}

	public void setSubmissionToDoS(Date submissionToDoS) {
		this.submissionToDoS = submissionToDoS;
	}

	public Date getApprovedByDos() {
		return approvedByDos;
	}

	public void setApprovedByDos(Date approvedByDos) {
		this.approvedByDos = approvedByDos;
	}

	public Date getFullyExecuted() {
		return fullyExecuted;
	}

	public void setFullyExecuted(Date fullyExecuted) {
		this.fullyExecuted = fullyExecuted;
	}

}
