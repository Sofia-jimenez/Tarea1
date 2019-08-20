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
public class Libretas {
    public String marca;
    public int cantidad;
    public double precio;
    
    public Libretas()
    {
        marca="desconocida";
        cantidad=0;
        precio=0;
        
    }
    
    public Libretas(String marca, int cantidad, double precio)
    {
        this.cantidad=cantidad;
        this.marca=marca;
        this.precio=precio;
    }
}
