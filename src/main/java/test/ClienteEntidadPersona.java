package test;

import co.com.strevens.pp.domain.Persona;
import javax.persistence.*;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;



public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoPersonalPU");//instancia de la unidad de persistencia
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        tx.begin();
        //No se debe especificar el ID  de la base de datos
        Persona persona1 = new Persona("AngelPrueba1", "RodriguezPrueba1", "correo1prueba1@email.com", 9876543, 90000);
        log.debug("Objeto a persistir: " + persona1);
        
        //Persistir el objeto
        em.persist(persona1);
        tx.commit();//finalizar transaccion
        log.debug("Objeto persistido: " + persona1);
        em.close();
    }
    
}
