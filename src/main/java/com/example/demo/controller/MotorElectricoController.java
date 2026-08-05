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

import com.example.demo.entity.MotorElectrico;
import com.example.demo.service.MotorElectricoService;


@RestController
@RequestMapping("/api/motores")
@CrossOrigin(origins="*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MotorElectricoController {
	
	@Autowired
	MotorElectricoService motorElectricoService;
	
	 @GetMapping("/{id}")
	    public Optional<MotorElectrico> buscarPorId(@PathVariable("id") Integer id) {
	        return motorElectricoService.findById(id);
	    }

	    @GetMapping("/listar")
	    public List<MotorElectrico> listarTodos() {
	        return motorElectricoService.findAll();
	    }

	    @PostMapping
	    public MotorElectrico guardar(@RequestBody MotorElectrico m) {
	        return motorElectricoService.save(m);

	    }
	    
	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable("id") Integer id ) {
	    	motorElectricoService.deleteById(id);
	    	
	    }
	    
	    @PutMapping("/actualizar/{id}")
	    public MotorElectrico actualizar(@RequestBody MotorElectrico m, @PathVariable("id") Integer id) {

	        MotorElectrico eNBD = motorElectricoService.findById(id).get();

	        
	        eNBD.setNombre(m.getNombre());
	        eNBD.setMarca(m.getMarca());
	        eNBD.setAmperaje(m.getAmperaje());
	        eNBD.setVoltaje(m.getVoltaje());
	        eNBD.setMotorPotencia(m.getMotorPotencia());
	        eNBD.setRodamientos(m.getRodamientos());

	        motorElectricoService.save(eNBD);

	        return m;
	    }


}
