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
     public  String marca;
    public double precio;
    public String calidad;
     
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
    
}
