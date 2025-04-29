/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadecampo.s5.ejemplosobrecarga;

/**
 *
 * @author Edward
 */
public class PracticaDeCampoS5EjemploSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraSobrecargada calculadora = new CalculadoraSobrecargada();
        
        // Sumar dos enteros
        int sumaEnteros = calculadora.sumar(5, 10);
        System.out.println("Suma de dos enteros: " + sumaEnteros);
        
        // Sumar dos decimales
        double sumaDecimales = calculadora.sumar(5.5, 10.2);
        System.out.println("Suma de dos decimales: " + sumaDecimales);
        
        // Sumar tres enteros
        int sumaTresEnteros = calculadora.sumar(1, 2, 3);
        System.out.println("Suma de tres enteros: " + sumaTresEnteros);
        
        // Sumar tres decimales
        double sumaTresDecimales = calculadora.sumar(1.1, 2.2, 3.3);
        System.out.println("Suma de tres decimales: " + sumaTresDecimales);
        
        // Sumar cuatro enteros
        int sumaCuatroEnteros = calculadora.sumar(1, 2, 3, 4);
        System.out.println("Suma de tres enteros: " + sumaTresEnteros);
        
        // Sumar cuatro decimales
        double sumaCuatroDecimales = calculadora.sumar(1.1, 2.2, 3.3, 4.4);
        System.out.println("Suma de tres decimales: " + sumaTresDecimales);
    } 
}
