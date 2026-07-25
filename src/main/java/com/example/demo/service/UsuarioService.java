package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;

@Service
public interface UsuarioService {
	public Optional<Usuario>findById(Integer id);
	public List<Usuario>findAll();
	public Usuario save(Usuario u);
	public void deleteById(Integer id);


}