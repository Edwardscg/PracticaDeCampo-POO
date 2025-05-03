/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadecampo.s4.ejemplo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Edward
 */
public class PracticaDeCampoS4Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();

        System.out.println("BIENVENIDO A LA BIBLIOTECA");

        while (true) {
            System.out.println("\nQue accion desea realizar?");
            System.out.println("1. Registrar Libro");
            System.out.println("2. Registrar Usuario");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("5. Ver Libros Disponibles");
            System.out.println("6. Ver Libros de un Usuario");
            System.out.println("7. Salir");

            String accion = sc.nextLine();

            switch (accion) {
                case "1":
                    System.out.print("Ingrese el título del libro: ");
                    String titulo_libro = sc.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor_libro = sc.nextLine();
                    Libro nuevoLibro = new Libro();
                    nuevoLibro.setId_libro(b.ObtenerLibro().size() + 1);
                    nuevoLibro.setTitulo(titulo_libro);
                    nuevoLibro.setAutor(autor_libro);
                    nuevoLibro.setDisponibilidad(true);
                    b.RegistrarLibro(nuevoLibro);
                    System.out.println("Libro registrado con éxito.");
                    break;

                case "2":
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombre_user = sc.nextLine();
                    Usuario nuevoUsuario = new Usuario();
                    nuevoUsuario.setId_user(b.ObtenerUsuario().size() + 1);
                    nuevoUsuario.setNombre_user(nombre_user);
                    b.RegistrarUsuario(nuevoUsuario);
                    System.out.println(nuevoUsuario);
                    System.out.println("Usuario registrado con éxito.");
                    break;

                case "3":
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String titulo_prestar = sc.nextLine();
                    System.out.print("Ingrese el id del usuario que pide el préstamo: ");
                    int id_usuario_prestar = Integer.parseInt(sc.nextLine());
                    Usuario usuario_prestar = b.buscarUsuarioPorId(id_usuario_prestar);

                    if (usuario_prestar != null) {
                        Libro libro_a_prestar = b.buscarLibroPorTitulo(titulo_prestar);
                        if (libro_a_prestar != null) {
                            b.PrestarLibro(titulo_prestar, usuario_prestar, libro_a_prestar);
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case "4":
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String titulo_devolver = sc.nextLine();
                    System.out.print("Ingrese el ID del usuario que devuelve el libro: ");
                    int id_usuario_devolver = Integer.parseInt(sc.nextLine());
                    Usuario usuario_devolver = b.buscarUsuarioPorId(id_usuario_devolver);

                    if (usuario_devolver != null) {
                        b.DevolverLibro(titulo_devolver, usuario_devolver);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case "5":
                    b.LibrosDisponibles();
                    break;

                case "6":
                    System.out.print("Ingrese el ID del usuario para ver sus libros prestados: ");
                    int id_usuario_libros = Integer.parseInt(sc.nextLine());
                    Usuario usuario_libros = b.buscarUsuarioPorId(id_usuario_libros);
                    if (usuario_libros != null) {
                        System.out.println("Libros prestados por " + usuario_libros.getNombre_user() + ":");
                        for (Libro libro_prestado : usuario_libros.getLista_libros_prestados()) {
                            System.out.println("- " + libro_prestado.getTitulo());
                        }
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case "7":
                    System.out.println("Saliendo del sistema...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opcion no valida, intente de nuevo");
            }
        }

    }

}
