package com.ELearning.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ELearning.bean.RegisterBean;

public interface RegisterDao extends JpaRepository<RegisterBean,Integer>{

	RegisterBean findByUserName(String userName);

}
