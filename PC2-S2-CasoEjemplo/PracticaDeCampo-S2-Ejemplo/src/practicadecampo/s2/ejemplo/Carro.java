/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadecampo.s2.ejemplo;

/**
 *
 * @author Edward
 */
public class Carro {
    // Atributos privados (encapsulamiento)
    private String marca;
    private String modelo;
    private int año;
    
    // Constructor
    public Carro(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    // Getters (Métodos para obtener datos)
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAño() {
        return año;
    }
    
    // Setters (Métodos para modificar datos)
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    
    // Método para mostrar los datos del carro
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
