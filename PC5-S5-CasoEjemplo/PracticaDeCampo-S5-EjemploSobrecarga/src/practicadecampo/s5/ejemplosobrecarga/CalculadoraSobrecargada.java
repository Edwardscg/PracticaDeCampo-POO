/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadecampo.s5.ejemplosobrecarga;

/**
 *
 * @author Edward
 */
public class CalculadoraSobrecargada {
    // Método para sumar números enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar números decimales
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Método para sumar tres números enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Método para sumar tres números decimales
    public double sumar(double a, double b, double c) {
        return a + b + c;
    }
}
