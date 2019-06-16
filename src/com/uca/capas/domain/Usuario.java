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
	@GeneratedValue(generator="usuario_id_usuario_seq",strategy= GenerationType.AUTO)
	@SequenceGenerator(name="usuario_id_usuario_seq",sequenceName= "public.usuario_id_usuario_seq",allocationSize=1)
    @Column(name="id_Usuario")
    private Integer IdUsuario;

	@Column(name="nombreU")
     private String NombreU;
	 
	 @Column(name="correo")
     private String Correo;
	 
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
	
	 public String getCorreo() {
			return Correo;
		}

		public void setCorreo(String correo) {
			Correo = correo;
		}
	 
}
