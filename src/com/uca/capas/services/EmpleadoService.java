package com.uca.capas.services;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;


@Service
public interface EmpleadoService {
	
	public List<Empleado> findALL() throws DataAccessException;
	
	public List<Empleado> findOne(int id) throws DataAccessException;

}
