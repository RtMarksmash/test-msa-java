package com.example.demo.controllerT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.UsuarioController;
import com.example.demo.entity.Usuario;

@SpringBootTest
public class UsuarioControllerVolumenListarTodos {
	
	 	@Autowired
	    UsuarioController usuarioController;

	    @Test
	    public void listarTodosVolumen() {

	        int registrosEsperados = 1000;

	        List<Usuario> usuarios = usuarioController.listarTodos();

	        assertEquals(registrosEsperados, usuarios.size());
	    }

}
