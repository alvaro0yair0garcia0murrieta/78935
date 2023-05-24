package com.salones.salones_api;

import java.util.ArrayList;

public class Classroom {
    String numero;
    String caracteristicas;
    ArrayList <Profesor> profesores;
 
 
    public Classroom(String numero, String caracteristicas, ArrayList<Profesor> profesores) {
        this.numero = numero;
        this.caracteristicas = caracteristicas;
        this.profesores = profesores;
    }

    public Classroom(String numero, String caracteristicas) {
        this.numero = numero;
        this.caracteristicas = caracteristicas;
    }

    public Classroom(String numero, ArrayList<Profesor> profesores) {
        this.numero = numero;
        this.profesores = profesores;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public ArrayList<Profesor> getStudents() {
        return profesores;
    }
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void setProfesore(Profesor profesor)
{
    
}

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Salon [numero=" + numero + ", caracteristicas=" + caracteristicas + ", profesores=" + profesores + "]";
    }

    public void addStudent(Profesor student) {
    }
    
    
}
