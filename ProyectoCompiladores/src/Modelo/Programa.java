/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.swing.ImageIcon;


public class Programa extends ElementoBase{
    private String programa="";
    private String lenguaje="";

    public Programa(String programa, String lenguaje, int id) {
        this.programa = programa;
        this.lenguaje = lenguaje;
        this.id =id;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Programa(String programa, String lenguaje, String imagen, int fila, int col, int id) {
        this.programa = programa;
        this.lenguaje = lenguaje;
        this.tipo = TipoElementos.PROGRAMA;
        this.imagen = new ImageIcon(getClass().getResource(imagen));
        this.posicion = new Posiciones(fila, col);
        this.id = id;

    }

}
