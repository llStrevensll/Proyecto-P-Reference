package co.com.strevens.pp.datos;

import co.com.strevens.pp.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class PersonaDaoImpl implements IPersonaDao{
    
    @PersistenceContext(unitName="ProyectoPersonalPU") //nombre definido en persistece.xml
    EntityManager em;

    @Override
    public List<Persona> findAllPersona() {
        return em.createNamedQuery("Persona.findAll").getResultList(); //retorna listado de objetos de tipo persona
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona()); //Especificar la clase y el id
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        //Crear query directamente en la clase PersonaDaoImpl
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());  //indicar el parametro
        return (Persona) query.getSingleResult(); //Unico Resultado --- query.getSingleResult(); -> retorna objeto de tipo Object, castear a Persona
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(em.merge(persona)); // Actualizar estado del objeto con merge y despues remover
    }
    
    
    
}
