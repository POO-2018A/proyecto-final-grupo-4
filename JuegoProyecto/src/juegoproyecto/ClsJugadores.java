/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoproyecto;
import java.io.Serializable;
/**
 *
 * @author Usuario
 */
public class ClsJugadores implements Serializable {
    
    private String nombre; 
    private String apellido;
    private String cedula;
    private String usuario;
    private int id; 
    public ClsJugadores() {
    }
    
    

    public ClsJugadores(int id, String nombre, String apellido, String cedula, String usuario) {
        this.id= id; 
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return this.id + " " + this.usuario; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
