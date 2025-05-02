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
public class Usuario {
    
    private int id_user;
    private String nombre_user;
    private int cantidad_libros_prestados;
    
    private ArrayList<Libro> lista_libros_prestados = new ArrayList();

    public ArrayList<Libro> getLista_libros_prestados() {
        return lista_libros_prestados;
    }

    public void setLista_libros_prestados(Libro l) {
        this.lista_libros_prestados.add(l);
    }
    
    
    
    void AdquirirLibro (Libro libro){
        lista_libros_prestados.add(libro);
        this.cantidad_libros_prestados += 1;
    }
    void DevolverLibro (Libro libro){
        lista_libros_prestados.remove(libro);
        this.cantidad_libros_prestados -= 1;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public int getCantidadLibros_prestados() {
        return cantidad_libros_prestados;
    }

    public void setCantidadLibros_prestados(int libros_prestados) {
        this.cantidad_libros_prestados = libros_prestados;
    }
    
    
}
