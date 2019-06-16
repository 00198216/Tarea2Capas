package com.uca.capas.services;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;

import com.uca.capas.dto.EmpleadoDTO;



@Service
public interface EmpleadoService {
	
	public List<Empleado> findALL() throws DataAccessException;
	
	public List<Empleado> findOne(int id) throws DataAccessException;
	
	public Empleado findByID(int id) throws DataAccessException;
	
	public int deleteByID(int id) throws DataAccessException;
	
	public EmpleadoDTO MapDTO(int id) throws DataAccessException;
	
	public int Update(EmpleadoDTO E) throws DataAccessException;
	
	public EmpleadoDTO Associate(int id) throws DataAccessException;
	
	public int Add(EmpleadoDTO E) throws DataAccessException;
	

}
