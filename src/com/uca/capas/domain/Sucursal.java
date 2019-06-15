package com.uca.capas.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.sql.Time;
import java.util.List;

@Entity
@Table(schema="public",name="Sucursal")
public class Sucursal {
	
	@Id 
	@GeneratedValue(generator="sucursal_idsucursal_seq",strategy= GenerationType.AUTO)
	@SequenceGenerator(name="sucursal_idsucursal_seq",sequenceName= "public.sucursal_idsucursal_seq",allocationSize=1)
    @Column(name="id_Sucursal")
    private Integer IdSucursal ;
	
	@Column(name="nombreS")
    private String NombreS;
	
	@Column(name="horaE")
    private Time HoraE;
	
	@Column(name="horaS")
    private Time HoraS;
	
	@Column(name="Ubicacion")
    private String Ubicacion;
	
	@Column(name="nMesas")
    private Integer nMesas;
	
	@Column(name="nomGerente")
    private String nomGerente;
	
	@OneToMany(mappedBy="sucursal",fetch= FetchType.LAZY,orphanRemoval=true,cascade=CascadeType.PERSIST)
	private List<Empleado> empleados;
	
	public String getnewHour(){
		 return (String) HoraE.toString().subSequence(0,5);
		}
	public String getnewHour2(){
		 return (String) HoraS.toString().subSequence(0,5);
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

	public Time getHoraE() {
		return HoraE;
	}

	public void setHoraE(Time horaE) {
		HoraE = horaE;
	}

	public Time getHoraS() {
		return HoraS;
	}

	public void setHoraS(Time horaS) {
		HoraS = horaS;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public Integer getnMesas() {
		return nMesas;
	}

	public void setnMesas(Integer nMesas) {
		this.nMesas = nMesas;
	}

	public String getNomGerente() {
		return nomGerente;
	}

	public void setNomGerente(String nomGerente) {
		this.nomGerente = nomGerente;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
