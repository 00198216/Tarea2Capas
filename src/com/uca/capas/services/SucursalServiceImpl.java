package com.uca.capas.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.SucursalDTO;
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

	@Override
	public SucursalDTO MapDTO(int id) throws DataAccessException {
		Sucursal S= Sucursal.findOne(id);
		SucursalDTO Suc= new SucursalDTO();
		Suc.setIdSucursal(S.getIdSucursal());
		Suc.setNombreS(S.getNombreS());
		Suc.setHoraE(S.getnewHour());
		Suc.setHoraS(S.getnewHour2());
		Suc.setUbicacion(S.getUbicacion());
		Suc.setnMesas(S.getnMesas());
		Suc.setNomGerente(S.getNomGerente());
		return Suc;
	}

	@Override
	@Transactional
	public int Update(SucursalDTO S) throws DataAccessException {
		Sucursal sucursal= Sucursal.findOne(S.getIdSucursal());
		sucursal.setNombreS(S.getNombreS());
		sucursal.setHoraE(S.getHourE());
		sucursal.setHoraS(S.getHourS());
		sucursal.setUbicacion(S.getUbicacion());
		sucursal.setnMesas(S.getnMesas());
		sucursal.setNomGerente(S.getNomGerente());
		entityManager.merge(sucursal);
		entityManager.flush();
		return 1;
		
	}

}
