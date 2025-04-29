/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.asistente;
import java.util.ArrayList;

/**
 *
 * @author UCLAB310
 */
public class AsistenteControlador {

    ArrayList<Asistente> lista_asistentes = new ArrayList();

    void agregarAsistente(Asistente a) {
        lista_asistentes.add(a);
    }

    void listarAsistentes() {
        System.out.println("La lista de asistentes es:");
        for (Asistente asistente : lista_asistentes) {
            asistente.verAsistente();
        }
    }
}
