package com.itl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itl.entity.AuthConfig;
import com.itl.repo.AuthConfigurationRepo;
import com.itl.service.AuthConfiguration;

@Service
public class AuthConfigurationImpl implements AuthConfiguration {

	@Autowired
	AuthConfigurationRepo authConfigurationRepo;

	@Override
	public String authConfig(AuthConfig authConfig) {
		System.out.println();

		AuthConfig AuthConfig = authConfigurationRepo.save(authConfig);
		if (AuthConfig != null) {
			return "record Saved Successfully";
		} else
			return "failure while save record  ";
	}

	@Override
	public AuthConfig authCheck(String master, Integer tenantId) throws Exception {
		AuthConfig AuthConfig = authConfigurationRepo.findByAuthReqMasterAndTenantId(master, tenantId);

		return AuthConfig;
	}

}
