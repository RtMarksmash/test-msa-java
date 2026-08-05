package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="motor_electrico")
public class MotorElectrico {
	
	@Id
	@Column(name="motor_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="motor_nombre")
	private String nombre;
	@Column(name="motor_marca")
	private String marca;
	@Column(name="amperaje")
	private Integer amperaje;
	@Column(name="voltaje")
	private Integer voltaje;
	@Column(name="motor_potencia")
	private Integer motorPotencia;
	@Column(name="rodamientos")
	private String rodamientos;
	
	
	public MotorElectrico(Integer id, String nombre, String marca, Integer amperaje, Integer voltaje,
			Integer motorPotencia, String rodamientos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.amperaje = amperaje;
		this.voltaje = voltaje;
		this.motorPotencia = motorPotencia;
		this.rodamientos = rodamientos;
	}


	public MotorElectrico() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Integer getAmperaje() {
		return amperaje;
	}


	public void setAmperaje(Integer amperaje) {
		this.amperaje = amperaje;
	}


	public Integer getVoltaje() {
		return voltaje;
	}


	public void setVoltaje(Integer voltaje) {
		this.voltaje = voltaje;
	}


	public Integer getMotorPotencia() {
		return motorPotencia;
	}


	public void setMotorPotencia(Integer motorPotencia) {
		this.motorPotencia = motorPotencia;
	}


	public String getRodamientos() {
		return rodamientos;
	}


	public void setRodamientos(String rodamientos) {
		this.rodamientos = rodamientos;
	}
	
	
	
	
}
