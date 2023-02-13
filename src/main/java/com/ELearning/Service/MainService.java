package com.ELearning.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ELearning.DAO.LoginDao;
import com.ELearning.DAO.RegisterDao;
import com.ELearning.bean.LoginBean;
import com.ELearning.bean.RegisterBean;

public class MainService implements MainServiceInt {
  
	@Autowired
	LoginDao lg;
	
	@Autowired
	RegisterDao rg;
	
	@Override
	public LoginBean loginUser(String userName, String pass) {
		// TODO Auto-generated method stub
		return lg.findByUserNameAndPwd(userName, pass);
		 
		
	}

	@Override
	public RegisterBean signUp(RegisterBean reg) {
		// TODO Auto-generated method stub
		return rg.save(reg) ;
	}

	@Override
	public RegisterBean fetchByUserName(String userName) {
		// TODO Auto-generated method stub
		return rg.findByUserName(userName);
	}

	@Override
	public void saveDet(LoginBean log) {
		// TODO Auto-generated method stub
		
		lg.save(log);
		
	}
	
	

}
