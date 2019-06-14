package com.sample;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRN_OCR_DOC_INFO")
public class DocumentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5247950092720919617L;
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	@Column(name="APPL_REF_NUM")
	private String applRefNumber;
	
	@Column(name="STAGE")
	private String Stage;
	@Column(name="DOC_GRP_CD")
	private String DocGRPCD;
	@Column(name="DOC_CD")
	private String DocCD;
	@Column(name="DOC_COLLECTED")
	private String DocCollected;
	
	@Column(name="LAST_UPD_USER_ID")
	private String LastUpdUserID;
	@Column(name="LAST_UPD_DT")
	private String LastUpdDT;
	
	public String getApplRefNumber() {
		return applRefNumber;
	}
	public void setApplRefNumber(String applRefNumber) {
		this.applRefNumber = applRefNumber;
	}
	public String getLastUpdUserID() {
		return LastUpdUserID;
	}
	public void setLastUpdUserID(String lastUpdUserID) {
		LastUpdUserID = lastUpdUserID;
	}
	public String getLastUpdDT() {
		return LastUpdDT;
	}
	public void setLastUpdDT(String lastUpdDT) {
		LastUpdDT = lastUpdDT;
	}
	public String getStage() {
		return Stage;
	}
	public void setStage(String stage) {
		Stage = stage;
	}
	public String getDocGRPCD() {
		return DocGRPCD;
	}
	public void setDocGRPCD(String docGRPCD) {
		DocGRPCD = docGRPCD;
	}
	public String getDocCD() {
		return DocCD;
	}
	public void setDocCD(String docCD) {
		DocCD = docCD;
	}
	public String getDocCollected() {
		return DocCollected;
	}
	public void setDocCollected(String docCollected) {
		DocCollected = docCollected;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
