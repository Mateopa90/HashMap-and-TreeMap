/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Facultad {
    private String Nombre;
    private HashMap<Integer,Estudiante> estudiantes;

    public Facultad(String Nombre) {
        this.Nombre = Nombre;
        this.estudiantes = new HashMap<>();
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public boolean addEstudiante(Estudiante estudiante){
        this.estudiantes.put(estudiante.getCodigo(),estudiante);
        return true;
    }
    
    
}
