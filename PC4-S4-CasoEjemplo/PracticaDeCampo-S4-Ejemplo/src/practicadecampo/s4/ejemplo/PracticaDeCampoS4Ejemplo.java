/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadecampo.s4.ejemplo;
import java.util.Scanner;
/**
 *
 * @author Edward
 */
public class PracticaDeCampoS4Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Usuario u = new Usuario();
        Libro l = new Libro();
        Biblioteca b = new Biblioteca();
        
        System.out.println("BIENVENIDO A LA BIBLIOTECA");
        System.out.println("Que accion desea realizar?");
        
        System.out.println("1. Registrar Libro");
        System.out.println("2. Registrar Usuario");
        System.out.println("3. Prestar Libro");
        System.out.println("4. Devolver Libro");
        System.out.println("5. Ver Libros Disponibles");
        System.out.println("6. Ver Libros de un Usuario");
        System.out.println("7. Salir");
        
        
        String accion = sc.nextLine();
                 
        switch (accion){
            case "1":
                String titulo_libro = sc.nextLine();
                String autor_libro = sc.nextLine();
                l.setId_libro(b.lista_libros.size()+1);
                l.setTitulo(titulo_libro);
                l.setAutor(autor_libro);
                b.RegistrarLibro(l);

            case "2":
                String nombre_user = sc.nextLine();
                u.setId_user(b.lista_usuarios.size()+1);
                u.setNombre_user(nombre_user);
                b.RegistrarUsuario(u);
            
            case "3":
                
            
            case "4":
            
            case "5":
                
            case "6":
                
            case "7":
        }
        
    }
    
}
