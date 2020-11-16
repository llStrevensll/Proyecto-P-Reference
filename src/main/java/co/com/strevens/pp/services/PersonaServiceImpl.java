package co.com.strevens.pp.services;

import co.com.strevens.pp.datos.IPersonaDao;
import co.com.strevens.pp.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PersonaServiceImpl implements IPersonaService{
    
    @Inject
    private IPersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersona() {
        return personaDao.findAllPersona();
    }

    @Override
    public Persona buscarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void agregarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
