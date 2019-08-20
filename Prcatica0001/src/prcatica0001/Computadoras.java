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
public class Computadoras {
     public String marca;
    public double capacidad;
    public double precio;
    
    
    
    
    public Computadoras ()
    {
        marca="desconocidos";
        capacidad=0;
        precio=0;
    }
    public Computadoras(String marca, double capacidad, double precio)
    {
        this.capacidad=capacidad;
        this.marca=marca;
        this.precio=precio;
    }
}
