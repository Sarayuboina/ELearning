package com.ELearning.Service;

import com.ELearning.bean.LoginBean;
import com.ELearning.bean.RegisterBean;

public interface MainServiceInt {
	
	public LoginBean loginUser(String userName,String pass);
	
	public RegisterBean signUp(RegisterBean reg);

	public RegisterBean fetchByUserName(String userName);

	public void saveDet(LoginBean log);

}
