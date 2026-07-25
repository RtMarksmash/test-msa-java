package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioServiceImple implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario save(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(u);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
		
	}

}
