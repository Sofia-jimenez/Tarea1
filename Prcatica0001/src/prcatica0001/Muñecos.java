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
      private String nombre;
    private double precio;
    private String calidad;
    
    
    
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
    public String getaNombre ()
    {
        return this.nombre;
    }
    public double getPrecio ()

    {
        return this.precio;
    }
    public String getCalidad ()
    {
        return this.calidad;
    }
    public void setNombre (String nombre)
    {
        this.nombre=nombre;
    }
    public void setPrecio (double precio)
    {
        this.precio=precio;
    }
    public void setCalidad (String calidad)
    {
        this.calidad=calidad;
    }
}
