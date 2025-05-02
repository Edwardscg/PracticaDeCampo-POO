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
public class Biblioteca{
    ArrayList<Libro> lista_libros = new ArrayList();
    ArrayList<Usuario> lista_usuarios = new ArrayList();   
    
    void RegistrarLibro(Libro libro){
   
        lista_libros.add(libro);
    }
    
    void RegistrarUsuario(Usuario u){
        lista_usuarios.add(u);
    }
    
    void PrestarLibro (String titulo_prestar, Usuario u, Libro l){
        if(u.getCantidadLibros_prestados() <= 3){
            if (l.getDisponibilidad()){
                u.setLista_libros_prestados(l);
                l.setDisponibilidad(false);
            }else{System.out.println("Libro no disponible actualmente, regrese en otro momento...");} 
        }else{System.out.println("Limite de libros alcanzado");} 
    }
    
    void DevolverLibro (String titulo_devolver, Usuario u){
        for(Libro l : lista_libros){
            if(l.getTitulo()==titulo_devolver){
                u.DevolverLibro(l); 
            }else {
                System.out.println("Libro no existente, asegurese de escribir el nombre correcto del libro a devolver");
            }
        }  
    }
    
    void LibrosDisponibles (){
        for(Libro l : lista_libros){
            if(l.getDisponibilidad() == true){
                System.out.println("Lista de Libros Disponibles: \n" + l);
            }
        }
    } 
    
    void LibrosPrestadosPorUsuario(){
        for(Usuario u : lista_usuarios){
            System.out.println("Usuario " + u.getId_user() + ":\n" + u.getNombre_user());
            System.out.println("Libros Prestados: \n");
            u.getLista_libros_prestados();
        }
    }
    
    ArrayList<Usuario> ObtenerUsuario(){
        return lista_usuarios;
    }
    
    ArrayList<Libro> ObtenerLibro(){
        return lista_libros;
    }
    
    
    
    
}
