/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcela
 */
public class PnlConsultaMascotas extends javax.swing.JPanel {

    DefaultTableModel dtmModelo;

    /**
     * Creates new form PnlConsultaMascotas
     */
    public PnlConsultaMascotas() {
        initComponents();
        dtmModelo = new DefaultTableModel();
        dtmModelo.addColumn("Nombre");
        // dtmModelo.addColumn("Raza");
        dtmModelo.addColumn("Sexo");
        dtmModelo.addColumn("Tipo Animal");
        tblMascotas.setModel(dtmModelo);

    }

    public void llenarTabla() {
        dtmModelo.setRowCount(0);
        for (Mascota m : MenuPrincipal.mascotas) {
            //  JOptionPane.showMessageDialog(null, m.toString());
            dtmModelo.addRow(new Object[]{m.nombre, m.getSexo(), m.getClass().getSimpleName()});
        }
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
        tblMascotas = new javax.swing.JTable();

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMascotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMascotas;
    // End of variables declaration//GEN-END:variables
}