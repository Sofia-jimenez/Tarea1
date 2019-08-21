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
    private String marca;
    private double precio;
    private String color;
    
    
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
    public String getMarca()
    {
        return this.marca;
    }
    public double getPrecio()
    {
        return this.precio;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    
}
