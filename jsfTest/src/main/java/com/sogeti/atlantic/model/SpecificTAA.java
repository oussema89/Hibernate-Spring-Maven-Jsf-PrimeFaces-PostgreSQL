package com.sogeti.atlantic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SpecificTAA extends TAA {
	@Column(name = "draft")
	@Temporal(TemporalType.DATE)
	private Date draft;
	
	@Column(name = "submissionToDoS")
	@Temporal(TemporalType.DATE)
	private Date submissionToDoS;

	@Column(name = "approvedByDos")
	@Temporal(TemporalType.DATE)
	private Date approvedByDos;

	@Column(name = "fullyExecuted")
	@Temporal(TemporalType.DATE)
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
