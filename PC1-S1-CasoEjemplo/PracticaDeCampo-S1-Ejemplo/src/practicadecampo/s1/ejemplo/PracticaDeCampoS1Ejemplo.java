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
        ControladorCarros controlador = new ControladorCarros();

        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);

        controlador.agregarCarro(carro1);
        controlador.agregarCarro(carro2);

        controlador.listarCarros();

    }
    
}
