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
public class Carros {
    public String marca;
    public double precio;
    public String color;
    
    
    public Carros()
    {
        marca="desconocida";
        precio=0;
        color="desconocido";
        
    }
    public Carros(String marca, double precio, String color)
    {
        this.marca=marca;
        this.precio=precio;
        this.color=color;
    }
}
