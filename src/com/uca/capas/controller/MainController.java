package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.domain.Usuario;
import com.uca.capas.services.EmpleadoService;
import com.uca.capas.services.SucursalService;
import com.uca.capas.services.UsuarioService;



@Controller
public class MainController {
	
	@Autowired
	UsuarioService service1;
	
	@Autowired
	SucursalService service2;
	
	@Autowired
	EmpleadoService service3;

	@RequestMapping("/")
	public ModelAndView Show(){
		ModelAndView mav = new ModelAndView();
		List<Usuario> usuario = null;
		List<Sucursal> sucursal = null;
		List<Empleado> empleado= null;
	
		usuario = service1.findALL();
		sucursal= service2.findALL();
		empleado= service3.findALL();
		
		
		mav.addObject("usuario", usuario);
		mav.addObject("sucursal", sucursal);
		mav.addObject("empleado", empleado);
		mav.setViewName("Mostrar");
		
		return mav;
	}
}
