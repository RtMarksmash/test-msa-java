package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;

@Service
public interface LoginService  {
	
	
	public Login save(Login l);
	public String login(String user , String ctr);

}
