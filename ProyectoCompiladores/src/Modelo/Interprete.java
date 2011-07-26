/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.swing.ImageIcon;


public class Interprete extends ElementoBase{
    private String lenguaje;
    private String maquina;

    public Interprete(String lenguaje, String maquina, int id) {
        this.lenguaje = lenguaje;
        this.maquina = maquina;
        this.id =id;
    }

    public Interprete(String lenguaje, String maquina, String imagen, int fila, int col, int id) {
        this.lenguaje = lenguaje;
        this.maquina = maquina;
        this.tipo = TipoElementos.INTERPRETE;
        this.imagen = new ImageIcon(getClass().getResource(imagen));
        this.posicion = new Posiciones(fila, col);
        this.id = id;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }
    
}
