
package Vistas;


public class Formulario extends javax.swing.JFrame {

   
    public Formulario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiAlumnos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiInscripciones = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmiNotas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmiConsultas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jmiArchivo.setText(" Archivo");
        jmiArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmiArchivo.add(jMenuItem1);

        jMenuBar1.add(jmiArchivo);

        jMenu2.setText("Materias");

        jmiMaterias.setText("Formulario de Materias");
        jmiMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(jmiMaterias);

        jMenuBar1.add(jMenu2);

        jMenu3.setText(" Alumnos");

        jmiAlumnos.setText("Formulario de Alumnos");
        jmiAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumnosActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAlumnos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Inscripciones");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jmiInscripciones.setText("Manejo de Inscripciones");
        jmiInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInscripcionesActionPerformed(evt);
            }
        });
        jMenu4.add(jmiInscripciones);

        jMenuBar1.add(jMenu4);

        jMenu5.setText(" Carga de notas");

        jmiNotas.setText(" Manipulación de Notas");
        jmiNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNotasActionPerformed(evt);
            }
        });
        jMenu5.add(jmiNotas);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Consultas");

        jmiConsultas.setText(" Listado de Alumnos por Materia");
        jmiConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultasActionPerformed(evt);
            }
        });
        jMenu6.add(jmiConsultas);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jmiInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInscripcionesActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        VInscripcion vi = new VInscripcion();
        vi.setVisible(true);
        escritorio.add(vi);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiInscripcionesActionPerformed

    private void jmiArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jmiArchivoActionPerformed

    private void jmiMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VMaterias vm = new VMaterias();
        vm.setVisible(true);
        escritorio.add(vm);
    }//GEN-LAST:event_jmiMateriasActionPerformed

    private void jmiAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumnosActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        VAlumnos va = new VAlumnos();
        va.setVisible(true);
        escritorio.add(va);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAlumnosActionPerformed

    private void jmiNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VCargaDeNotas vcn = new VCargaDeNotas();
        vcn.setVisible(true);
        escritorio.add(vcn);
// TODO add your handling code here:
    }//GEN-LAST:event_jmiNotasActionPerformed

    private void jmiConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VConsultas vc = new VConsultas();
        vc.setVisible(true);
        escritorio.add(vc);
// TODO add your handling code here:
    }//GEN-LAST:event_jmiConsultasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmiAlumnos;
    private javax.swing.JMenu jmiArchivo;
    private javax.swing.JMenuItem jmiConsultas;
    private javax.swing.JMenuItem jmiInscripciones;
    private javax.swing.JMenuItem jmiMaterias;
    private javax.swing.JMenuItem jmiNotas;
    // End of variables declaration//GEN-END:variables
}
