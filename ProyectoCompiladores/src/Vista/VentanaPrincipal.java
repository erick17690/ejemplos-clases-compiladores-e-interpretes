/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaPrincipal.java
 *
 * Created on 18/07/2011, 22:13:21
 */
package Vista;

import Controlador.Controlador;
import Modelo.Compilador;
import Modelo.ElementoBase;
import Modelo.Interprete;
import Modelo.Maquina;
import Modelo.Modelo;
import Modelo.Programa;
import Modelo.TipoElementos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class VentanaPrincipal extends javax.swing.JFrame {

    /** Creates new form VentanaPrincipal */
    private Modelo modelo;
    private Controlador controlador;
    private TipoElementos actual;
    private int Xf, Yf;

    public VentanaPrincipal() {
        initComponents();
        jLabel1.setSize(16 * 54, 10 * 54);
        jLabel1.setVisible(false);
        jPanel1.setVisible(false);
        tiempo.start();
        tiempo.stop();
        actual = TipoElementos.NINGUNO;
    }

    public TipoElementos getActual() {
        return actual;
    }

    public void setActual(TipoElementos actual) {
        this.actual = actual;
    }

    public void cancelar() {
        this.actual = TipoElementos.NINGUNO;
    }
    private Timer tiempo = new Timer(50, new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            renovar();
        }
    });

    public Timer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Timer tiempo) {
        this.tiempo = tiempo;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modelador Diagramas de Tombstone");

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos"));

        jButton1.setText("Compilador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Programa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Maquina");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Interprete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addGap(35, 35, 35)
                .addComponent(jButton5)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cargar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem5.setText("Creditos");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public void renovar() {
        pintar(jLabel1.getGraphics());
    }

    public void pintar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Image imagen = createVolatileImage(jLabel1.getWidth(), jLabel1.getHeight());
        Graphics2D buf = (Graphics2D) imagen.getGraphics();
        ImageIcon imagenf = null;
        int[][] matriz = modelo.getMatriz().getMatriz();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 16; j++) {
                if (matriz[i][j] == 0) {
                    imagenf = new ImageIcon(getClass().getResource("/0.png"));
                    buf.drawImage(imagenf.getImage(), j * 54, i * 54, imagenf.getImageObserver());
                }
            }
        }
        List<ElementoBase> lista = modelo.getElementos();
        if (lista.size() > 0) {
            ListIterator<ElementoBase> it = lista.listIterator();
            while (it.hasNext()) {
                ElementoBase aux = it.next();
                imagenf = aux.getImagen();
                buf.drawImage(imagenf.getImage(), aux.getPosicion().columna * 54, aux.getPosicion().fila * 54, imagenf.getImageObserver());
                if (aux instanceof Compilador) {
                    buf.setColor(Color.WHITE);
                    Compilador com = (Compilador) aux;
                    buf.drawString(com.getFuente(), com.getPosicion().columna * 54 + 10, com.getPosicion().fila * 54 + 27);
                    buf.drawString(com.getImplementacion(), (com.getPosicion().columna + 2) * 54 + 10, (com.getPosicion().fila + 1) * 54 + 27);
                    buf.drawString(com.getObjeto(), (com.getPosicion().columna + 4) * 54 + 10, com.getPosicion().fila * 54 + 27);
                }
                if (aux instanceof Interprete){
                    buf.setColor(Color.BLACK);
                    Interprete com = (Interprete) aux;
                    buf.drawString(com.getLenguaje(), (com.getPosicion().columna +1)* 54 - 10, com.getPosicion().fila * 54 + 27);
                    buf.drawString(com.getMaquina(), (com.getPosicion().columna + 1) * 54 - 10, (com.getPosicion().fila + 1) * 54 + 27);

                }
                if (aux instanceof Maquina){
                    buf.setColor(Color.BLACK);
                    Maquina com = (Maquina) aux;
                    buf.drawString(com.getMaquina(), (com.getPosicion().columna +1)* 54 - 10, com.getPosicion().fila * 54 + 27);

                }
                if (aux instanceof Programa){
                    buf.setColor(Color.BLACK);
                    Programa com = (Programa) aux;
                    buf.drawString(com.getPrograma(), (com.getPosicion().columna +1)* 54 - 10, com.getPosicion().fila * 54 + 27);
                    buf.drawString(com.getLenguaje(), (com.getPosicion().columna + 1) * 54 - 10, (com.getPosicion().fila + 1) * 54 + 27);

                }

            }
        }
        switch (actual) {
            case COMPILADOR:
                imagenf = new ImageIcon(getClass().getResource("/compilador.png"));
                buf.drawImage(imagenf.getImage(), Xf * 54, Yf * 54, imagenf.getImageObserver());
                break;
            case INTERPRETE:
                imagenf = new ImageIcon(getClass().getResource("/interprete.png"));
                buf.drawImage(imagenf.getImage(), Xf * 54, Yf * 54, imagenf.getImageObserver());
                break;
            case MAQUINA:
                imagenf = new ImageIcon(getClass().getResource("/maquina.png"));
                buf.drawImage(imagenf.getImage(), Xf * 54, Yf * 54, imagenf.getImageObserver());
                break;
            case PROGRAMA:
                imagenf = new ImageIcon(getClass().getResource("/programa.png"));
                buf.drawImage(imagenf.getImage(), Xf * 54, Yf * 54, imagenf.getImageObserver());
                break;
        }
        g2d.drawImage(imagen, 0, 0, null);

    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        modelo = new Modelo(this);
        controlador = new Controlador(modelo, this);
        jLabel1.setVisible(true);
        jPanel1.setVisible(true);
        tiempo.restart();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        // TODO add your handling code here:
        if (actual != TipoElementos.NINGUNO) {
            Xf = evt.getX() / 54;
            Yf = evt.getY() / 54;
            //System.out.println("Xf-> " + Xf + "  Yf->" + Yf);
            switch (actual) {
                case COMPILADOR:
                    break;
                case INTERPRETE:
                    break;
                case MAQUINA:
                    break;
                case PROGRAMA:
                    break;
            }
        }
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        actual = TipoElementos.COMPILADOR;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        actual = TipoElementos.PROGRAMA;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        actual = TipoElementos.MAQUINA;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        actual = TipoElementos.INTERPRETE;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        actual = TipoElementos.NINGUNO;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        // TODO add your handling code here:
        if (actual != TipoElementos.NINGUNO) {
            controlador.nuevoElemento(actual, Yf, Xf);
        }
    }//GEN-LAST:event_jLabel1MouseReleased
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}