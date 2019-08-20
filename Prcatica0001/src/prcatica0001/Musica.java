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
public class Musica {
    public String genero;
    public String nombre;
    public double duracion;
    
    public Musica()
    {
        genero="desconocido";
        nombre="desconocido";
        duracion=0;
        
    }
    public Musica(String genero, String nombre, double duracion )
    {
        this.duracion=duracion;
        this.genero=genero;
        this.nombre=nombre;
    }
    
}
