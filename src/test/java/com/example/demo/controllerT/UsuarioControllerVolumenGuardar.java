package com.example.demo.controllerT;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.UsuarioController;
import com.example.demo.entity.Usuario;



@SpringBootTest 
public class UsuarioControllerVolumenGuardar {
	
	 @Autowired
	    UsuarioController usuarioController;

	    @Test
	    public void guardarVolumen() {

	        int numRegistros = 1000;

	        List<Usuario> usuarios = new ArrayList<>();

	        for (int i = 0; i < numRegistros; i++) {

	            Usuario usuario = new Usuario();
	       
	            usuario.setNombre("nombre" + i);
	            usuario.setApellido("apellido" + i);
	            usuario.setTipoDeSangre("a-" + i);
	            usuario.setCargo(i);
	            usuario.setEmail("prueba@gmail.com" + i);

	            usuarios.add(usuario);
	        }

	        usuarios.forEach(usuario ->
	                usuarioController.guardar(usuario));
	    }


}
