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
public class Basquetbol {
    public String nombre;
    public double duracion;
    public int jugadores;
    
    
    
    public Basquetbol()
    {
        nombre="desconocido";
        duracion=0;
        jugadores=0;
        
    }
    public Basquetbol(String nombre, double duracion, int jugadores)
    {
        this.duracion=duracion;
        this.jugadores=jugadores;
        this.nombre=nombre;
        
    }
    
}
