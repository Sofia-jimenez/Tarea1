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
public class Galletas {
    private String sabor;
    private int cantidad;
    private String nombre;
    
    
    public Galletas()
    {
        sabor="desconocido";
        cantidad=0;
        nombre="desconocido";
    }
    public Galletas(String sabor, int cantidad, String nombre)
    {
        this.cantidad=cantidad;
        this.nombre=nombre;
        this.sabor=sabor;
    }
    public String getSabor ()
    {
        return this.sabor;
    }
    public int getCantidad ()
    {
        return this.cantidad;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setSabor (String sabor)
    {
        this.sabor=sabor;
    }
    public void setCantidad (int cantidad)
    {
        this.cantidad=cantidad;
    }
    public void setNombre (String nombre)
    {
        this.nombre=nombre;
    }
}
