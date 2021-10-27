/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author carlo_000
 */
public class Cursada {
    
    private int idCursada=-1;
    private Alumno alumno;
    private Materia materia;
    private float nota;
    private boolean activo;

    public Cursada(int idCursada, Alumno alumno, Materia materia, float nota, boolean activo) {
        this.idCursada = idCursada;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.activo = activo;
    }

    public Cursada(Alumno alumno, Materia materia, float nota, boolean activo) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.activo = activo;
    }

    public Cursada() {
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
