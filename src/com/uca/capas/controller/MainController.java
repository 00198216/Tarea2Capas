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
import com.uca.capas.dto.EmpleadoDTO;
import com.uca.capas.dto.SucursalDTO;
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
 	    mav.addObject("EmpleadoDTO", new EmpleadoDTO());
 	    mav.addObject("empleado", empleado);
  	     mav.addObject("sucursal", sucursal);
		 mav.setViewName("Main");
		return mav;
	}
	
	@RequestMapping(value="/Return",method= RequestMethod.POST)
	public ModelAndView back(@RequestParam(value="id") int id){
		ModelAndView mav = new ModelAndView();
		
		List<Sucursal> sucursal=null;
		sucursal=service2.findALL();
		
  	     mav.addObject("sucursal", sucursal);
		 mav.setViewName("Mostrar");
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
	
	
	@RequestMapping(value="/Edit",method= RequestMethod.POST)
	public ModelAndView Edit(@RequestParam(value="id") int id){
		ModelAndView mav = new ModelAndView();	
  	   mav.addObject("sucursalDTO",service2.MapDTO(id));
		 mav.setViewName("Edit");
		return mav;
	}
	
	@RequestMapping(value="/SaveE",method= RequestMethod.POST)
	public ModelAndView Edit2(@Valid @ModelAttribute("sucursalDTO") SucursalDTO sucursalDTO ,BindingResult result){
		ModelAndView mav = new ModelAndView();	
		
		if(result.hasErrors()) {
	    	mav.setViewName("Edit");
	       }	
		
		else {
			service2.Update(sucursalDTO);
			 List<Sucursal> sucursal = null;
	  	     sucursal = service2.findALL();
	  	     mav.addObject("sucursal", sucursal);
			mav.setViewName("Mostrar");
		}
		
		return mav;
	}
	
	
	@RequestMapping(value="/Add",method= RequestMethod.POST)
	public ModelAndView Add(){
		ModelAndView mav = new ModelAndView();	
  	   mav.addObject("sucursalDTO2",new SucursalDTO());
		 mav.setViewName("Agregar");
		return mav;
	}
	
	@RequestMapping(value="/SaveA",method= RequestMethod.POST)
	public ModelAndView Add2(@Valid @ModelAttribute("sucursalDTO2") SucursalDTO sucursalDTO2 ,BindingResult result){
		ModelAndView mav = new ModelAndView();	
		
		if(result.hasErrors()) {
	    	mav.setViewName("Agregar");
	       }	
		
		else {
			service2.Add(sucursalDTO2);
			 List<Sucursal> sucursal = null;
	  	     sucursal = service2.findALL();
	  	     mav.addObject("sucursal", sucursal);
			mav.setViewName("Mostrar");
		}
		
		return mav;
	}
	
	@RequestMapping(value="/BorrarE",method= RequestMethod.POST)
	public ModelAndView DeleteE(@RequestParam(value="id") int id){
		ModelAndView mav = new ModelAndView();	
		Empleado emp= new Empleado();
		emp=service3.findByID(id);
		
		Sucursal sucursal = null;
		sucursal=service2.findBYID(emp.getSucursal().getIdSucursal());
		
		service3.deleteByID(id);
				
		
		 List<Empleado> empleado = null;
  	     empleado = service3.findOne(sucursal.getIdSucursal());
  	     
  	     mav.addObject("sucursal", sucursal);
  	     mav.addObject("empleado", empleado);
		 mav.setViewName("Main");
		return mav;
	}
	
	@RequestMapping(value="/EditE",method= RequestMethod.POST)
	public ModelAndView EditE(@RequestParam(value="id") int id){
		ModelAndView mav = new ModelAndView();	
  	   mav.addObject("empleadoDTO",service3.MapDTO(id));
		 mav.setViewName("EditE");
		return mav;
	}
	
	@RequestMapping(value="/EditEmpl",method= RequestMethod.POST)
	public ModelAndView EditE2(@Valid @ModelAttribute("empleadoDTO") EmpleadoDTO empleadoDTO ,BindingResult result){
		ModelAndView mav = new ModelAndView();	
		
		if(result.hasErrors()) {
	    	mav.setViewName("EditE");
	       }	
		
		else {
			service3.Update(empleadoDTO);
				
				Sucursal sucursal = null;
				sucursal=service2.findBYID(empleadoDTO.getIdSucursal());
				
			 List<Empleado> empleado = null;
	  	     empleado = service3.findOne(sucursal.getIdSucursal());
	  	     
	  	     mav.addObject("sucursal", sucursal);
	  	     mav.addObject("empleado", empleado);
			 mav.setViewName("Main");
		}
		
		return mav;
	}
	
	
}
