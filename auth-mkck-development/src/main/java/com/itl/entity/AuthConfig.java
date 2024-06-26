package com.itl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AuthConfig {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	private Integer tenantId;

	private Integer authRequired ;
	

	private String authReqMaster ;

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public Integer getAuthRequired() {
		return authRequired;
	}

	public void setAuthRequired(Integer authRequired) {
		this.authRequired = authRequired;
	}

	public String getAuthReqMaster() {
		return authReqMaster;
	}

	public void setAuthReqMaster(String authReqMaster) {
		this.authReqMaster = authReqMaster;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	
	

}
