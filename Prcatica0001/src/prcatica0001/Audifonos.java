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
public class Audifonos {
     private  String marca;
    private double precio;
    private String calidad;
     
    public Audifonos()
    {
        marca="desconocida";
        precio=0;
        calidad="desconocido";
    }
    public Audifonos (String marca, double precio, String calidad)
    {
        this.calidad=calidad;
        this.marca=marca;
        this.precio=precio;
    }
    public String getMarca()
    {
        return this.marca;
    }
    public double getPrecio()
    {
        return this.precio;
    }
    public String getCalidad()
    {
        return this.calidad;
    }
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
    public void setCalidad(String calidad)
    {
        this.calidad=calidad;
    }
    
    
}
