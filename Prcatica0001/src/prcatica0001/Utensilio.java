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
    public String tipo;
    public String tamano;
    public String material;
    
    
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
    
}