/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaz;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author FAMILIA Cach
 */
public class CursosDisponibles extends javax.swing.JPanel {

    static Registros registro5 = new Registros();
    
    
    public CursosDisponibles() {
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

        cmbCategorias = new javax.swing.JComboBox();
        lblDescripCat = new javax.swing.JLabel();
        cmbCursos = new javax.swing.JComboBox();
        lblDescripCur = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panDescripCateg = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        panDescripCurso = new javax.swing.JTextPane();
        cmbCursosM = new javax.swing.JComboBox();
        lblCuersoMatric = new javax.swing.JLabel();
        lblCedulaM = new javax.swing.JLabel();
        cmbCedulaM = new javax.swing.JComboBox();
        btnMatricula = new javax.swing.JButton();
        btnActCateg = new javax.swing.JButton();

        setBackground(new java.awt.Color(135, 167, 231));

        cmbCategorias.setBackground(new java.awt.Color(135, 167, 231));
        cmbCategorias.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categorías" }));
        cmbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriasActionPerformed(evt);
            }
        });

        lblDescripCat.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lblDescripCat.setText("Descripción:");

        cmbCursos.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbCursos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cursos" }));
        cmbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursosActionPerformed(evt);
            }
        });

        lblDescripCur.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lblDescripCur.setText("Descripción:");

        jScrollPane3.setViewportView(panDescripCateg);

        jScrollPane1.setViewportView(panDescripCurso);

        lblCuersoMatric.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        lblCuersoMatric.setText("Cursos ");

        lblCedulaM.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        lblCedulaM.setText("Cédula:");

        btnMatricula.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        btnMatricula.setText("Matricular");
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });

        btnActCateg.setText("Actualizar");
        btnActCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActCategActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDescripCur)))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCuersoMatric)
                                    .addComponent(lblCedulaM))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCursosM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCedulaM, 0, 129, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(btnMatricula)))
                        .addGap(0, 160, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(lblDescripCat)
                        .addGap(27, 27, 27)
                        .addComponent(btnActCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripCat)
                    .addComponent(btnActCateg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripCur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedulaM)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCursosM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCuersoMatric))
                        .addGap(18, 18, 18)
                        .addComponent(cmbCedulaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnMatricula)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriasActionPerformed
        // TODO add your handling code here:
        
        cmbCursos.removeAllItems();
        cmbCursos.addItem("Cursos");
        Categoria aux;
        //Curso auxC;
        //Estudiante auxE;
        String opcionCat=(String)cmbCategorias.getSelectedItem();
        //lblDescripCateg =>panDescripCateg 
        for(int i=0;i<registro5.categorias.size();i++){
            aux=registro5.categorias.get(i);
            //System.out.println(categorias.get(i).getNombre()+i);
            if(opcionCat==registro5.categorias.get(i).getNombre()){
                //System.out.println("a");
                panDescripCateg.setText(aux.getDescripcion());
            }
        }
        System.out.println("HOLA K AC");
        for(int i=0;i<registro5.categorias.size();i++){
            aux=registro5.categorias.get(i);
            cmbCursos.removeAllItems();
            for(int j=0;j<registro5.curso.size();j++){
                System.out.println(opcionCat+registro5.curso.get(j).getCategoria().getNombre());//
                if(opcionCat==registro5.curso.get(j).getCategoria().getNombre()){
                  //System.out.println(opcionCat+registro5.curso.get(j).getCategoria().getNombre());
                  //panDescripCateg.setText(categorias.get(i).getDescripcion());
                  cmbCursos.addItem(registro5.curso.get(j).getNombre());
                }
            }
        }
    }//GEN-LAST:event_cmbCategoriasActionPerformed

    private void cmbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursosActionPerformed
        // TODO add your handling code here:
        Categoria aux;
        //lblDescripCurso =>panDescripCurso
        String opcion=(String)cmbCursos.getSelectedItem();
        for(int i=0;i<registro5.curso.size();i++){
            if(opcion==registro5.curso.get(i).getNombre()){
                panDescripCurso.setText(registro5.curso.get(i).getDescripcion()+"\n"
                +" Requisitos:"+registro5.curso.get(i).getRequisitosEspecificos());
            }
        }
    }//GEN-LAST:event_cmbCursosActionPerformed

    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        // TODO add your handling code here:
        String cursoM=(String)cmbCursosM.getSelectedItem();
        String cedulaM=(String)cmbCedulaM.getSelectedItem();
        registro5.matriculas.add(cursoM);
        registro5.matriculas.add(cedulaM);
        System.out.println(registro5.matriculas);
    }//GEN-LAST:event_btnMatriculaActionPerformed

    public ArrayList<String> pasararrayMatricula(){
        return registro5.matriculas; 
    }
    
    private void btnActCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActCategActionPerformed
         cmbCategorias.removeAllItems();
         cmbCedulaM.removeAllItems();
         cmbCursosM.removeAllItems();
        AgregarCategoria obj=new AgregarCategoria();
        LinkedList<Categoria> categorias= new LinkedList<>();
        categorias=obj.pasarCategoria();
        for(Categoria c:obj.pasarCategoria()){
            cmbCategorias.addItem(c.getNombre());
            //System.out.println(categorias.size());
        }
        
        RegistrarEstudiante objRE=new RegistrarEstudiante();
        LinkedList<Persona> estudiantes= new LinkedList<>();
        estudiantes=objRE.pasarEstudiante();
        
        for(Persona c:objRE.pasarEstudiante()){
            cmbCedulaM.addItem(c.getCedula());
            //System.out.println(categorias.size());
        }
        
        AgregarCurso objRC=new AgregarCurso();
        LinkedList<Curso> cursos= new LinkedList<>();
        cursos=objRC.pasarCurso();
        for(Curso c:objRC.pasarCurso()){
            cmbCursosM.addItem(c.getNombre());
            //System.out.println(categorias.size());
        }
    }//GEN-LAST:event_btnActCategActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActCateg;
    private javax.swing.JButton btnMatricula;
    public javax.swing.JComboBox cmbCategorias;
    public javax.swing.JComboBox cmbCedulaM;
    public javax.swing.JComboBox cmbCursos;
    public javax.swing.JComboBox cmbCursosM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCedulaM;
    private javax.swing.JLabel lblCuersoMatric;
    private javax.swing.JLabel lblDescripCat;
    private javax.swing.JLabel lblDescripCur;
    private javax.swing.JTextPane panDescripCateg;
    private javax.swing.JTextPane panDescripCurso;
    // End of variables declaration//GEN-END:variables
}
