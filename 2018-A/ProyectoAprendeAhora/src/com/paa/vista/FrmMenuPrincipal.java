/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paa.vista;

import com.paa.modelo.Categoria;
import com.paa.modelo.Docente;
import com.paa.modelo.Nivel;
import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author Marcela
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    PnlNivel panelNivel;
    PnlCurso panelCurso;
    PnlCategoria panelCategoria;
    PnlDocente panelDocente;
    static ArrayList<Nivel> niveles;
    static ArrayList<Categoria> categorias;
    static ArrayList<Docente> docentes;

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        panelNivel = new PnlNivel();
        niveles = new ArrayList<>();
        panelCurso = new PnlCurso();
        categorias = new ArrayList<>();
        docentes = new ArrayList<>();
        panelDocente = new PnlDocente();
        panelCategoria = new PnlCategoria();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnAdministracion = new javax.swing.JMenu();
        mnCategoria = new javax.swing.JMenuItem();
        mnCurso = new javax.swing.JMenuItem();
        mnDocente = new javax.swing.JMenuItem();
        mnEstudiante = new javax.swing.JMenuItem();
        mnNivel = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aprende Ahora");

        mnAdministracion.setText("Administraci??n");

        mnCategoria.setText("Categor??a");
        mnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCategoriaActionPerformed(evt);
            }
        });
        mnAdministracion.add(mnCategoria);

        mnCurso.setText("Curso");
        mnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCursoActionPerformed(evt);
            }
        });
        mnAdministracion.add(mnCurso);

        mnDocente.setText("Docente");
        mnDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDocenteActionPerformed(evt);
            }
        });
        mnAdministracion.add(mnDocente);

        mnEstudiante.setText("Estudiante");
        mnAdministracion.add(mnEstudiante);

        mnNivel.setText("Nivel");
        mnNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNivelActionPerformed(evt);
            }
        });
        mnAdministracion.add(mnNivel);

        jMenuBar1.add(mnAdministracion);

        jMenu2.setText("Matriculaci??n");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Reportes");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void mnNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNivelActionPerformed
        // TODO add your handling code here:
        panelNivel.setVisible(true);
        panelNivel.setSize(550, 300);
        panelNivel.setLocation(300, 50);
        add(panelNivel);
        panelCurso.setVisible(false);
        panelCategoria.setVisible(false);
        panelDocente.setVisible(false);
        revalidate();
        repaint();

    }//GEN-LAST:event_mnNivelActionPerformed

    private void mnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCategoriaActionPerformed
        // TODO add your handling code here:
        panelCurso.setVisible(false);
        panelCategoria.setVisible(true);
        panelDocente.setVisible(false);
        panelNivel.setVisible(false);
        panelCategoria.setSize(550, 300);
        panelCategoria.setLocation(300, 50);
        add(panelCategoria);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnCategoriaActionPerformed

    private void mnDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDocenteActionPerformed
        // TODO add your handling code here:
        panelNivel.setVisible(false);
        panelCurso.setVisible(false);
        panelCategoria.setVisible(false);
        panelDocente.setVisible(true);
        panelDocente.setSize(700, 700);
        panelDocente.setLocation(300, 50);
        add(panelDocente);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnDocenteActionPerformed

    private void mnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCursoActionPerformed
        // TODO add your handling code here:
        panelNivel.setVisible(false);
        panelCurso.setVisible(true);
        panelCurso.setSize(550, 300);
        panelCurso.setLocation(300, 50);
        add(panelCurso);
        panelCurso.mostrarNiveles();
        revalidate();
        repaint();
    }//GEN-LAST:event_mnCursoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnAdministracion;
    private javax.swing.JMenuItem mnCategoria;
    private javax.swing.JMenuItem mnCurso;
    private javax.swing.JMenuItem mnDocente;
    private javax.swing.JMenuItem mnEstudiante;
    private javax.swing.JMenuItem mnNivel;
    // End of variables declaration//GEN-END:variables
}
