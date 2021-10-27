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
public class Materia {
    private int idMateria;
    private String nombreMateria;
    private int anio;
    private boolean activo;

    public Materia() {
    }

    public Materia(String nombreMateria, int anio, boolean activo) {
        this.nombreMateria = nombreMateria;
        this.anio = anio;
        this.activo = activo;
    }

    public Materia(int idMateria, String nombreMateria, int anio, boolean activo) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.anio = anio;
        this.activo = activo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombreMateria + " anio=" + anio;
    }
    
    
}
