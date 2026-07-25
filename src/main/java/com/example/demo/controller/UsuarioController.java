package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;


@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins="*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	 @GetMapping("/{id}")
	    public Optional<Usuario> buscarPorId(@PathVariable("id") Integer id) {
	        return usuarioService.findById(id);
	    }

	    @GetMapping("/listar")
	    public List<Usuario> listarTodos() {
	        return usuarioService.findAll();
	    }

	    @PostMapping
	    public Usuario guardar(@RequestBody Usuario u) {
	        return usuarioService.save(u);

	    }
	    
	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable("id") Integer id ) {
	    	usuarioService.deleteById(id);
	    	
	    }
	    
	    @PutMapping("/actualizar/{id}")
	    public Usuario actualizar(@RequestBody Usuario u, @PathVariable("id") Integer id) {

	        Usuario eNBD = usuarioService.findById(id).get();

	        
	        eNBD.setNombre(u.getNombre());
	        eNBD.setApellido(u.getApellido());
	        eNBD.setTipoDeSangre(u.getTipoDeSangre());
	        eNBD.setCargo(u.getCargo());
	        eNBD.setEmail(u.getEmail());

	        usuarioService.save(eNBD);

	        return u;
	    }

}
