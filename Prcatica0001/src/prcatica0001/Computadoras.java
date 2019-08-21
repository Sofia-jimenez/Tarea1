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
     private String marca;
    private double capacidad;
    private double precio;
    
    
    
    
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
    public String getMarca()
    {
        return this.marca;
    }
    public double getCapacidad()
    {
        return this.capacidad;
    }
    public double getPrecio()
    {
        return this.precio;
    }
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public void setCapacidad(double capacidad)
    {
        this.capacidad=capacidad;
    }
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
            }
