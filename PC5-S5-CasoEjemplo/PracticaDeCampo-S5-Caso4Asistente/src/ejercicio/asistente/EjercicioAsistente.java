/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.asistente;
import java.util.Scanner;

/**
 *
 * @author UCLAB310
 */
public class EjercicioAsistente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean edadValida = false;
        
        AsistenteControlador controla = new AsistenteControlador();
        
        String rpta = "si";
        while (rpta.equals("si")) {
            Asistente a = new Asistente();
            while (a.getTipoDocumento() == null) {
                System.out.println("Ingrese el tipo de documento");
                a.setTipoDocumento(sc.nextLine().toUpperCase());
            }
            while (a.getNumeroDocumento() == null) {
                System.out.println("Ingrese el número de documento");
                a.setNumeroDocumento(sc.nextLine());
            }
            System.out.println("Ingrese el Apellido Paterno");
            a.setApellidoPaterno(sc.nextLine());
            System.out.println("Ingrese el Apellido Materno");
            a.setApellidoMaterno(sc.nextLine());
            System.out.println("Ingrese el Nombre");
            a.setNombre(sc.nextLine());
            System.out.println("Ingrese el número de celular");
            a.setCelular(sc.nextLine());
            System.out.println("Ingrese el correo electrónico");
            a.setCorreo(sc.nextLine());
            while (!edadValida) {
            System.out.print("Ingrese su edad: ");
            String entrada = sc.nextLine();

            try {
                int edad = Integer.parseInt(entrada);
                if (edad > 0 && edad <= 100) {
                    a.setEdad(edad);
                    a.categorizarPorEdad();
                    edadValida = true;
                    break;// Sale del bucle si todo es correcto
                } else {
                    System.out.println("Error: la edad debe estar entre 1 y 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }
            sc.nextLine(); // Limpiar buffer
            controla.agregarAsistente(a);
            System.out.println("Desea ingresar otro asistente: si/no");
            rpta = sc.nextLine();
            System.out.println(rpta);
        }
        controla.listarAsistentes();
    }
}

    

