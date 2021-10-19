
package Controles;

import Modelos.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {
    private Connection con = null;

    public AlumnoData(Conexion connA){
      
        try {
            this.con = connA.conectar();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void guardarAlumno(Alumno a){
    String sql = "INSERT INTO alumno(apellido, nombre, FechaNac, legajo, activo) VALUES (?,?,?,?,?)";
    
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

  public  List<Alumno> listarAlumnos(){
      ArrayList<Alumno> listaAlumnos = new ArrayList<>();
      String sql = "SELECT * FROM alumno WHERE activo = true";
      
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Alumno a = new Alumno();
                a.setIdAlumno(rs.getInt("idAlumno"));
                a.setApellido(rs.getString(2));
                a.setNombre(rs.getString("nombre"));
                a.setFechaNac(rs.getDate(4).toLocalDate());
                a.setLegajo(rs.getInt("legajo"));
                a.setActivo(rs.getBoolean(6));
                
                listaAlumnos.add(a);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener alumno");
        }
        return listaAlumnos;
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
            ps.setInt(6, a.getIdAlumno());
            ps.setString(1, a.getApellido());
            ps.setString(2, a.getNombre());
            ps.setDate(3, Date.valueOf(a.getFechaNac()));
            ps.setInt(4, a.getLegajo());
            ps.setBoolean(5, a.isActivo());
            
           if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Alumno borrado");
      }else{
              JOptionPane.showMessageDialog(null, "El alumno no existe"); 
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erroral actualizar alumno");
        }
  }
}
