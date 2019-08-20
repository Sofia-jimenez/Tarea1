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
public class Taekwondo {
     public String protecciones;
    public double horas;
    public String progreso;
    
    
    public Taekwondo()
    {
        protecciones="desconocido";
        horas=0;
        progreso="desconocido";
    }
    
    public Taekwondo(String protecciones, double horas, String progreso)
    {
        this.horas=horas;
        this.progreso=progreso;
        this.protecciones=protecciones;
    }
}
