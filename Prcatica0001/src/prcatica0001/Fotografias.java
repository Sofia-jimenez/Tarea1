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
public class Fotografias {
     public String forma;
    public double precio;
    public String color;
    
    
    
    public Fotografias()
    {
        forma="desconocido";
        precio=0;
        color="desconocido";
        
    }
    public Fotografias(String forma, double precio, String color)
    {
        this.color=color;
        this.forma=forma;
        this.precio=precio;
    }
}
