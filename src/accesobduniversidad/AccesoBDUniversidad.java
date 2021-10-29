/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesobduniversidad;

import Controles.AlumnoData;
import Controles.Conexion;
import Controles.MateriaData;
import Modelos.Alumno;
import Modelos.Materia;
import Vistas.VInscripcion;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo_000
 */
public class AccesoBDUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      try{
        Conexion c = new Conexion();
        Alumno a1 = new Alumno("Lopez", "Carlos",LocalDate.of(1983, 8, 9), 1006, true);
        AlumnoData ad = new AlumnoData(c);
        ad.guardarAlumno(a1);
        MateriaData md = new MateriaData(c);
        System.out.println((md.buscarMateria(19)).getNombreMateria());
         Materia m = new Materia("matemáticas", 1, true);
        // md.ingresarMateria(m);
        //System.out.println(ad.listarAlumnos());
        md.borrarMateria(212);
        System.out.println(ad.obtenerAlumnos());
    
    }catch (ClassNotFoundException ex) {
        Logger.getLogger(AccesoBDUniversidad.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
}