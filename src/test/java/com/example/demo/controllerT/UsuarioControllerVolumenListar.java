package com.example.demo.controllerT;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.UsuarioController;
import com.example.demo.entity.Usuario;



@SpringBootTest
public class UsuarioControllerVolumenListar {
	
	@Autowired
    UsuarioController usuarioController;

    @Test
    public void ListarPorIdVolumen() {

        int registrosEsperados = 1000;

        for (int i = 1; i < registrosEsperados; i++) {

            Optional<Usuario> usuario = usuarioController.buscarPorId(i);

            assertTrue(usuario.isPresent());
        }
    }

}
