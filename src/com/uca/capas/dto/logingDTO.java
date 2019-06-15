package com.uca.capas.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class logingDTO {

	@NotEmpty(message="El correo es requerido")
	@Email
	@Size(message="Ha pasado el maximo de 30 caracteres",max=100)
    private String correo;
	 
	 @NotEmpty(message="La contraseña es requerida")
	 @Size(message="Ha pasado el maximo de 30 caracteres",max=100)
     private String clave;

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}



}