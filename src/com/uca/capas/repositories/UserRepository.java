package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer>{
  
	public List<Usuario> findAll();
	
	@Query(nativeQuery= true,value="select * "
			+"from Usuario "
			+ "where correo = ?1 and clave = ?2")
    public Usuario findUsuarioyContraseña(String correo, String clave);
}
