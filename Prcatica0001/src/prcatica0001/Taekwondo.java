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
     private String protecciones;
    private double horas;
    private String progreso;
    
    
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
    public String getProtecciones ()
    {
        return this.protecciones;
    }
    public double getHoras ()
    {
        return this.horas;
    }
    public String getProgreso ()
    {
        return this.progreso;
    }
    public void setProtecciones (String protecciones)
    {
        this.protecciones=protecciones;
    }
    public void setHoras (double horas)
    {
        this.horas=horas;
    }
    public void setProgreso (String progreso)
    {
        this.progreso=progreso;
    }
}
