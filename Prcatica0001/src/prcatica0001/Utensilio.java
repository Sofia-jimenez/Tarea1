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
public class Utensilio {
    private String tipo;
    private String tamano;
    private String material;
    
    
    public Utensilio()
    {
        tipo="desconocido";
        tamano="desconocido";
        material="desconocido";
    
    }
    public Utensilio(String tipo, String tamano, String material)
    {
        this.tipo=tipo;
        this.tamano=tamano;
        this.material=material;
    }
    public String getTipo ()
    {
        return this.tipo;
    }
    public String getTamano ()
    {
        return this.tamano;
    }
    public String getMaterial ()
    {
        return this.material;
    }
    public void setTipo (String tipo)
    {
        this.tipo=tipo;
    }
    public void setTamano (String tamano)
    {
        this.tamano=tamano;
    }
    public void setMaterial (String material)
    {
        this.material=material;
    }
    
}