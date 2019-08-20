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
public class Bebidas {
    public String nombre;
    public double mililitros;
    public String calidad;
    
    
    public Bebidas()
    {
        nombre="desconocido";
        mililitros=0;
        calidad="desconocido";
        
    }
    public Bebidas(String nombre, double mililitros, String calidad)
    {
        this.calidad=calidad;
        this.mililitros=mililitros;
        this.nombre=nombre;
    }
    
}
