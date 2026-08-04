package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BombaHidraulica;
import com.example.demo.repository.BombaHidraulicaRepository;


@Service
public class BombaHidraulicaServiceImple implements BombaHidraulicaService {
	
	@Autowired
	BombaHidraulicaRepository bombaHidraulicaRepository;

	@Override
	public Optional<BombaHidraulica> findById(Integer id) {
		// TODO Auto-generated method stub
		return bombaHidraulicaRepository.findById(id);
	}

	@Override
	public List<BombaHidraulica> findAll() {
		// TODO Auto-generated method stub
		return bombaHidraulicaRepository.findAll();
	}

	@Override
	public BombaHidraulica save(BombaHidraulica b) {
		// TODO Auto-generated method stub
		return bombaHidraulicaRepository.save(b);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
