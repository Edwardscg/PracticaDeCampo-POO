/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadecampo.s3.ejemplo;

/**
 *
 * @author Edward
 */
public class PracticaDeCampoS3Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de RegistrarDatos sin parámetros
        RegistrarDatos persona1 = new RegistrarDatos();
        // Establecer los valores usando los setters
        persona1.setNombre("Edward");
        persona1.setEdad(20);
        
        // Mostrar los datos utilizando los getters
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        
        // Crear otro objeto con parámetros en el constructor
        RegistrarDatos persona2 = new RegistrarDatos("Steven", 25);
        
        // Mostrar los datos del segundo objeto
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
    }
    
}
