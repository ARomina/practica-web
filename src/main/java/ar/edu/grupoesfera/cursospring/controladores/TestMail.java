/*package ar.edu.grupoesfera.cursospring.controladores;

import ar.edu.grupoesfera.cursospring.modelo.UtilityClassParaMail;

public class TestMail {
	
	 // SMTP server information
    String host = "smtp.gmail.com";
    String port = "587";
    String mailFrom = "user_email";
    String password = "email_pass";

    // outgoing message information
    String mailTo = "recipient_email";
    String subject = "Hello my friend";
    String message = "Hi guy, Hope you are doing well. Duke.";

    UtilityClassParaMail mailer = new UtilityClassParaMail();{

    try {
        mailer.sendPlainTextEmail(host, port, mailFrom, password, mailTo,
                subject, message);
        System.out.println("Email sent.");
    } catch (Exception ex) {
        System.out.println("Failed to sent email.");
        ex.printStackTrace();
    }
	
}
    
}*/