/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaz;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author FAMILIA Cach
 */
public class Registros extends javax.swing.JFrame {

    LinkedList<Persona> estudiante= new LinkedList<>();;
    LinkedList<Persona> docente= new LinkedList<>();;
    LinkedList<Categoria> categorias= new LinkedList<>();
    LinkedList<Curso> curso= new LinkedList<>();
    ArrayList<String> matriculas = new ArrayList<String>();
    Estudiante[] estudiantesCurso;
    
    /*PARA VALIDAR LAS VARIABLE SDE OTROS PANELES*/
    CursosDisponibles curDisponible  = new CursosDisponibles();
    AgregarCurso agrCurso = new AgregarCurso();
    RegistrarDocente regDocente = new RegistrarDocente();
    AgregarCategoria agregCategoria = new AgregarCategoria(); 
    Panel pnl;
    
    //static Registros registro = new Registros();
        
    public Registros() {
        initComponents();
        pnl = new Panel();

        //this.setLocationRelativeTo(null);
        docente.add(new Docente("In. Sistemas",912349532,"Ivan","Gualotuña","1876943245","ABC@gmail.com"));
        docente.add(new Docente("PHD Tecnología",987649532,"Stefan","Salvatore","1048943245","Salvatore@gmail.com"));
        Curso auxC;
        Persona auxD;
        for(int i=0;i<curso.size();i++){
            auxC=curso.get(i);
            if(auxC.getNombre()=="Master en JavaScript"){
                for(int j=0;j<docente.size();j++){
                    auxD=(Docente)docente.get(0);
                    curso.get(i).setDocente((Docente) auxD);
                }
            }else{
                if(auxC.getNombre()=="Blender 3d en educacion"){
                    for(int j=0;j<docente.size();j++){
                    auxD=(Docente)docente.get(1);
                    curso.get(i).setDocente((Docente) auxD);
                    }
                }
            }
        }
        
        estudiantesCurso= new Estudiante[3];
        estudiante.add(new Estudiante("Miguel","Muenala","1755397922","micky_4@hotmail.es"));
        estudiante.add(new Estudiante("Damon","Salvatore","1555397922","damon@gmail.com"));
        estudiante.add(new Estudiante("Tay","Camilla","1455397922","Tay_50@hotmail.com"));
        Estudiante auxE;
        for(int i=0;i<estudiante.size();i++){
            auxE=(Estudiante)estudiante.get(i);
            estudiantesCurso[i]=auxE;
            curDisponible.cmbCedulaM.addItem(auxE.getCedula());
        }
        categorias.add(new Categoria("ANIMACIÓN","Aprende las bases animado en 2D"));
        categorias.add(new Categoria("PROGRAMACIÓN","Aprende las bases de JAVA"));
        categorias.add(new Categoria("TECNOLOGíA","Cursos enfocados a las nuevas tecnologías"));
        for(Categoria c:categorias){
            curDisponible.cmbCategorias.addItem(c.getNombre());
            agrCurso.cmbCatCurso.addItem(c.getNombre());
        }
        curso.add(new Curso("Blender 3d en educacion","Modelamiento en 3D",8,"Ninguno"));//animacion
        curso.add(new Curso("Intr. al desarrollo de videojuegos","Aprende a desarrollar videojuegos multiplataforma",8,"Ninguno"));
        curso.add(new Curso("Master en JavaScript","Aprender JS, jQuery, Angular 8, NodeJS",5,"Ninguno"));//progra
        curso.add(new Curso("Desarrollo Web","HTML5, CSS3, JS AJAX PHP y MySQL",5,"Ninguno"));
        curso.add(new Curso("Intr. a la seguridad informática","Simulación de entornos para Ciberseguridad",8,"Ninguno"));//tecnologia
        Categoria aux;
        
        for(int i=0;i<categorias.size();i++){
                System.out.println("c");
                aux=categorias.get(i);
                    for(int j=0;j<curso.size();j++){
                        System.out.println("e");
                        auxC=curso.get(j);
                        if(aux.getNombre()=="ANIMACIÓN"&&(
                                curso.get(j).getNombre()=="Blender 3d en educacion"||
                                curso.get(j).getNombre()=="Intr. al desarrollo de videojuegos")){
                            System.out.println("f");
                            curso.get(j).setCategoria(aux);
                            curso.get(j).setEstudiantes(estudiantesCurso);
                        }else{
                            if(aux.getNombre()=="PROGRAMACIÓN"&&(
                                curso.get(j).getNombre()=="Master en JavaScript"||
                                curso.get(j).getNombre()=="Desarrollo Web")){
                            System.out.println("p");
                            curso.get(j).setCategoria(aux);
                            curso.get(j).setEstudiantes(estudiantesCurso);
                            }else{
                                if(aux.getNombre()=="TECNOLOGíA"&&(
                                curso.get(j).getNombre()=="Intr. a la seguridad informática")){
                                System.out.println("k");
                                curso.get(j).setCategoria(aux);
                                }
                            }
                        }
                    }
            }
        for(Curso c:curso){
            curDisponible.cmbCursosM.addItem(c.getNombre());
            regDocente.cmbCursoProfe.addItem(c.getNombre());
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

        pnlTitulo = new javax.swing.JPanel();
        lblAprendeAhora = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblSubtitulo2 = new javax.swing.JLabel();
        pnlRegistros = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnRegistrarDocente = new javax.swing.JButton();
        btnAgregarCategoria = new javax.swing.JButton();
        btnRegistrarC = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();
        btnReporteCursos = new javax.swing.JButton();
        btnReporteEstudiantes = new javax.swing.JButton();
        pnlInformacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACME");
        setBackground(new java.awt.Color(102, 102, 255));

        pnlTitulo.setBackground(new java.awt.Color(204, 204, 255));
        pnlTitulo.setForeground(new java.awt.Color(204, 204, 255));

        lblAprendeAhora.setBackground(new java.awt.Color(0, 0, 0));
        lblAprendeAhora.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 36)); // NOI18N
        lblAprendeAhora.setForeground(new java.awt.Color(102, 102, 255));
        lblAprendeAhora.setText("Aprende Ahora");

        lblSubtitulo.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        lblSubtitulo.setText("La vida es emocionante cuando ");

        lblSubtitulo2.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        lblSubtitulo2.setText("eres tú quien la programa...");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitulo)
                    .addComponent(lblSubtitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAprendeAhora)
                .addGap(52, 52, 52))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addComponent(lblAprendeAhora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlRegistros.setBackground(new java.awt.Color(153, 153, 255));

        btnRegistrar.setFont(new java.awt.Font("Myanmar Text", 1, 11)); // NOI18N
        btnRegistrar.setText("Registrar Estudiante");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(53, 21));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnRegistrarDocente.setFont(new java.awt.Font("Myanmar Text", 1, 11)); // NOI18N
        btnRegistrarDocente.setText("Registrar Docente");
        btnRegistrarDocente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarDocente.setPreferredSize(new java.awt.Dimension(53, 21));
        btnRegistrarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDocenteActionPerformed(evt);
            }
        });

        btnAgregarCategoria.setFont(new java.awt.Font("Myanmar Text", 1, 11)); // NOI18N
        btnAgregarCategoria.setText("Agregar Categoría");
        btnAgregarCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCategoria.setPreferredSize(new java.awt.Dimension(53, 21));
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        btnRegistrarC.setFont(new java.awt.Font("Myanmar Text", 1, 11)); // NOI18N
        btnRegistrarC.setText("Agregar Curso");
        btnRegistrarC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarC.setPreferredSize(new java.awt.Dimension(53, 21));
        btnRegistrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCActionPerformed(evt);
            }
        });

        btnMatricula.setFont(new java.awt.Font("Myanmar Text", 1, 11)); // NOI18N
        btnMatricula.setText("Matriculación");
        btnMatricula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });

        btnReporteCursos.setFont(new java.awt.Font("Myanmar Text", 1, 11)); // NOI18N
        btnReporteCursos.setText("Reporte Curso");
        btnReporteCursos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReporteCursos.setPreferredSize(new java.awt.Dimension(53, 21));
        btnReporteCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCursosActionPerformed(evt);
            }
        });

        btnReporteEstudiantes.setFont(new java.awt.Font("Myanmar Text", 1, 11)); // NOI18N
        btnReporteEstudiantes.setText("Reporte Estudiantes");
        btnReporteEstudiantes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReporteEstudiantes.setPreferredSize(new java.awt.Dimension(53, 21));
        btnReporteEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrosLayout = new javax.swing.GroupLayout(pnlRegistros);
        pnlRegistros.setLayout(pnlRegistrosLayout);
        pnlRegistrosLayout.setHorizontalGroup(
            pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(btnReporteCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlRegistrosLayout.setVerticalGroup(
            pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReporteCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReporteEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pnlInformacion.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));

        javax.swing.GroupLayout pnlInformacionLayout = new javax.swing.GroupLayout(pnlInformacion);
        pnlInformacion.setLayout(pnlInformacionLayout);
        pnlInformacionLayout.setHorizontalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlInformacionLayout.setVerticalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
      /*  RegistrarEstudiante estudiante = new RegistrarEstudiante();
        estudiante.setSize(500, 500);
        estudiante.setLocation(5, 5);
        
        pnlInformacion.removeAll();
        pnlInformacion.add(estudiante, BorderLayout.CENTER);
        pnlInformacion.revalidate();
        pnlInformacion.repaint();*/
      pnl.setSize(400,300);
   //   pnl.setLocation(5,5);
      pnlInformacion.removeAll();
      pnlInformacion.add(pnl, BorderLayout.CENTER); 
      pnlInformacion.revalidate();
      pnlInformacion.repaint();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public LinkedList<Categoria> enviarCategorias(){
        return categorias;
    }
    
    public LinkedList<Curso> enviarCurso(){
        return curso; 
    }
    public ArrayList<String> enviararrayMatricula(){
        return matriculas; 
    }
    
    private void btnRegistrarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDocenteActionPerformed
        // TODO add your handling code here:
        RegistrarDocente docente = new RegistrarDocente();
        docente.setSize(500, 400);
        docente.setLocation(5, 5);
        
        pnlInformacion.removeAll();
        pnlInformacion.add(docente, BorderLayout.CENTER);
        pnlInformacion.revalidate();
        pnlInformacion.repaint();
    }//GEN-LAST:event_btnRegistrarDocenteActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        // TODO add your handling code here:
        AgregarCategoria categoria1 = new AgregarCategoria();
        categoria1.setSize(500, 500);
        categoria1.setLocation(5, 5);
        
        pnlInformacion.removeAll();
        pnlInformacion.add(categoria1, BorderLayout.CENTER);
        pnlInformacion.revalidate();
        pnlInformacion.repaint();
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnRegistrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCActionPerformed
        // TODO add your handling code here:
        AgregarCurso curso = new AgregarCurso();
        curso.setSize(500, 400);
        curso.setLocation(5, 5);
        
        pnlInformacion.removeAll();
        pnlInformacion.add(curso, BorderLayout.CENTER);
        pnlInformacion.revalidate();
        pnlInformacion.repaint();
    }//GEN-LAST:event_btnRegistrarCActionPerformed

    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        // TODO add your handling code here:
        CursosDisponibles cursodisponible = new CursosDisponibles();
        cursodisponible.setSize(500, 500);
        cursodisponible.setLocation(5, 5);
        
        pnlInformacion.removeAll();
        pnlInformacion.add(cursodisponible, BorderLayout.CENTER);
        pnlInformacion.revalidate();
        pnlInformacion.repaint();
    }//GEN-LAST:event_btnMatriculaActionPerformed

    private void btnReporteCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCursosActionPerformed
        // TODO add your handling code here:
        ReporteCursos reporteCursos = new ReporteCursos();
        reporteCursos.setSize(500, 500);
        reporteCursos.setLocation(5, 5);
        
        pnlInformacion.removeAll();
        pnlInformacion.add(reporteCursos, BorderLayout.CENTER);
        pnlInformacion.revalidate();
        pnlInformacion.repaint();
    }//GEN-LAST:event_btnReporteCursosActionPerformed

    private void btnReporteEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteEstudiantesActionPerformed
        // TODO add your handling code here:
        ReporteEstudiantes reporteEstudiantes = new ReporteEstudiantes();
        reporteEstudiantes.setSize(500, 500);
        reporteEstudiantes.setLocation(5, 5);
        
        pnlInformacion.removeAll();
        pnlInformacion.add(reporteEstudiantes, BorderLayout.CENTER);
        pnlInformacion.revalidate();
        pnlInformacion.repaint();
    }//GEN-LAST:event_btnReporteEstudiantesActionPerformed

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
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarC;
    private javax.swing.JButton btnRegistrarDocente;
    private javax.swing.JButton btnReporteCursos;
    private javax.swing.JButton btnReporteEstudiantes;
    private javax.swing.JLabel lblAprendeAhora;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblSubtitulo2;
    public javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlRegistros;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
