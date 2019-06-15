package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.logingDTO;
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
	
	@RequestMapping(value= "/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("loginDTO", new logingDTO());
		mav.setViewName("Login");
		return mav;
	}
	
	@RequestMapping(value= "/Login" ,method= RequestMethod.POST)
	public ModelAndView Login(@Valid @ModelAttribute("loginDTO") logingDTO loginDTO ,BindingResult result) {
		ModelAndView mav = new ModelAndView();
       if(result.hasErrors() || service1.findUsuarioyContraseña(loginDTO.getCorreo(), loginDTO.getClave())==null) {
    	   mav.setViewName("Login");
       }	
       else {
    	   List<Sucursal> sucursal = null;
    	   sucursal = service2.findALL();
    	   mav.addObject("sucursal", sucursal);
    	   mav.setViewName("Mostrar");
    	   
       }
		return mav;
	}
	
	@RequestMapping(value="/Perfil",method= RequestMethod.POST)
	public ModelAndView Ver(@RequestParam(value="id") int id){
		ModelAndView mav = new ModelAndView();
		
		Sucursal sucursal=null;
		sucursal=service2.findBYID(id);
		
		List<Empleado> empleado = null;
 	     empleado = service3.findOne(id);
		
 	    mav.addObject("empleado", empleado);
  	     mav.addObject("sucursal", sucursal);
		 mav.setViewName("Main");
		return mav;
	}
	
	@RequestMapping(value="/Delete",method= RequestMethod.POST)
	public ModelAndView Delete(@RequestParam(value="id") int id){
		ModelAndView mav = new ModelAndView();	
		service2.deleteByID(id);
		 List<Sucursal> sucursal = null;
  	     sucursal = service2.findALL();
  	     mav.addObject("sucursal", sucursal);
		 mav.setViewName("Mostrar");
		return mav;
	}
	
	
	
	
}
