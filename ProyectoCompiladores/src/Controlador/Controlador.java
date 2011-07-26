/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Compilador;
import Modelo.Interprete;
import Modelo.Maquina;
import Modelo.Modelo;
import Modelo.Programa;
import Modelo.TipoElementos;
import Vista.VentanaCompilador;
import Vista.VentanaInterprete;
import Vista.VentanaMaquina;
import Vista.VentanaPrincipal;
import Vista.VentanaPrograma;

public class Controlador {

    private Modelo modelo;
    private VentanaPrincipal vista;
    private int contElementos;

    public Controlador(Modelo modelo, VentanaPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        contElementos = 0;
    }

    public void nuevoElemento(TipoElementos tipo, int fila, int col) {
        vista.getTiempo().stop();
        if (!modelo.getMatriz().verificar(tipo, fila, col)) {
            switch (tipo) {
                case COMPILADOR:
                    VentanaCompilador venta = new VentanaCompilador(vista, true);
                    venta.setVisible(true);
                    ++contElementos;
                    Compilador nuevo =  new Compilador(venta.fuente, venta.objeto,venta.implementacion, "/compilador.png",fila,col, contElementos);
                    modelo.nuevoElemento(nuevo);
                    modelo.getMatriz().asignarCompilador(fila, col, contElementos);
                    vista.cancelar();
                    break;
                case INTERPRETE:
                    VentanaInterprete venta1 = new VentanaInterprete(vista, true);
                    venta1.setVisible(true);
                    ++contElementos;
                    Interprete nuevoi = new Interprete(venta1.lenguaje, venta1.maquina, "/interprete.png", fila, col, contElementos);
                    modelo.nuevoElemento(nuevoi);
                    modelo.getMatriz().asignarElemento(fila, col, contElementos);
                    vista.cancelar();
                    break;
                case MAQUINA:
                    VentanaMaquina venta2 = new VentanaMaquina(vista, true);
                    venta2.setVisible(true);
                    ++contElementos;
                    Maquina nuevom = new Maquina(venta2.maquina, "/maquina.png", fila, col, contElementos);
                    modelo.nuevoElemento(nuevom);
                    modelo.getMatriz().asignarElemento(fila, col, contElementos);
                    vista.cancelar();
                    break;
                case PROGRAMA:
                    VentanaPrograma venta3 =  new VentanaPrograma(vista, true);
                    venta3.setVisible(true);
                    ++contElementos;
                    Programa nuevop = new Programa(venta3.programa, venta3.lenguaje, "/programa.png", fila, col, contElementos);
                    modelo.nuevoElemento(nuevop);
                    modelo.getMatriz().asignarElemento(fila, col, contElementos);
                    vista.cancelar();
                    break;
            }
        }

        vista.getTiempo().restart();
    }
}
