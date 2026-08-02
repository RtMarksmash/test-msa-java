package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BombaHidraulica;


@Service
public interface BombaHidraulicaService {
	
	public Optional<BombaHidraulica>findById(Integer id);
	public List<BombaHidraulica>findAll();
	public BombaHidraulica save(BombaHidraulica b);
	public void deleteById(Integer id);
}
