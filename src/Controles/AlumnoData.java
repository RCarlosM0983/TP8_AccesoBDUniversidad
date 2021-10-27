
package Controles;

import Modelos.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

  public class AlumnoData {
    private Connection con = null;
  
  public AlumnoData(Conexion connA){
      
        this.con = connA.conectar();
    }
  
  public void guardarAlumno(Alumno a){
    String sql = "INSERT INTO alumno(apellido, nombre, FechaNac, legajo, activo) VALUES ( ?, ?, ?, ?, ? )";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, a.getApellido());
            ps.setString(2, a.getNombre());
            ps.setDate(3, Date.valueOf(a.getFechaNac()));
            ps.setInt(4, a.getLegajo());
            ps.setBoolean(5, a.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                a.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el alumno");
        }
    }

  public List<Alumno> obtenerAlumnos(){
        Alumno a;
        ArrayList<Alumno> alumnos=new ArrayList<>();        
        String sql="SELECT * FROM alumno";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
        
            while(rs.next()){
                a = new Alumno();
                a.setLegajo(rs.getInt("legajo"));
                a.setActivo(rs.getBoolean("activo"));
                a.setNombre(rs.getString("nombre"));
                a.setApellido(rs.getString("apellido"));
                a.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                a.setIdAlumno(rs.getInt("idAlumno"));
                alumnos.add(a);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
        return alumnos;
    }
   
  public Alumno buscarAlumno(int idAlumno){
      Alumno a = null;
      String sql = "SELECT * FROM alumno WHERE idAlumno = ? AND activo = true ";
      
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                a = new Alumno();
                
                a.setIdAlumno(rs.getInt("idAlumno"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                a.setLegajo(rs.getInt("legajo"));
                a.setActivo(rs.getBoolean("activo"));
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
   
    return a;
  }
  
  public void borrarAlumno(int idAlumno){
      String sql = "UPDATE alumno SET activo = false WHERE idAlumno = ?";
       try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, idAlumno);
      if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Alumno borrado");
      }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar alumno");
        }   
    }
  
  public void actualizarAlumno(Alumno a){
        try {
            String sql = "UPDATE alumno SET apellido = ?, nombre = ?, fechaNac = ?, legajo = ?, activo = ? WHERE idAlumno = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            //ps.setInt(6, a.getIdAlumno());
            ps.setString(1, a.getApellido());
            ps.setString(2, a.getNombre());
            ps.setDate(3, Date.valueOf(a.getFechaNac()));
            ps.setInt(4, a.getLegajo());
            ps.setBoolean(5, a.isActivo());
            
           if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Alumno actualizado");
      }else{
              JOptionPane.showMessageDialog(null, "El alumno no existe"); 
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar alumno");
        }
  }
}
