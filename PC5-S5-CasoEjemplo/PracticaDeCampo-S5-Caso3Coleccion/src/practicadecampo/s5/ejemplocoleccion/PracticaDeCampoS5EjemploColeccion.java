/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadecampo.s5.ejemplocoleccion;

import java.util.ArrayList;

/**
 *
 * @author Edward
 */
public class PracticaDeCampoS5EjemploColeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> lista = new ArrayList();
        Persona p1 = new Persona("73857293 ","Edward");
        Persona p2 = new Persona("62853252 ","Steven");
        Persona p3 = new Persona("62855452 ","Wasa");
        lista.add(p1);
        lista.add(p2);
        System.out.println("Lista 1: "+lista);
        lista.set(1, p3);
        System.out.println("Lista 2:" +lista);
        System.out.println("Lista 3:");
        for(Persona aux:lista){
            aux.verDtaos();
            System.out.println(aux);
        }
        for(int i=0; i<lista.size(); i++){
            System.out.println("Lista 4:" +lista.get(i));
        }
    }
}
