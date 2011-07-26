/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.swing.ImageIcon;


public class Maquina extends ElementoBase {
    private String maquina="";

    public Maquina(String maquina, int id) {
        this.maquina = maquina;
        this.id = id;
    }

    public Maquina(String maquina, String imagen, int fila, int col, int id) {
        this.maquina = maquina;
        this.tipo = TipoElementos.MAQUINA;
        this.imagen = new ImageIcon(getClass().getResource(imagen));
        this.posicion = new Posiciones(fila, col);
        this.id = id;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

}
