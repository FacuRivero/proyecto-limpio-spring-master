package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorPrueba {

	
	
	
	
	@RequestMapping(path ="/prueba", method= RequestMethod.GET)
	public ModelAndView mostrarPagina(@RequestParam String nombre) {
		
		
		
		ModelMap modelo = new ModelMap();
		modelo.put("nombre", nombre);
		return new ModelAndView("prueba", modelo);
		
				
	}
	
	
	@RequestMapping(path ="/index", method= RequestMethod.GET)
	public ModelAndView mostrarIndex() {
		
		
		
		ModelMap modelo = new ModelMap();
		
		return new ModelAndView("index", modelo);
		
				
	}
	
	
}
