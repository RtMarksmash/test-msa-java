package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.MotorElectrico;

@Service
public interface MotorElectricoService {
	
	public Optional<MotorElectrico>findById(Integer id);
	public List<MotorElectrico>findAll();
	public MotorElectrico save(MotorElectrico m);
	public void deleteById(Integer id);

}
