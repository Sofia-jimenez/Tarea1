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
public class Perro {
    public String nombre;
    public int edad;
    public String raza;
    
    public Perro()
    {
        nombre="desconocido";
        edad=0;
        raza="desconocido";
        
    }
    public Perro(String nombre, int edad, String raza)
    {
    this.nombre=nombre;
    this.edad=edad;
    this.raza=raza;
    
    }
    
    
}