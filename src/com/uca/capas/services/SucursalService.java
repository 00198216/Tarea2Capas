package com.uca.capas.services;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.SucursalDTO;

@Service
public interface SucursalService {

	public List<Sucursal> findALL() throws DataAccessException;
	
	public Sucursal findBYID(int id) throws DataAccessException;;
	public int deleteByID(int id) throws DataAccessException;
	public SucursalDTO MapDTO(int id) throws DataAccessException;
	public int Update(SucursalDTO S) throws DataAccessException;
}
