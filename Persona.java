/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinalP3;

/**
 *
 * @author Paul Jaramillo
 */
public class Persona {
    private String nombre;
    private String identificacion;
    private int edad;
    private String celular;
    private String cargo;
    
    public Persona(String nombre, String identificacion, int edad, String celular, String cargo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.celular = celular;
        this.cargo = cargo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getCelular() {
        return celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}


