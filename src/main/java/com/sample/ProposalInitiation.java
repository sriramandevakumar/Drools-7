package com.sample;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TRN_OCR_CRAPP")
public class ProposalInitiation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2762218477380661872L;
	@Id
    @Column(name="APPL_REF_NUM")
	private String applRefNumber;
	@Column(name="CAM_TYPE")
	private String CAMType;
	@Column(name="CUSTOMER_NAME")
	private String CustomerName;
	@Column(name="CITY_CODE")
	private String City;
	@Column(name="PROPOSED_TOTAL_LIMIT")
	private String ProposedTotalLimit;
	@Column(name="BUSINESS_SEGMENT")
	private String SegmentCode;
	@Column(name="BRANCH_CODE")
	private String BranchCode;
	@Column(name="REGION_CODE")
	private String Region;
	@Column(name="SOURCING_CHANNEL")
	private String SourcingChannel;
	@Column(name="INPUTTER_DT")
	private String InputterDT;
	@Column(name="INPUTTER_ID")
	private String InputterID;
	@Column(name="CUST_ID")
	private String CustID;
	@Column(name="STATE_CODE")
	private String stateProvinceId;
	
	@Transient
	private String SelectedProductProgram;
	@Transient
	private String RegionDesc;
	@Transient
	private String BranchDesc;
	@Transient
	private String BusinessSegmentDesc;
	
	@Column(name="PREV_APPL_REF_NUM")
	private String OldAppRefNum;
	@Column(name="LAST_UPD_USER_ID")
	private String LastUpdUserID;
	@Column(name="LAST_UPD_DT")
	private String LastUpdDT;
	
	@Column(name="APPL_FORM_NUM")
	private String AppFormNum;
	@Column(name="APPL_SIGNED_DATE")
	private String AppSignDate;
	@Column(name="BUSINESS_VERTICAL")
	private String BusinessVrtcl;
	@Column(name="APP_RM")
	private String RMID;
	@Column(name="APP_RA")
	private String RAID;
	@Column(name="APP_TL")
	private String TLCBLID;
	@Column(name="APP_ACH")
	private String ACHID;
	@Column(name="CAM_REFERENCE_NUM")
	private String CAMRefNum;
	@Column(name="CAD_LOCATION")
	private String CADLoc;
	
	
	@OneToMany(targetEntity=ProductProgram.class, mappedBy="applRefNumber")
	private List<ProductProgram> RegistrationDetails;
	@OneToMany(targetEntity=DocumentInfo.class, mappedBy="applRefNumber")
	private List<DocumentInfo> DocInformation;
	
	public String getCAMType() {
		return CAMType;
	}
	public void setCAMType(String cAMType) {
		CAMType = cAMType;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCity() {
		return City;
	}
	public String getStateProvinceId() {
		return stateProvinceId;
	}
	public void setStateProvinceId(String stateProvinceId) {
		this.stateProvinceId = stateProvinceId;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getProposedTotalLimit() {
		return ProposedTotalLimit;
	}
	public void setProposedTotalLimit(String proposedTotalLimit) {
		ProposedTotalLimit = proposedTotalLimit;
	}
	public String getSegmentCode() {
		return SegmentCode;
	}
	public void setSegmentCode(String segmentCode) {
		SegmentCode = segmentCode;
	}
	public String getBranchCode() {
		return BranchCode;
	}
	public void setBranchCode(String branchCode) {
		BranchCode = branchCode;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getSourcingChannel() {
		return SourcingChannel;
	}
	public void setSourcingChannel(String sourcingChannel) {
		SourcingChannel = sourcingChannel;
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
	public String getCustID() {
		return CustID;
	}
	public void setCustID(String custID) {
		CustID = custID;
	}
	public String getSelectedProductProgram() {
		return SelectedProductProgram;
	}
	public void setSelectedProductProgram(String selectedProductProgram) {
		SelectedProductProgram = selectedProductProgram;
	}
	public String getRegionDesc() {
		return RegionDesc;
	}
	public void setRegionDesc(String regionDesc) {
		RegionDesc = regionDesc;
	}
	public String getBranchDesc() {
		return BranchDesc;
	}
	public void setBranchDesc(String branchDesc) {
		BranchDesc = branchDesc;
	}
	public String getBusinessSegmentDesc() {
		return BusinessSegmentDesc;
	}
	public void setBusinessSegmentDesc(String businessSegmentDesc) {
		BusinessSegmentDesc = businessSegmentDesc;
	}
	public String getApplRefNumber() {
		return applRefNumber;
	}
	public void setApplRefNumber(String applRefNumber) {
		this.applRefNumber = applRefNumber;
	}
	public String getOldAppRefNum() {
		return OldAppRefNum;
	}
	public void setOldAppRefNum(String oldAppRefNum) {
		OldAppRefNum = oldAppRefNum;
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
	public List<ProductProgram> getRegistrationDetails() {
		return RegistrationDetails;
	}
	public void setRegistrationDetails(List<ProductProgram> registrationDetails) {
		RegistrationDetails = registrationDetails;
	}
	public List<DocumentInfo> getDocInformation() {
		return DocInformation;
	}
	public void setDocInformation(List<DocumentInfo> docInformation) {
		DocInformation = docInformation;
	}
	
	public String getAppFormNum() {
		return AppFormNum;
	}
	public void setAppFormNum(String appFormNum) {
		AppFormNum = appFormNum;
	}
	public String getAppSignDate() {
		return AppSignDate;
	}
	public void setAppSignDate(String appSignDate) {
		AppSignDate = appSignDate;
	}
	public String getBusinessVrtcl() {
		return BusinessVrtcl;
	}
	public void setBusinessVrtcl(String businessVrtcl) {
		BusinessVrtcl = businessVrtcl;
	}
	public String getRMID() {
		return RMID;
	}
	public void setRMID(String rMID) {
		RMID = rMID;
	}
	public String getRAID() {
		return RAID;
	}
	public void setRAID(String rAID) {
		RAID = rAID;
	}
	public String getTLCBLID() {
		return TLCBLID;
	}
	public void setTLCBLID(String tLCBLID) {
		TLCBLID = tLCBLID;
	}
	public String getACHID() {
		return ACHID;
	}
	public void setACHID(String aCHID) {
		ACHID = aCHID;
	}
	public String getCAMRefNum() {
		return CAMRefNum;
	}
	public void setCAMRefNum(String cAMRefNum) {
		CAMRefNum = cAMRefNum;
	}
	public String getCADLoc() {
		return CADLoc;
	}
	public void setCADLoc(String cADLoc) {
		CADLoc = cADLoc;
	}
	
}
