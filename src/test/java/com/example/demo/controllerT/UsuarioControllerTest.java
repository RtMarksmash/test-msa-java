package com.example.demo.controllerT;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.controller.UsuarioController;
import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;




@ExtendWith(MockitoExtension.class)
public class UsuarioControllerTest {

	@InjectMocks
	private UsuarioController usuarioController;
	
	@Mock
	private UsuarioService usuarioService;
	
	@Test
	public void pruebaBuscarPorId() {
		
		Usuario usuarioSimulado = new Usuario();
		
		usuarioSimulado.setId(1);
		usuarioSimulado.setNombre("jorge");
		usuarioSimulado.setApellido("mora");
		usuarioSimulado.setTipoDeSangre("o+");
		usuarioSimulado.setCargo(2);
		usuarioSimulado.setEmail("jorge@gmail.com");
		
		when(usuarioService.findById(1)).thenReturn(Optional.of(usuarioSimulado));
		
		Optional<Usuario> resultado= usuarioController.buscarPorId(1);
		
		assertNotNull(resultado);
		assertTrue(resultado.isPresent());
		
		
		
	}
	
	@Test
	public void pruebasListarTodos() {
		
		Usuario usuario1 = new Usuario(1,"mario" , "mora", "o+",2,"jorge@gmail.com");
		Usuario usuario2 = new Usuario(2,"diego", "mora", "a+", 1,"diego@gmail.com");
		
		List<Usuario> listaUsuario = new ArrayList<>();
		
		listaUsuario.add(usuario1);
		listaUsuario.add(usuario2);
		
		when(usuarioService.findAll()).thenReturn(listaUsuario);
		
		List<Usuario> resultado = usuarioController.listarTodos();
		
		assertNotNull(resultado);
		assertEquals(2,resultado.size());
		assertTrue(resultado.contains(usuario1));
		assertTrue(resultado.contains(usuario2));
		
		
	}
	
	@Test
	public void pruebaEliminar() {
		int codigo = 1;
		
		usuarioController.eliminar(codigo);
		
		verify(usuarioService, times(1)).deleteById(codigo);
		
	}
	
	@Test
	public void pruebaActualizar() {

	    int codigo = 2;

	    Usuario usuarioExistente = new Usuario(codigo, "pedro", "barajas","a+", 1 ,"pedro@gmail.com" );
	    Usuario usuarioActualizado = new Usuario(codigo, "alberto", "ramirez","b-", 2 , "ror@gmail.com");

	    when(usuarioService.findById(codigo))
	            .thenReturn(Optional.of(usuarioExistente));

	    when(usuarioService.save(any(Usuario.class)))
	            .thenReturn(usuarioActualizado);

	    Usuario resultado = usuarioController.actualizar( usuarioActualizado, codigo);

	    assertEquals("alberto", resultado.getNombre());
	    assertEquals("ramirez", resultado.getApellido());
	    assertEquals(2, resultado.getCargo());
	    assertEquals("b-", resultado.getTipoDeSangre());
	    assertEquals("ror@gmail.com", resultado.getEmail());

	    verify(usuarioService, times(1)).findById(codigo);
	    verify(usuarioService, times(1)).save(any(Usuario.class));
	}

	
}
