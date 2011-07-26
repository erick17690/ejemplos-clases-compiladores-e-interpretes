/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Vista.VentanaPrincipal;
import java.util.ArrayList;
import java.util.List;


public class Modelo {

    private VentanaPrincipal vista;
    private Tablero matriz;
    private List<ElementoBase> elementos;
    public Modelo(VentanaPrincipal vista) {
        this.vista = vista;
        matriz = new Tablero();
        elementos = new ArrayList<ElementoBase>();
    }

    public void nuevoElemento(ElementoBase nuevo){
        elementos.add(nuevo);
    }
    public List<ElementoBase> getElementos() {
        return elementos;
    }

    public void setElementos(List<ElementoBase> elementos) {
        this.elementos = elementos;
    }

    public Tablero getMatriz() {
        return matriz;
    }

    public void setMatriz(Tablero matriz) {
        this.matriz = matriz;
    }

    public VentanaPrincipal getVista() {
        return vista;
    }

    public void setVista(VentanaPrincipal vista) {
        this.vista = vista;
    }
}
