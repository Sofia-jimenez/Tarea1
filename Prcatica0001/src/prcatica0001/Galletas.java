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
    public String sabor;
    public int cantidad;
    public String nombre;
    
    
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
}
