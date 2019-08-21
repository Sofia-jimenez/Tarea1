/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prcatica0001;

/**
 *
 * @author fofib
 */
public class Gato {
    private String nombre;
    private int edad;
    private String color;
    
    
    public Gato()
    {
        nombre="desconocido";
        edad=0;
        color="desconocido";
        
    }
    public Gato(String nombre, int edad, String color)
    {
        this.nombre="tequila";
        this.edad=3;
        this.color="blanco";
        
    }
    
   public String getNombre ()
   {
       return this.nombre;
   }
   public int getEdad ()
   {
       return this.edad;
   }
   public String getColor() 

   {
    return this.color;   
   }
   public void setNombre (String nombre )
   {
       this.nombre=nombre;
   }
   public void setEdad (int edad)
   {
       this.edad=edad;
   }
   public void setColor (String color)
   {
       this.color=color;
   }
}