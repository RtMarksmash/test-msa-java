package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
		@Id
		@Column(name="usu_id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		@Column(name="usu_nombre")
		private String nombre;
		@Column(name="usu_apellido")
		private String apellido;
		@Column(name="usu_rh")
		private String tipoDeSangre;
		@Column(name="usu_cargo")
		private int cargo;
		@Column(name="usu_email")
		private String email;
		
		
		

		public Usuario(Integer id, String nombre, String apellido, String tipoDeSangre, int cargo, String email) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.tipoDeSangre = tipoDeSangre;
			this.cargo = cargo;
			this.email = email;
			
		}
		
		public Usuario() {
			super();
		}

		public int getId() {
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

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getTipoDeSangre() {
			return tipoDeSangre;
		}

		public void setTipoDeSangre(String tipoDeSangre) {
			this.tipoDeSangre = tipoDeSangre;
		}

		public int getCargo() {
			return cargo;
		}

		public void setCargo(int cargo) {
			this.cargo = cargo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
		
		

}
