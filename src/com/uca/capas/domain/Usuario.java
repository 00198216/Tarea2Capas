package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="Usuario")
public class Usuario {
	
	@Id 
	@GeneratedValue(generator="usuario_idusuario_seq",strategy= GenerationType.AUTO)
	@SequenceGenerator(name="usuario_idusuario_seq",sequenceName= "public.usuario_idusuario_seq",allocationSize=1)
    @Column(name="id_Usuario")
    private Integer IdUsuario ;
	 
	 @Column(name="nombreU")
     private String NombreU;
	 
	 @Column(name="clave")
    private String Clave;

	public Integer getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNombreU() {
		return NombreU;
	}

	public void setNombreU(String nombreU) {
		NombreU = nombreU;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}
	 
}
