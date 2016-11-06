package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador{
	@RequestMapping("/cart")
	public ModelAndView vercart(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView("cart", modelo);
	}
	
	@RequestMapping("/checkout")
	public ModelAndView vercheck(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView("checkout", modelo);
	}
	
	@RequestMapping("/contact")
	public ModelAndView vercontact(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView("contact", modelo);
	}
	
	@RequestMapping("/product_detail")
	public ModelAndView verproduct_detail(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView("product_detail", modelo);
	}
	
	@RequestMapping("/products")
	public ModelAndView verproducts(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView("products", modelo);
	}
	
	@RequestMapping("/register")
	public ModelAndView verregister(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView("register", modelo);
	}
}