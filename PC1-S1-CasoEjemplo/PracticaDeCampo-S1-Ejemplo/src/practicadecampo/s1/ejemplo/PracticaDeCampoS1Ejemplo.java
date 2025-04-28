/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadecampo.s1.ejemplo;
import java.util.Scanner;

/**
 *
 * @author Edward
 */
public class PracticaDeCampoS1Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
    }
    
}
