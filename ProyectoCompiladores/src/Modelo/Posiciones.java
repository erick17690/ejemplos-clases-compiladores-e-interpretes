/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


public class Posiciones {
    public int fila;
    public int columna;

    public Posiciones(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Posiciones() {
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    
}
