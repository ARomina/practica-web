package ar.edu.grupoesfera.cursospring.controladores;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import ar.edu.grupoesfera.cursospring.modelo.UtilityClassParaMail;

public class MailApp extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String to = request.getParameter("to");
        String subject = request.getParameter("subject");
        String message =  request.getParameter("message");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        UtilityClassParaMail.enviarMail(to,subject, message, user, pass);
        out.println("Mail send successfully");
    }   
}