package co.com.strevens.pp.web;

import co.com.strevens.pp.domain.Persona;
import co.com.strevens.pp.services.IPersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    @Inject
    IPersonaService personaService;
    
    //Sobreescribir metodo doGet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Persona> personas = personaService.listarPersona();
        System.out.println("personas:" + personas);
        
        request.setAttribute("personas", personas); //alcance de request
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response); 
    }
}
