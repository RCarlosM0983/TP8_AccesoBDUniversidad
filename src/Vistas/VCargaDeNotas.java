package Vistas;

import Controles.AlumnoData;
import Controles.Conexion;
import Controles.CursadaData;
import Controles.MateriaData;
import Modelos.Alumno;
import Modelos.Cursada;
import Modelos.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VCargaDeNotas extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    private ArrayList<Cursada> listaCursada;
    private ArrayList<Materia> listaMaterias;
    private ArrayList<Alumno> listaAlumnos;
    private CursadaData cursadaData;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private Conexion conexion;
    
    public VCargaDeNotas() {
       
        initComponents();
        try{
        conexion=new Conexion();
        modelo=new DefaultTableModel();
        
        cursadaData=new CursadaData(conexion);
        listaCursada=(ArrayList)cursadaData.obtenerCursadas();
        
        materiaData=new MateriaData(conexion);
        listaMaterias=(ArrayList)materiaData.obtenerMaterias();
        
        alumnoData=new AlumnoData(conexion);
        listaAlumnos=(ArrayList)alumnoData.obtenerAlumnos();
        
        for(Alumno item:listaAlumnos){
            jcbAlumno.addItem(item);            
        }
        cargarAlumnos();
        armarCabecera();
        borrarFilasT();
        cargarTabla();
        } catch (ClassNotFoundException ex) {
            System.out.println("error Vista Cargar Notas " + ex);
        }
        
    }
     private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Nota");
        
        for(Object it: columnas){
            modelo.addColumn(it);
        }
        jtCargaNotas.setModel(modelo);
    }
    
     public void cargarAlumnos(){          
         for (Alumno item:listaAlumnos){
            jcbAlumno.addItem(item);
        }
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCargaNotas = new javax.swing.JTable();
        jbnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Seccion Notas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText(" Alumno");

        jcbAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnoItemStateChanged(evt);
            }
        });
        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jtCargaNotas.setBackground(new java.awt.Color(153, 204, 255));
        jtCargaNotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtCargaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Materia", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCargaNotas);

        jbnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbnGuardar.setText("Guardar");
        jbnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnGuardarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        
      borrarFilasT();
      cargarTabla();
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jcbAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnoItemStateChanged
        // TODO add your handling code here:
        borrarFilasT();
        cargarTabla();
    }//GEN-LAST:event_jcbAlumnoItemStateChanged

    private void jbnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnGuardarActionPerformed
        
        int filaSeleccionada=jtCargaNotas.getSelectedRow();
            if (filaSeleccionada!=-1){
        //        Alumno a=(Alumno)jcbAlumno.getSelectedItem();
          //      Cursada c=new Cursada();
            //    int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
             //   int nota=Integer.valueOf((String)modelo.getValueAt(filaSeleccionada,2));
                
             String id =jtCargaNotas.getValueAt(filaSeleccionada, 0).toString();
             String nota = jtCargaNotas.getValueAt(filaSeleccionada, 2).toString();
             
                CursadaData cd = new CursadaData(conexion);
                
            //    cd.actualizarNotaCursada(c.getIdCursada(),nota);
             cd.actualizarNotaCursada(Integer.parseInt(id), Float.parseFloat(nota)); 
            JOptionPane.showMessageDialog(null, "Nota modificada");
                borrarFilasT();                
            }           
    }//GEN-LAST:event_jbnGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

public void borrarFilasT(){
    int fila = modelo.getRowCount()-1;
    for(int i=fila; i>=0; i--){
       modelo.removeRow(i);
    }
}
private void cargarTabla(){
    
    borrarFilasT();
            
    Alumno a = (Alumno)jcbAlumno.getSelectedItem();
    int id = a.getIdAlumno();
    List<Cursada>listCurs = cursadaData.obtenerCursadasxAlumno(id);
    for(Cursada curs: listCurs){
        modelo.addRow(new Object[]{curs.getIdCursada(), (curs.getMateria()).getNombreMateria(), curs.getNota()});
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnGuardar;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JTable jtCargaNotas;
    // End of variables declaration//GEN-END:variables
}
