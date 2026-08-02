package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BombaHidraulica;

@Service
public class BombaHidraulicaServiceImple implements BombaHidraulicaService {
	
	BombaHidraulicaService bombaHidraulicaService;

	@Override
	public Optional<BombaHidraulica> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<BombaHidraulica> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BombaHidraulica save(BombaHidraulica b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}
