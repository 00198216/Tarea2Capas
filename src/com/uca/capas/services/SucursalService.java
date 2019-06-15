package com.uca.capas.services;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;

@Service
public interface SucursalService {

	public List<Sucursal> findALL() throws DataAccessException;
	
	public Sucursal findBYID(int id) throws DataAccessException;;
	public int deleteByID(int id) throws DataAccessException;;
}
