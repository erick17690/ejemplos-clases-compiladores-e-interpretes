/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Tablero {

    private int[][] matriz;
    private int totf;
    private int totc;

    public Tablero() {
        totf = 10;
        totc = 16;
        matriz = new int[totf][totc];
        for (int i = 0; i < totf; i++) {
            for (int j = 0; j < totc; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public boolean verificar(TipoElementos tipo, int fila, int col) {
        boolean band = false;
        switch (tipo) {
            case COMPILADOR:
                band = verificarCompilador(fila, col);
                break;
            case INTERPRETE:
                band = verificarOcupado(fila, col);
                break;
            case MAQUINA:
                band = verificarOcupado(fila, col);
                break;
            case PROGRAMA:
                band = verificarOcupado(fila, col);
                break;
        }
        return band;
    }

    private boolean verificarCompilador(int fil, int col) {
        for (int i = col; i <= col + 4; i++) {
            if (matriz[fil][i] != 0) {
                return true;
            }
        }
        for (int j = col + 1; j <= col + 3; j++) {
            if (matriz[fil + 1][j] != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarOcupado(int fil, int col) {
        for (int i = fil; i <= fil + 1; i++) {
            for (int j = col; j <= col + 1; j++) {
                System.out.println(matriz[i][j]);
                if (matriz[i][j] != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void asignarElemento(int fil, int col, int id) {
        for (int i = fil; i <= fil + 1; i++) {
            for (int j = col; j <= col + 1; j++) {
                matriz[i][j] = id;
            }
        }

    }

    public void asignarCompilador(int fil, int col, int id) {
        for (int i = col; i <= col + 4; i++) {
            matriz[fil][i] = id;
        }
        for (int j = col + 1; j <= col + 3; j++) {
            matriz[fil+1][j] = id;
        }

    }
}
