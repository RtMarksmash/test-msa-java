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
	private String bombaNombre;
	@Column(name="bomba_marca")
	private String bombaMarca;
	@Column(name="altura_dinamica")
	private Integer alturaDinamica;
	@Column(name="caudal")
	private Integer caudal;
	@Column(name="diametro_succion")
	private Integer diametroSuccion;
	@Column(name="diametro_descarga")
	private String diametroDescarga;
	
	
	public BombaHidraulica(Integer id, String bombaNombre, String bombaMarca, Integer alturaDinamica, Integer caudal,
			Integer diametroSuccion, String diametroDescarga) {
		super();
		this.id = id;
		this.bombaNombre = bombaNombre;
		this.bombaMarca = bombaMarca;
		this.alturaDinamica = alturaDinamica;
		this.caudal = caudal;
		this.diametroSuccion = diametroSuccion;
		this.diametroDescarga = diametroDescarga;
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


	public String getBombaNombre() {
		return bombaNombre;
	}


	public void setBombaNombre(String bombaNombre) {
		this.bombaNombre = bombaNombre;
	}


	public String getBombaMarca() {
		return bombaMarca;
	}


	public void setBombaMarca(String bombaMarca) {
		this.bombaMarca = bombaMarca;
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


	public Integer getDiametroSuccion() {
		return diametroSuccion;
	}


	public void setDiametroSuccion(Integer diametroSuccion) {
		this.diametroSuccion = diametroSuccion;
	}


	public String getDiametroDescarga() {
		return diametroDescarga;
	}


	public void setDiametroDescarga(String diametroDescarga) {
		this.diametroDescarga = diametroDescarga;
	}
	
	
	
	
}
