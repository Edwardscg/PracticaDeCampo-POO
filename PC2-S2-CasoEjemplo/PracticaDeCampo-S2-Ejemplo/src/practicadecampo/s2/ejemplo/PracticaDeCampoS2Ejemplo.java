/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadecampo.s2.ejemplo;

/**
 *
 * @author Edward
 */
public class PracticaDeCampoS2Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un objeto Carro
        Carro miCarro = new Carro("Toyota", "Corolla", 2020);
        
        // Mostrar los datos del carro
        miCarro.mostrarDatos();
        
        // Cambiar algunos atributos usando setters
        miCarro.setMarca("Honda");
        miCarro.setModelo("Civic");
        miCarro.setAño(2022);
        
        // Volver a mostrar los datos actualizados
        miCarro.mostrarDatos();
    }
    
}
