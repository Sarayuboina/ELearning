package com.ELearning.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ELearning.bean.LoginBean;

public interface LoginDao extends JpaRepository<LoginBean, Integer> {
	
	LoginBean findByUserNameAndPwd(String username,String pwd);

}
