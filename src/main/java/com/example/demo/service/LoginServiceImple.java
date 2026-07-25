package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginServiceImple implements LoginService{

	@Autowired
	LoginRepository loginRepository;

	@Override
	public Login save(Login l) {
		// TODO Auto-generated method stub
		return loginRepository.save(l);
	}

	@Override
	public String login(String user, String ctr) {
		// TODO Auto-generated method stub
		Login usuario = loginRepository.findByUsername(user);
		
		if(usuario==null  ) {
			
			return "usuario no encontrado";
			
		}
		
		if(!usuario.getPassword().equals(ctr)) {
			
			return "contraseña no coincide";
		}
		
		return "inicio exitoso te haz logueado";
	}

	
}
