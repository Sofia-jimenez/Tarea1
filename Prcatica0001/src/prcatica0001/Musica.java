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
    private String genero;
    private String nombre;
    private double duracion;
    
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
    public String getGenero ()
    {
        return this.genero;
    }
   public String getNombre ()
   {
       return this.nombre;
   }
   public double getDuracion ()
   {
       return this.duracion;
   }
   public void setGenero (String genero)
   {
       this.genero=genero;
   }
   public void setNombre (String nombre)
   {
       this.nombre=nombre;
   }
   public void setDuracion (double duracion)
   {
       this.duracion=duracion;
   }
   
}
