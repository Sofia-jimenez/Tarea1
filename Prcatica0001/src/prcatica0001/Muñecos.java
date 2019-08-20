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
public class Muñecos {
      public String nombre;
    public double precio;
    public String calidad;
    
    
    
    public Muñecos()
    {
        nombre="desconocido";
        precio=0;
        calidad="desconocido";
    }
    public Muñecos(String nombre, double precio, String calidad)
    {
        this.calidad=calidad;
        this.nombre=nombre;
        this.precio=precio;
        
    }
}
