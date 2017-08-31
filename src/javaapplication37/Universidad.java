/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.ArrayList;
import java.util.TreeMap;


public class Universidad {
    private String Nombre;
    private ArrayList<Facultad> Facultades;
    private TreeMap<Integer, Estudiante> Estudiantes;

    public Universidad(String Nombre) {
        this.Nombre = Nombre;
        this.Facultades = new ArrayList<>();
        this.Estudiantes = new TreeMap<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public boolean AddFacultad(String nombre){
        Facultad facultad = new Facultad(Nombre);
        if(this.Facultades.add(facultad))
            return true;
        else
            return false;
        
    }
    
    public ArrayList<Facultad> ListarFacultad(){
        return (ArrayList)this.Facultades;
    }
    
    public ArrayList<Estudiante> ListarEstudiante(){
        return (ArrayList)this.Estudiantes.values();
    }
    
    public boolean addEstudiante(Estudiante estudiante){
        if(this.Estudiantes.put(estudiante.getCodigo(), estudiante)!=null)
            return true;
        else
            return false;
    }
    
    public boolean addEstudianteFacultad (String nombreFacultad, Estudiante estudiante){
        boolean resultado = false;
        for(Facultad facultad: Facultades){
            if (this.Facultades.getNombre().equals(nombreFacultad)){
                this.Facultades.addEstudiante(estudiante);
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    
}
