package com.itl.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itl.entity.AuthConfig;
import com.itl.entity.AuthRequestVO;
import com.itl.service.AuthConfiguration;

@RestController
public class AuthConfigController {

	@Autowired
	AuthConfiguration authConfiguration;

	@PostMapping(value = "/setAuthConfig")
	public String setConfiguration(@RequestBody AuthConfig authConfig) {

		String response = authConfiguration.authConfig(authConfig);

		return response;

	}

	@PostMapping(value = "/CheckAuth")
	public Boolean CheckAuth(@RequestBody AuthRequestVO authRequestVO) throws Exception {

		AuthConfig authConfig = authConfiguration.authCheck(authRequestVO.getMaster(), authRequestVO.getTenantId());
		Date dt = new Date();
		Boolean authorize = Boolean.FALSE;
		Integer numberOfAuth = authConfig.getAuthRequired();
		switch (numberOfAuth) {
		case 1:
			if (!StringUtils.isEmpty(authRequestVO.getAuthChecker1())) {

				return authorize = Boolean.TRUE;
			}
			break;

		case 2:
			if (!StringUtils.isEmpty(authRequestVO.getAuthChecker1())&& !StringUtils.isEmpty(authRequestVO.getAuthChecker2())) {
				return authorize = Boolean.TRUE;
			}

			break;

		case 3:

			if (!StringUtils.isEmpty(authRequestVO.getAuthChecker1())
					&& !StringUtils.isEmpty(authRequestVO.getAuthChecker2()) && !StringUtils.isEmpty(authRequestVO.getAuthChecker3())) {
				return authorize = Boolean.TRUE;
			}

			break;

		}
		return authorize;
	}
}
