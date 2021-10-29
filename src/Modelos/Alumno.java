package Modelos;

import java.sql.Date;
import java.time.LocalDate;

public class Alumno {
    
    private int idAlumno = -1;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private int legajo;
    private boolean activo;

    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNac, int legajo, boolean activo) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.legajo = legajo;
        this.activo = activo;
    }

    public Alumno(String apellido, String nombre, LocalDate fechaNac, int legajo, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.legajo = legajo;
        this.activo = activo;
    }

    public Alumno() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idAlumno+"-"+apellido;
    }
    
    
}
