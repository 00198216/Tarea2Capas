package com.uca.capas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService {
	
	@Autowired
	SucursalRepository Sucursal;

	@Override
	public List<Sucursal> findALL() throws DataAccessException {
		// TODO Auto-generated method stub
		return Sucursal.findAll();
	}

}
