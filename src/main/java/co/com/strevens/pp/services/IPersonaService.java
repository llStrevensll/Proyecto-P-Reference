package co.com.strevens.pp.services;

import co.com.strevens.pp.domain.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> listarPersona();
    
    public Persona buscarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void agregarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
