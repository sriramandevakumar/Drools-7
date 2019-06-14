package com.sample;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRN_OCR_REGISTRATION_DTL")
public class ProductProgram implements Serializable {

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
	@Column(name="INPUTTER_DT")
	private String InputterDT;
	@Column(name="INPUTTER_ID")
	private String InputterID;
	@Column(name="PRODUCTCODE")
	private String ProductCode;
	@Column(name="PRODUCT")
	private String ProductName;
	
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
	public String getInputterDT() {
		return InputterDT;
	}
	public void setInputterDT(String inputterDT) {
		InputterDT = inputterDT;
	}
	public String getInputterID() {
		return InputterID;
	}
	public void setInputterID(String inputterID) {
		InputterID = inputterID;
	}
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
