package com.itl.service;

import com.itl.entity.AuthConfig;

public interface AuthConfiguration {
	
	public String authConfig(AuthConfig AuthConfig);
	
	public AuthConfig authCheck(String master, Integer tenantId) throws Exception;

}
