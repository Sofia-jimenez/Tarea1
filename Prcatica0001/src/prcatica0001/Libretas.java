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
    private String marca;
    private int cantidad;
    private double precio;
    
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
    public String getMarca ()
    {
        return this.marca;
    }
    public int getCantidad ()
    {
        return this.cantidad;
    }
    public double getPrecio ()
    {
        return this.precio;
    }
    public void setMarca (String marca)
    {
        this.marca=marca;
    }
    public void setCantidad (int cantidad)
    {
        this.cantidad=cantidad;
    }
    public void setPrecio (double precio)
    {
        this.precio=precio;
    }
}
