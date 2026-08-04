package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MotorElectrico;
import com.example.demo.repository.MotorElectricoRepository;

@Service
public class MotorElectricoServiceImplement implements MotorElectricoService {
	
	@Autowired
	MotorElectricoRepository motorElectricoRepository;

	@Override
	public Optional<MotorElectrico> findById(Integer id) {
		// TODO Auto-generated method stub
		return motorElectricoRepository.findById(id);
	}

	@Override
	public List<MotorElectrico> findAll() {
		// TODO Auto-generated method stub
		return motorElectricoRepository.findAll();
	}

	@Override
	public MotorElectrico save(MotorElectrico m) {
		// TODO Auto-generated method stub
		return motorElectricoRepository.save(m);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		motorElectricoRepository.deleteById(id);		
	}


}
