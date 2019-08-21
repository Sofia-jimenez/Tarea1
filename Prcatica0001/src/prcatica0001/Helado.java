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
public class Helado {
    private String sabor;
    private String tamano;
    private double cantidad;
    
    
    public Helado()
    {
        sabor="desconocido";
        tamano="desconocido";
        cantidad=0;
    }
    public Helado(String sabor, String tamano, double cantidad)
    {
        this.cantidad=cantidad;
        this.sabor=sabor;
        this.tamano=tamano;
    }
    public String getSabor ()
    {
        return this.sabor;
    }
    public String getTamano ()
    {
        return this.tamano;
    }
    public double getCantidad ()
    {
        return this.cantidad;
    }
    public void setSabor (String sabor )
    {
        this.sabor=sabor;
                
    }
    public void setTamano (String tamano)
    {
        this.tamano=tamano;
    }
    public void setCantidad (double cantidad)
    {
        this.cantidad=cantidad;
    }
    
}
