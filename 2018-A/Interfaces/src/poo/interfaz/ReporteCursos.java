/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaz;

import java.util.LinkedList;

/**
 *
 * @author FAMILIA Cach
 */
public class ReporteCursos extends javax.swing.JPanel {

    static Registros registro6 = new Registros();
    
    public ReporteCursos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReporteCursos = new javax.swing.JLabel();
        btnReporteCursos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaReporteCursos = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(135, 167, 231));

        lblReporteCursos.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        lblReporteCursos.setText(" Cursos");

        btnReporteCursos.setFont(new java.awt.Font("Myanmar Text", 1, 11)); // NOI18N
        btnReporteCursos.setText("Reporte Cursos");
        btnReporteCursos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReporteCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCursosActionPerformed(evt);
            }
        });

        txtaReporteCursos.setColumns(20);
        txtaReporteCursos.setRows(5);
        jScrollPane1.setViewportView(txtaReporteCursos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReporteCursos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReporteCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReporteCursos)
                    .addComponent(btnReporteCursos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCursosActionPerformed
        // TODO add your handling code here:
        Curso auxC;
        String contenedor="";
        String contenedor1="";
        int j=1;
        AgregarCurso objRepCur=new AgregarCurso();
        LinkedList<Curso> cursos= new LinkedList<>();
        cursos=objRepCur.pasarCurso();
        for(Curso c:objRepCur.pasarCurso()){
            //cmbCursosM.addItem(c.getNombre());
            //System.out.println(categorias.size());
        }
        
        for(int i=0; i<objRepCur.pasarCurso().size();i++){
            auxC=objRepCur.pasarCurso().get(i);
            contenedor=j+" "+auxC.toString();
            contenedor1=contenedor1+"\n"+contenedor;
            j++;
        }
        txtaReporteCursos.setText(contenedor1);
    }//GEN-LAST:event_btnReporteCursosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteCursos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReporteCursos;
    private javax.swing.JTextArea txtaReporteCursos;
    // End of variables declaration//GEN-END:variables
}
