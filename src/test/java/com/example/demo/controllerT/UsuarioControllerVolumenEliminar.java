package com.example.demo.controllerT;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.UsuarioController;

@SpringBootTest
public class UsuarioControllerVolumenEliminar {
	
	 	@Autowired
	    UsuarioController usuarioController;

	    @Test
	    public void EliminarVolumen() {

	        int registrosEliminar = 1000;

	        for (int i = 0; i < registrosEliminar; i++) {

	            usuarioController.eliminar(i);

	        }
	    }


}
