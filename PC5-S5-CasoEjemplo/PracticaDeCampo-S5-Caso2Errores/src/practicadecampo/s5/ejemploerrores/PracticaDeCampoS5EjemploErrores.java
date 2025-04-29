/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadecampo.s5.ejemploerrores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Edward
 */
public class PracticaDeCampoS5EjemploErrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa que captura excepciones de lecctura y busqueda de archivo de texto
        BufferedReader bf;
        try {
            bf = new BufferedReader (new FileReader("C:\\Users\\UCLAB310\\Downloads\\wasa.txt"));
            try {
                String linea;
                while ((linea=bf.readLine()) !=null) {
                    System.out.println(linea);
                }           
            } catch (IOException ex) {
                /*Logger.getLogger(Ejem_04Exepcion.class.getName()).log(Level.SEVERE, null, ex);*/
                System.out.println("No se pudo encontrar el archivo wasa");
            }
        } catch (FileNotFoundException ex) {
            /*Logger.getLogger(Ejem_04Exepcion.class.getName()).log(Level.SEVERE, null, ex);*/
            System.out.println("No se pudo leer el archivo wasa");
        }
        
        // Programa que captura errores de ingreso de números para una división
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Ingresa un numero");
        int n1 = sc.nextInt();
        System.out.println("Ingresa un numero");
        int n2 = sc.nextInt();
        int rpt=n1/n2;
        }catch(ArithmeticException e){
            System.out.println("Nose puede divir entre 0");
        }catch(InputMismatchException e){
            System.out.println("Ingreso de tipo de dato incorrecto");
        }
    }
}
