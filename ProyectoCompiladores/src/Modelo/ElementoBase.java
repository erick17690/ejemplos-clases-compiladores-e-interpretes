/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.swing.ImageIcon;

public abstract class ElementoBase {

    protected Posiciones posicion;
    protected TipoElementos tipo;
    protected ImageIcon imagen;
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public ElementoBase() {
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public TipoElementos getTipo() {
        return tipo;
    }

    public void setTipo(TipoElementos tipo) {
        this.tipo = tipo;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

}
