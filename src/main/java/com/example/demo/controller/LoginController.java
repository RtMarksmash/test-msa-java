package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {
	
 	@Autowired
    LoginService loginService;

    @PostMapping
    public Login guardar(@RequestBody Login l) {
        return loginService.save(l);
    }

    @PostMapping("/pass")
    public ResponseEntity<String> login(@RequestBody Login usuario) {
        String mensaje = loginService.login(usuario.getUsername(), usuario.getPassword());
        return ResponseEntity.ok(mensaje);
    }
	

}
