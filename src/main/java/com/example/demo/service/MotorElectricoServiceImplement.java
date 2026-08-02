package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MotorElectrico;

@Service
public class MotorElectricoServiceImplement implements MotorElectricoService {
	
	@Autowired
	MotorElectricoService motorElectricoService;

	@Override
	public Optional<MotorElectrico> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<MotorElectrico> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MotorElectrico save(MotorElectrico m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
