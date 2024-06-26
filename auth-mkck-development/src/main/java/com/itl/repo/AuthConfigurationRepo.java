package com.itl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itl.entity.AuthConfig;

@Repository
public interface AuthConfigurationRepo extends JpaRepository<AuthConfig,Integer>{
	
	public AuthConfig findByAuthReqMasterAndTenantId(String master, Integer tenantId) ;

}
