package com.uca.capas.services;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Usuario;

@Service
public interface UsuarioService {
	
	public List<Usuario> findALL() throws DataAccessException;

}
