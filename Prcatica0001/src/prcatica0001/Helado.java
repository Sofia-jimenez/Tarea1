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
    public String sabor;
    public String tamano;
    public double cantidad;
    
    
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
}
