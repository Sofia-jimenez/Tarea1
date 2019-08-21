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
    private String nombre;
    private double duracion;
    private int jugadores;
    
    
    
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
    public String getNombre()
    {
        return this.nombre;
    }
    public double getDuracion()
    {
        return this.duracion;
        
    }
    public int getJugadores()
    {
        return this.jugadores;
    }
    public void setNombre(String nombre )
    {
        this.nombre=nombre;
    }
    public void setDuracion(double duracion)
    {
        this.duracion=duracion;
    }
    public void setJugadores(int jugadores)
    {
        this.jugadores=jugadores;
    }
    
}
