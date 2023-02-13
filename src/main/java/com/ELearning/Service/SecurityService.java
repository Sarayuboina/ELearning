package com.ELearning.Service;

import java.util.Map;

import com.ELearning.bean.LoginBean;

public interface SecurityService {
	
	Map<String,String> getAuthToken(LoginBean log);

}
