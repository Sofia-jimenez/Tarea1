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
public class Alumno {
    private String nombre;
    private int edad;
    private String sexo;
    
    
    public Alumno()
    {
        nombre="desconocido";
        edad=0;
        sexo="desconocido";
    }
    public Alumno(String nombre, int edad, String sexo)
    {
        this.edad=edad;
        this.nombre=nombre;
        this.sexo=sexo;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public int getEdad()
    {
        return this.edad;
    }
    public String getSexo()
    {
        return this.sexo;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
        
        
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    public void setSexo(String sexo)
    {
        this.sexo=sexo;
    }
            
    
    
}
