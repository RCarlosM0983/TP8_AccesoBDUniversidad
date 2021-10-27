/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controles.AlumnoData;
import Controles.Conexion;
import Controles.CursadaData;
import Modelos.Alumno;
import Modelos.Cursada;
import Modelos.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo_000
 */
public class VInscripcion extends javax.swing.JInternalFrame {
 
    private DefaultTableModel modelo;
    private ArrayList<Materia>listaMaterias;
    
    /**
     * Creates new form VInscripcion
     */
    

  

    public VInscripcion() {
        initComponents();
        Conexion c = new Conexion();
        AlumnoData aData = new AlumnoData(c);
        
        this.cargarAlumnos();
        
        modelo = new DefaultTableModel();
        armarCabecera();
    }
    private void armarCabecera(){
        ArrayList<Object>columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Año");
        for(Object titulo: columnas){
            modelo.addColumn(titulo);
        }
        jtInscriptas.setModel(modelo);
    }
      public void cargarAlumnos(){
          Conexion c = new Conexion();
          AlumnoData aData = new AlumnoData(c);
          ArrayList<Alumno>lista = (ArrayList)aData.obtenerAlumnos();
          for(Alumno alumno: lista){
              jcbAlumno.addItem(alumno);
          }
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
//     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInscriptas = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Alumno");

        jcbAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jrbInscriptas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrbInscriptas.setText("Inscriptas");
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrbNoInscriptas.setText("No Inscriptas");
        jrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptasActionPerformed(evt);
            }
        });

        jtInscriptas.setBackground(new java.awt.Color(153, 204, 255));
        jtInscriptas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtInscriptas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtInscriptas);

        jbInscribir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbAnular.setText("Anular Inscripcion");
        jbAnular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jbAnular)
                        .addGap(77, 77, 77)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel2)
                            .addGap(34, 34, 34)
                            .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jrbInscriptas)
                                    .addGap(55, 55, 55)
                                    .addComponent(jrbNoInscriptas))
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel3))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscriptas)
                    .addComponent(jrbNoInscriptas))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        // TODO add your handling code here:
        jrbNoInscriptas.setSelected(false);
        cargarInscriptas();
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);
        
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        // TODO add your handling code here:
        jrbInscriptas.setSelected(false);
        cargarNoInscriptas();
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        int filaSelec = jtInscriptas.getSelectedRow();
        Conexion con = new Conexion();
        
        if(filaSelec != -1){
            Alumno a = (Alumno)jcbAlumno.getSelectedItem();
            
            int idMateria = (Integer)modelo.getValueAt(filaSelec, 0);
            String nombreMateria = (String)modelo.getValueAt(filaSelec, 1);
            int anio = (Integer)modelo.getValueAt(filaSelec, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio, true);
            Cursada c = new Cursada(a, m, 0, true);
            CursadaData cd = new CursadaData(con);
            cd.guardarCursada(c);
            borrarFilasT();
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        // TODO add your handling code here:
         int filaSelec = jtInscriptas.getSelectedRow();
        Conexion con = new Conexion();
        
        if(filaSelec != -1){
            Alumno a = (Alumno)jcbAlumno.getSelectedItem();
            CursadaData cd = new CursadaData(con);
            int id = a.getIdAlumno();
            int idMateria = (Integer)modelo.getValueAt(filaSelec, 0);
            cd.borrarCursadaDeUnaMateria(id, idMateria);
            JOptionPane.showMessageDialog(this, "Inscripción anulada");
            borrarFilasT();
        }
    }//GEN-LAST:event_jbAnularActionPerformed
public void borrarFilasT(){
    int a = modelo.getRowCount()-1;
    for(int i=a; i>=0; i--){
       modelo.removeRow(i);
    }
}
private void cargarInscriptas(){
    borrarFilasT();
    Conexion c = new Conexion();
    CursadaData cd = new CursadaData(c);
    Alumno selec = (Alumno)jcbAlumno.getSelectedItem();
    listaMaterias = (ArrayList)cd.obtenerMateriasCursadas(selec.getIdAlumno());
    
    for(Materia m: listaMaterias){
        modelo.addRow(new Object[]{m.getIdMateria(), m.getNombreMateria(), m.getAnio()});
    }
}
public void cargarNoInscriptas(){
    borrarFilasT();
    Conexion c = new Conexion();
    CursadaData cd = new CursadaData(c);
    Alumno selec = (Alumno)jcbAlumno.getSelectedItem();
    listaMaterias = (ArrayList)cd.obtenerMateriasNOCursadas(selec.getIdAlumno());
    
    for(Materia m: listaMaterias){
        modelo.addRow(new Object[]{m.getIdMateria(), m.getNombreMateria(), m.getAnio()});
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtInscriptas;
    // End of variables declaration//GEN-END:variables
}