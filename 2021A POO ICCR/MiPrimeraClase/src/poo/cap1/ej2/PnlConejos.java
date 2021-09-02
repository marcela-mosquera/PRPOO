/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Marcela
 */
public class PnlConejos extends javax.swing.JPanel {

    DefaultTableModel dtmModelo;
     /**
     * Creates new form PnlConejos
     */
    public PnlConejos() {
        initComponents();
        dtmModelo = new DefaultTableModel();
        dtmModelo.addColumn("Nombre");
        dtmModelo.addColumn("Edad");
        dtmModelo.addColumn("Peso");
        tblConejos.setModel(dtmModelo);
    }

    public void llenarTabla(){
        dtmModelo.setRowCount(0); //otra manera de limpiar los datos de la tabla
        for(Conejo c: GUIConejo.conejos)
            dtmModelo.addRow(new Object[]{
            c.getNombre(), c.getEdad(), c.getPeso()});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblConejos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbOpciones = new javax.swing.JComboBox<>();

        tblConejos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblConejos);

        jLabel1.setText("Ordenar");

        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edad", "Nombre" }));
        cmbOpciones.setSelectedIndex(-1);
        cmbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(cmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpcionesActionPerformed
        // TODO add your handling code here:
        /*Si el usr selcciona la opcion Peso, A ordenar el Arraylist y
        B luego presentar el arreglo ordenado de acuerdo al peso en la tabla*/
        if(cmbOpciones.getSelectedIndex() == 0){
            Collections.sort(GUIConejo.conejos); //A
            llenarTabla(); //B
        }
        
        /*
        Si el usr selecciona la opcion Nombre:
        A. ordenar el ArrayList de acuerdo al nombre (orden total)
        B. presentar el arreglo ordenado
        */
        if(cmbOpciones.getSelectedIndex() == 1){
            Collections.sort(GUIConejo.conejos, new OrdenarConejosPorNombre());
            llenarTabla();
        }

        Collections.max(GUIConejo.conejos , new OrdenarConejosPorNombre());
    }//GEN-LAST:event_cmbOpcionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConejos;
    // End of variables declaration//GEN-END:variables
}