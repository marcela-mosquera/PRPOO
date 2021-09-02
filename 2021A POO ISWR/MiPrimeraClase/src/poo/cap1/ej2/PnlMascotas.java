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
public class PnlMascotas extends javax.swing.JPanel {

    DefaultTableModel dtmModelo;

    /**
     * Creates new form PnlMascotas
     */
    public PnlMascotas() {
        initComponents();
        dtmModelo = new DefaultTableModel();
        dtmModelo.addColumn("Nombre");
        dtmModelo.addColumn("Sexo");
        dtmModelo.addColumn("Tipo Mascota");
        tblMascotas.setModel(dtmModelo);
    }

    public void llenarTabla() {
        //1 recorrer el arraylist
        //tomar los datos del elemento en la pos correspondiente
        //y ubicarlos en la fila adecuada de la tabla
        //limpiar tabla
        for (Mascota m : GUIPolimorfismo.listaDeMascotas) {
            dtmModelo.addRow(new Object[]{m.nombre, m.getSexo(),
                m.getClass().getSimpleName()});
        }
    }
    
    public void limpiarTabla(){
        //recorre c/u de las filas del modelo y las elimina
        for(int i= dtmModelo.getRowCount()-1; i>=0; i--)
            dtmModelo.removeRow(i);
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMascotas;
    // End of variables declaration//GEN-END:variables
}
