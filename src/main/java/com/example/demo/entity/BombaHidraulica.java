package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bomba_hidraulica")
public class BombaHidraulica {

	@Id
	@Column(name="bomba_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="bomba_nombre")
	private String nombre;
	@Column(name="bomba_marca")
	private String marca;
	@Column(name="altura_dinamica")
	private Integer alturaDinamica;
	@Column(name="caudal")
	private Integer caudal;
	@Column(name="diametro_succion")
	private Integer diametroDeSuccion;
	@Column(name="diametro_descarga")
	private Integer diametroDeDescarga;
	
	
	public BombaHidraulica(Integer id, String nombre, String marca, Integer alturaDinamica, Integer caudal,
			Integer diametroDeSuccion, Integer diametroDeDescarga) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.alturaDinamica = alturaDinamica;
		this.caudal = caudal;
		this.diametroDeSuccion = diametroDeSuccion;
		this.diametroDeDescarga = diametroDeDescarga;
	}


	public BombaHidraulica() {
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


	public Integer getAlturaDinamica() {
		return alturaDinamica;
	}


	public void setAlturaDinamica(Integer alturaDinamica) {
		this.alturaDinamica = alturaDinamica;
	}


	public Integer getCaudal() {
		return caudal;
	}


	public void setCaudal(Integer caudal) {
		this.caudal = caudal;
	}


	public Integer getDiametroDeSuccion() {
		return diametroDeSuccion;
	}


	public void setDiametroDeSuccion(Integer diametroDeSuccion) {
		this.diametroDeSuccion = diametroDeSuccion;
	}


	public Integer getDiametroDeDescarga() {
		return diametroDeDescarga;
	}


	public void setDiametroDeDescarga(Integer diametroDeDescarga) {
		this.diametroDeDescarga = diametroDeDescarga;
	}
	
	

	
}
