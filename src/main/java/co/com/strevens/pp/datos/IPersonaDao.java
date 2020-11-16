package co.com.strevens.pp.datos;

import co.com.strevens.pp.domain.Persona;
import java.util.List;

public interface IPersonaDao {
    //Listar todas las personas
    public List<Persona> findAllPersona();
    
    //Buscar persona por id
    public Persona findPersonaById(Persona persona);
    
    //Buscar persona por email
    public Persona findPersonaByEmail(Persona persona);
    
    //Insertar persona
    public void insertPersona(Persona persona);
    
    //Actualizar persona
    public void updatePersona(Persona persona);
    
    //Eliminar persona
    public void deletePersona(Persona persona);
}
