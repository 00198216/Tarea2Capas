package com.uca.capas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Usuario;
import com.uca.capas.repositories.UserRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UserRepository User;
	
	@Override
	public List<Usuario> findALL() throws DataAccessException {
		return User.findAll();
	}

}
