package com.uca.capas.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService {
	
	@Autowired
	SucursalRepository Sucursal;
	
	@Autowired
	 private EntityManager entityManager;

	@Override
	public List<Sucursal> findALL() throws DataAccessException {
		// TODO Auto-generated method stub
		return Sucursal.findAll();
	}

	@Override
	@Transactional
	public int deleteByID(int id) throws DataAccessException{
		Sucursal sucursal=null;
	   sucursal= Sucursal.findOne(id);
	   entityManager.remove(sucursal);
	   sucursal=null;
	   return 1;
		
		
	}

	@Override
	public com.uca.capas.domain.Sucursal findBYID(int id) throws DataAccessException {
		Sucursal sucursal=null;
		   sucursal= Sucursal.findOne(id);
		   return sucursal;
	}

}
