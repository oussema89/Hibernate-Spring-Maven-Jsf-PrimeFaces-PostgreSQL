package com.sogeti.atlantic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class GenericTAA extends TAA {
	@Column(name = "gcCOMSATStaffedToDoS")
	private Date gcCOMSATStaffedToDoS;

	@Column(name = "gcCOMSATApproval")
	private Date gcCOMSATApproval;

	public Date getGcCOMSATStaffedToDoS() {
		return gcCOMSATStaffedToDoS;
	}

	public void setGcCOMSATStaffedToDoS(Date gcCOMSATStaffedToDoS) {
		this.gcCOMSATStaffedToDoS = gcCOMSATStaffedToDoS;
	}

	public Date getGcCOMSATApproval() {
		return gcCOMSATApproval;
	}

	public void setGcCOMSATApproval(Date gcCOMSATApproval) {
		this.gcCOMSATApproval = gcCOMSATApproval;
	}

}
