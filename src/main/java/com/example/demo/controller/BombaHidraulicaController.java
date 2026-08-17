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

import com.example.demo.entity.BombaHidraulica;
import com.example.demo.service.BombaHidraulicaService;


@RestController
@RequestMapping("/api/bombas")
@CrossOrigin(origins="*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE,RequestMethod.OPTIONS})
public class BombaHidraulicaController {
	
	@Autowired
	BombaHidraulicaService bombaHidraulicaService;
	
	 @GetMapping("/{id}")
	    public Optional<BombaHidraulica> buscarPorId(@PathVariable("id") Integer id) {
	        return bombaHidraulicaService.findById(id);
	    }

	    @GetMapping("/listar")
	    public List<BombaHidraulica> listarTodos() {
	        return bombaHidraulicaService.findAll();
	    }

	    @PostMapping
	    public BombaHidraulica guardar(@RequestBody BombaHidraulica b) {
	        return bombaHidraulicaService.save(b);

	    }
	    
	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable("id") Integer id ) {
	    	bombaHidraulicaService.deleteById(id);
	    	
	    }
	    
	    @PutMapping("/actualizar/{id}")
	    public BombaHidraulica actualizar(@RequestBody BombaHidraulica b, @PathVariable("id") Integer id) {

	        BombaHidraulica eNBD = bombaHidraulicaService.findById(id).get();

	        
	        eNBD.setNombre(b.getNombre());
	        eNBD.setMarca(b.getMarca());
	        eNBD.setAlturaDinamica(b.getAlturaDinamica());
	        eNBD.setCaudal(b.getCaudal());
	        eNBD.setDiametroDeSuccion(b.getDiametroDeSuccion());
	        eNBD.setDiametroDeDescarga(b.getDiametroDeDescarga());

	        bombaHidraulicaService.save(eNBD);

	        return b;
	    }

}
