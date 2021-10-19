/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesobduniversidad;

import Controles.AlumnoData;
import Controles.Conexion;
import Modelos.Alumno;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author carlo_000
 */
public class AccesoBDUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      
        Conexion c = new Conexion();
        Alumno a1 = new Alumno("miranda", "Carlos",LocalDate.of(1983, 8, 9), 1005, true);
        AlumnoData ad = new AlumnoData(c);
        ad.guardarAlumno(a1);
        //System.out.println(ad.listarAlumnos());
    }
    
}
