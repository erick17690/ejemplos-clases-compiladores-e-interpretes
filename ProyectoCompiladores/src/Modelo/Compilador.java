/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.swing.ImageIcon;


public class Compilador extends ElementoBase{
    private String fuente="";
    private String objeto="";
    private String implementacion="";

    public Compilador(String fuente, String objeto, String implementacion, int id) {
        this.fuente = fuente;
        this.objeto = objeto;
        this.implementacion = implementacion;
        this.id = id;
    }

    public Compilador(String fuente, String objeto, String implementacion, String imagen, int fila, int col, int id) {
        this.fuente = fuente;
        this.objeto = objeto;
        this.implementacion = implementacion;
        this.tipo = TipoElementos.COMPILADOR;
        this.imagen = new ImageIcon(getClass().getResource(imagen));
        this.posicion = new Posiciones(fila, col);
        this.id = id;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getImplementacion() {
        return implementacion;
    }

    public void setImplementacion(String implementacion) {
        this.implementacion = implementacion;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }


}
