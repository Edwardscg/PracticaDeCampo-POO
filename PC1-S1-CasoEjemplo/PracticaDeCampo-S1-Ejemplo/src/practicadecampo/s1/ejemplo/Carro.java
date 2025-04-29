/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadecampo.s1.ejemplo;

/**
 *
 * @author Edward
 */
public class Carro {
    public String marca;
    public String modelo;
    public int año;

    public Carro(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}
