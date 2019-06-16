package com.uca.capas.dto;

import java.math.BigInteger;
import java.sql.Time;

import javax.validation.constraints.Digits;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class SucursalDTO {
	
	
	private Integer IdSucursal ;
	
    @NotEmpty(message="El nombre es requerido")
    @Size(message="Ha pasado el maximo de 100 caracteres",max=100)
    private String NombreS;
	
    @NotEmpty(message="El tiempo es requerido")
    private String HoraE;
	
    @NotEmpty(message="El tiempo es requerido")
    private String HoraS;
	
    @NotEmpty(message="La ubicacion es requerida")
    @Size(message="Ha pasado el maximo de 100 caracteres",max=100)
    private String Ubicacion;
	
    @NotNull(message="El numero de mesas es requerido")
    @PositiveOrZero(message="Solo Numeros Positivos")
    @Digits(fraction = 0, integer = 8,message="Has sobrepasado el maximo")
    private BigInteger nMesas;
	
    @NotEmpty(message="El nombre de gerente es requerido")
    @Size(message="Ha pasado el maximo de 100 caracteres",max=100)
    private String nomGerente;
 
	public Time getHourE(){
		if(this.HoraE == null) {
			return null;
		}
		else {
			int hora = Integer.parseInt(HoraE.substring(0,2));
			int min = Integer.parseInt(HoraE.substring(3,5));
			Time HourE = new Time(hora,min,00);
			return HourE;
			}
	}
	
	public Time getHourS(){
		if(this.HoraS == null) {
			return null;
		}
		else {
			int hora = Integer.parseInt(HoraS.substring(0,2));
			int min = Integer.parseInt(HoraS.substring(3,5));
			Time HourS = new Time(hora,min,00);
			return HourS;
			}
	}

    public Integer getIdSucursal() {
		return IdSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		IdSucursal = idSucursal;
	}

	public String getNombreS() {
		return NombreS;
	}

	public void setNombreS(String nombreS) {
		NombreS = nombreS;
	}

	public String getHoraE() {
		return HoraE;
	}

	public void setHoraE(String horaE) {
		HoraE = horaE;
	}

	public String getHoraS() {
		return HoraS;
	}

	public void setHoraS(String horaS) {
		HoraS = horaS;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public BigInteger getnMesas() {
		return nMesas;
	}

	public void setnMesas(BigInteger nMesas) {
		this.nMesas = nMesas;
	}

	public String getNomGerente() {
		return nomGerente;
	}

	public void setNomGerente(String nomGerente) {
		this.nomGerente = nomGerente;
	}

}
