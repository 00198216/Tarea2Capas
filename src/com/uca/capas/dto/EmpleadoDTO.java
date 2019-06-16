package com.uca.capas.dto;

import java.math.BigInteger;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class EmpleadoDTO {
	
private Integer IdEmpleado ;
	
    @NotEmpty(message="El nombre es requerido")
    @Size(message="Ha pasado el maximo de 100 caracteres",max=100)
    private String NombreE;
	
    @NotNull(message="La edad es requerida")
    @PositiveOrZero(message="Solo Numeros Positivos")
    @Digits(fraction = 0, integer = 2,message="formato de edad erronea. Solo dos digitos")
    @Range(min=18,max=75,message="Favor ingresar dentro del rango de 18 a 75")
    private BigInteger Edad;
	
    @NotEmpty(message="El genero es requerido")
    private String Genero;
	
    @NotEmpty(message="El estado es requerido")
    private String Estado;
    
    private Integer IdSucursal;
	
    public boolean getEstadoE() {
		if(this.Estado.equals("Activo")) {
		return true;
	               }
		else {
			return false;
			}
		}
    
    public boolean getGeneroE() {
		if(this.Genero.equals("Masculino")) {
		return true;
	               }
		else {
			return false;
			}
		}

	public Integer getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getNombreE() {
		return NombreE;
	}

	public void setNombreE(String nombreE) {
		NombreE = nombreE;
	}

	public BigInteger getEdad() {
		return Edad;
	}

	public void setEdad(BigInteger edad) {
		Edad = edad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getIdSucursal() {
		return IdSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		IdSucursal = idSucursal;
	}

}
