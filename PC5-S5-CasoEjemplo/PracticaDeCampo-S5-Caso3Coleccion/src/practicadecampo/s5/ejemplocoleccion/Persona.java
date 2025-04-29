/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadecampo.s5.ejemplocoleccion;

/**
 *
 * @author Edward
 */
public class Persona {
    private String dni;
    private String nombre;
    
    Persona(){}
    Persona(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    public String getDni() {
    return dni;
    }
    public String getNombre() {
    return nombre;
    }
    public void setDni(String dni) {
    this.dni = dni;
    }
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    public void verDtaos(){
        System.out.println("DNI: " + this.dni + "Nombre: " + this.nombre);
    }
    public String toString(){
    return "DNI:" + this.dni + "Nombre: " + this.nombre;
    }
}
