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
    private ArrayList<Libro> lista_libros = new ArrayList<>();
    private ArrayList<Usuario> lista_usuarios = new ArrayList<>();

    void RegistrarLibro(Libro libro) {
        lista_libros.add(libro);
    }

    void RegistrarUsuario(Usuario u) {
        lista_usuarios.add(u);
    }

    void PrestarLibro(String titulo_prestar, Usuario u, Libro l) {
        if (u.getCantidadLibros_prestados() < 3) {
            if (l.getDisponibilidad()) {
                u.AdquirirLibro(l);
                l.setDisponibilidad(false);
                System.out.println("Libro prestado con éxito.");
            } else {
                System.out.println("Libro no disponible actualmente.");
            }
        } else {
            System.out.println("Limite de libros alcanzado.");
        }
    }

    void DevolverLibro(String titulo_devolver, Usuario u) {
        for (Libro l : lista_libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo_devolver)) {
                if (u.getLista_libros_prestados().contains(l)) {
                    u.DevolverLibro(l);
                    l.setDisponibilidad(true);
                    System.out.println("Libro devuelto con éxito.");
                    return;
                } else {
                    System.out.println("Este usuario no tiene prestado este libro.");
                    return;
                }
            }
        }
        System.out.println("Libro no encontrado.");
    }

    void LibrosDisponibles() {
        System.out.println("Lista de Libros Disponibles:");
        for (Libro l : lista_libros) {
            if (l.getDisponibilidad()) {
                System.out.println(l);
            }
        }
    }

    Usuario buscarUsuarioPorId(int id) {
        for (Usuario u : lista_usuarios) {
            if (u.getId_user() == id) return u;
        }
        return null;
    }

    Libro buscarLibroPorTitulo(String titulo) {
        for (Libro l : lista_libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) return l;
        }
        return null;
    }

    ArrayList<Usuario> ObtenerUsuario() {
        return lista_usuarios;
    }

    ArrayList<Libro> ObtenerLibro() {
        return lista_libros;
    }
    
    
    
    
}
