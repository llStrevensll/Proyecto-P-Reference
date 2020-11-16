package co.com.strevens.pp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQueries({ //NamedQueries
    @NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p") //obtener objetos de tipo persona (JPQL)
})
@Table(name="persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L; //Variable de tipo long
    
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(generator="Secuencia_INncrementar_Idpersona") 
    @SequenceGenerator(name="Secuencia_INncrementar_Idpersona",sequenceName="SECUENCIA_INCREMENTAR_IDPERSONA", allocationSize=1) 
    @Column(name="id_persona")
    private int idPersona;
    
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private int saldo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, int telefono, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }
    
    
    
}
