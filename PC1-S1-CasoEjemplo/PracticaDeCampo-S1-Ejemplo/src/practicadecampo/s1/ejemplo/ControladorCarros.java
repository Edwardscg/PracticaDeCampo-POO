/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadecampo.s1.ejemplo;
import java.util.ArrayList;

/**
 *
 * @author Edward
 */
public class ControladorCarros {
    public ArrayList<Carro> ListaCarros = new ArrayList<>();

    public void agregarCarro(Carro carro) {
        ListaCarros.add(carro);
    }

    public void listarCarros() {
        if (ListaCarros.isEmpty()) {
            System.out.println("No hay carros registrados.");
        } else {
            for (Carro carro : ListaCarros) {
                carro.mostrarInformacion();
            }
        }
    }
}
