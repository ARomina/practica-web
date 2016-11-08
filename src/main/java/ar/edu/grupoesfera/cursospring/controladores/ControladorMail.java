package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Mail;
import ar.edu.grupoesfera.cursospring.modelo.UtilityClassParaMail;

@Controller
public class ControladorMail {

	@RequestMapping(value = "/contact")
	public ModelAndView vercontact(@ModelAttribute("mensaje")Mail mensaje){
		ModelMap modelo = new ModelMap();
		
		//Crea objeto nuevo y pone los datos ingresados en un objeto Mail
		Mail mensajeNuevo = new Mail();
		//mensajeNuevo.setNombreMail(mensaje.getNombreMail());
		//mensajeNuevo.setEmailMail(mensaje.getEmailMail());
		//mensajeNuevo.setAsuntoMail(mensaje.getAsuntoMail());
		//mensajeNuevo.setTextoMail(mensaje.getTextoMail());
		return new ModelAndView("contact", modelo); 
	}
	
	@RequestMapping(path = "/mensajeExito", method = RequestMethod.POST)
	public ModelAndView verIngresado(@ModelAttribute("mensaje")Mail mensaje){
		ModelMap modelo = new ModelMap();
		//modelo.put("nombre", mensaje.getNombreMail());
		//modelo.put("email", mensaje.getEmailMail());
		//modelo.put("texto", mensaje.getTextoMail());
		return new ModelAndView("mensajeExito", modelo);
		
		
	    
	}
	/*
		// TEMA DEL MAIL ----------------------------------------------
		// SMTP server information
	    String host = "smtp.gmail.com";
	    String port = "587";
	    String mailTo = "info.ropas.app@gmail.com";
	    String password = "ropasapp1";
	
	    // outgoing message information
	    String mailFrom = mensajeNuevo.getEmailMail();  
	    String subject = mensajeNuevo.getAsuntoMail();
	    String message = mensajeNuevo.getTextoMail();
	
	    //la utility class que se creo antes
	    UtilityClassParaMail mailer = new UtilityClassParaMail();
	    
	    //se prueba la funcion del envio del mail
	    try {
	        mailer.enviarMailSimple(host, port, mailFrom, password, mailTo,
	                subject, message);
	        return new ModelAndView("mensajeExito", modelo);
	    } catch (Exception ex) {
	        System.out.println("Failed to send email.");
	        return new ModelAndView("error", modelo);
	    }
		// FIN TEMA DEL MAIL ------------------------------------------
	
		//Pone el objeto mail en el modelo
		//modelo.put("mensaje", mensaje);
	}*/
	
	}
