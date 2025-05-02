/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadecampo.s4.ejemplo;
import java.util.ArrayList;
/**
 *
 * @author Edward
 */
public class Libro {
    private int id_libro;
    private String titulo;
    private String autor;
    private boolean disponibilidad;
    
    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
        
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean dispo) {
        
        this.disponibilidad = dispo;
    }
    
    void Disponibilidad(Usuario u, Libro l){
        if(u.getLista_libros_prestados().contains(l)){
            this.disponibilidad = false;
        }else{
            this.disponibilidad = true;
        }
        
    }
    
    
    
}
