package com.itl.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


public class Base  {



	@Version

	protected Integer version = 0;


	protected Long activityId = 0L;

	private String description = "";

	protected String createdBy = "";


	protected Date createdDate;

	private Date createdTime;


	protected String lastModifiedBy = "";

	
	private Integer isActive = 1;


	private String authStatus = "";

	
	protected Date lastModifiedDate;


	private Date lastModifiedTime;


	protected String deprecatedBy = "";

	
	protected Date deprecatedDate;


	private Date deprecatedTime;


	@Basic
	Boolean deprecated = false;


	@Transient
	public Double initDouble = 0.00;


	@Transient
	public int initInteger = 0;


	@Transient
	public String initString = " ";


	@Transient
	public long initLongInt = 0L;


	@Transient
	public BigDecimal initBDInt = BigDecimal.ZERO;

////////////added for auth check ///

	protected String authBy1 = "";


	protected Date authDate1;

	
	protected String authBy2 = "";


	protected Date authDate2;


	protected String authBy3 = "";

	protected Date authDate3;

	private Integer noAuthPending = 0;

//////////////

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	/*
	 * public Integer getTenantId() { return tenantId; }
	 * 
	 * public void setTenantId(Integer tenantId) { this.tenantId = tenantId; }
	 */

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getDeprecatedBy() {
		return deprecatedBy;
	}

	public void setDeprecatedBy(String deprecatedBy) {
		this.deprecatedBy = deprecatedBy;
	}

	public Date getDeprecatedDate() {
		return deprecatedDate;
	}

	public void setDeprecatedDate(Date deprecatedDate) {
		this.deprecatedDate = deprecatedDate;
	}

	public Date getDeprecatedTime() {
		return deprecatedTime;
	}

	public void setDeprecatedTime(Date deprecatedTime) {
		this.deprecatedTime = deprecatedTime;
	}

	public Boolean getDeprecated() {
		return deprecated;
	}

	public void setDeprecated(Boolean deprecated) {
		this.deprecated = deprecated;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public String getAuthStatus() {
		return authStatus;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public Date initDate() {
		String intialDate = "01-JAN-1900";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			return sdf.parse(intialDate);
		} catch (ParseException e) {
			return null;
		}
	}

	@JsonProperty(access = Access.WRITE_ONLY)
	@Transient
	public Integer noOfAuthNeeded = 1;

	@JsonProperty(access = Access.WRITE_ONLY)
	@Transient
	public Boolean conCurChkYN = true;

	@JsonProperty(access = Access.WRITE_ONLY)
	@Transient
	public Boolean uaeYN = false;

	public Integer getNoOfAuthNeeded() {
		return noOfAuthNeeded;
	}

	public void setNoOfAuthNeeded(Integer noOfAuthNeeded) {
		this.noOfAuthNeeded = noOfAuthNeeded;
	}

	public Boolean getConCurChkYN() {
		return conCurChkYN;
	}

	public void setConCurChkYN(Boolean conCurChkYN) {
		this.conCurChkYN = conCurChkYN;
	}

	public Boolean getUaeYN() {
		return uaeYN;
	}

	public void setUaeYN(Boolean uaeYN) {
		this.uaeYN = uaeYN;
	}

	public String setterStringReplace(String str) {
		str = str.replace("_", "\\_").replace("%", "\\%").replace("'", "\\'");
		return str;
	}

	public String getterStringReplace(String str) {
		str = str.replace("\\_", "_").replace("\\%", "%").replace("\\'", "'");
		return str;
	}

	public String getAuthBy1() {
		return authBy1;
	}

	public void setAuthBy1(String authBy1) {
		this.authBy1 = authBy1;
	}

	public Date getAuthDate1() {
		return authDate1;
	}

	public void setAuthDate1(Date authDate1) {
		this.authDate1 = authDate1;
	}

	public String getAuthBy2() {
		return authBy2;
	}

	public void setAuthBy2(String authBy2) {
		this.authBy2 = authBy2;
	}

	public Date getAuthDate2() {
		return authDate2;
	}

	public void setAuthDate2(Date authDate2) {
		this.authDate2 = authDate2;
	}

	public String getAuthBy3() {
		return authBy3;
	}

	public void setAuthBy3(String authBy3) {
		this.authBy3 = authBy3;
	}

	public Date getAuthDate3() {
		return authDate3;
	}

	public void setAuthDate3(Date authDate3) {
		this.authDate3 = authDate3;
	}

	public Integer getNoAuthPending() {
		return noAuthPending;
	}

	public void setNoAuthPending(Integer noAuthPending) {
		this.noAuthPending = noAuthPending;
	}

}
