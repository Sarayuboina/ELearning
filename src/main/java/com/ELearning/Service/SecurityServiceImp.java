package com.ELearning.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.ELearning.bean.LoginBean;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class SecurityServiceImp implements SecurityService {

	@Override
	public Map<String, String> getAuthToken(LoginBean log) {
		// TODO Auto-generated method stub
		 String token = null;
	        token = Jwts.builder().setSubject(log.getUserName()).claim("loginId",log.getLoginId()) .setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secretkey").compact();
	        Map<String, String> tokenMap = new HashMap<>();
	        tokenMap.put("message", "token generated");
	        tokenMap.put("token", token);
	        tokenMap.put("status", HttpStatus.OK.toString());
	        return tokenMap;
	}

}
