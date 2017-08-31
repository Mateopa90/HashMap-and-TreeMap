/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author Estudiante
 */
public class Estudiante {
    private String Nombre;
    private int Codigo;

    public Estudiante(String Nombre, int Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
    
}
