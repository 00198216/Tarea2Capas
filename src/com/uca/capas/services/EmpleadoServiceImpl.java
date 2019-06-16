package com.uca.capas.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.EmpleadoDTO;
import com.uca.capas.repositories.EmpleadoRepository;
import com.uca.capas.repositories.SucursalRepository;


@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	EmpleadoRepository Empleado;
	

	@Autowired
	SucursalRepository Sucursal;
	
	@Autowired
	 private EntityManager entityManager;
	
	@Override
	public List<Empleado> findALL() throws DataAccessException {
		// TODO Auto-generated method stub
		return Empleado.findAll();
	}


	@Override
	public List<Empleado> findOne(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		return Empleado.findOne(id);
	}


	@Override
	@Transactional
	public int deleteByID(int id) throws DataAccessException {
		Empleado empleado=null;
		empleado=Empleado.getOne(id);
		 entityManager.remove(empleado);
		 empleado=null;
		return 1;
	}


	@Override
	public com.uca.capas.domain.Empleado findByID(int id) throws DataAccessException {
		Empleado empleado=null;
		empleado=Empleado.findUser(id);
		return empleado;
	}


	@Override
	public EmpleadoDTO MapDTO(int id) throws DataAccessException {
		Empleado empleado=Empleado.findUser(id);
		EmpleadoDTO E = new EmpleadoDTO();
		E.setIdEmpleado(empleado.getIdEmpleado());
		E.setNombreE(empleado.getNombreE());
		E.setEdad(empleado.getEdad());
		E.setGenero(empleado.getGenderE());
		E.setEstado(empleado.getEstadoE());
		E.setIdSucursal(empleado.getSucursal().getIdSucursal());
		return E;
	}


	@Override
	@Transactional
	public int Update(EmpleadoDTO E) throws DataAccessException {
		Empleado empleado= Empleado.findUser(E.getIdEmpleado());
		empleado.setNombreE(E.getNombreE());
		empleado.setEdad(E.getEdad());
		empleado.setGenero(E.getGeneroE());
		empleado.setEstado(E.getEstadoE());
		entityManager.merge(empleado);
		entityManager.flush();
		
		return 1;
	}


	@Override
	public EmpleadoDTO Associate(int id) throws DataAccessException {
		EmpleadoDTO E = new EmpleadoDTO();
		E.setIdSucursal(id);
		return E;
	}


	@Override
	@Transactional
	public int Add(EmpleadoDTO E) throws DataAccessException {
		Empleado empleado= new Empleado();
		empleado.setNombreE(E.getNombreE());
		empleado.setEdad(E.getEdad());
		empleado.setGenero(E.getGeneroE());
		empleado.setEstado(E.getEstadoE());
		empleado.setSucursal(Sucursal.findOne(E.getIdSucursal()));
		entityManager.persist(empleado);
		entityManager.flush();
		return 1;
	}


}
