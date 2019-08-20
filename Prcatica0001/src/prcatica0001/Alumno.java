/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prcatica0001;

/**
 *
 * @author fofib
 */
public class Alumno {
    public String nombre;
    public int edad;
    public String sexo;
    
    
    public Alumno()
    {
        nombre="desconocido";
        edad=0;
        sexo="desconocido";
    }
    public Alumno(String nombre, int edad, String sexo)
    {
        this.edad=edad;
        this.nombre=nombre;
        this.sexo=sexo;
    }
    
    
}
