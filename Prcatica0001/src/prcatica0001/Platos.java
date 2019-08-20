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
public class Platos {
    public String forma;
    public double medidas;
    public String tamano;
    
    
    public Platos()
    {
     forma="desconocida";
     medidas= 0;
     tamano="grande";
    }
    public Platos(String forma, double medidas, String tamano)
    {
        this.tamano=tamano;
        this.medidas=medidas;
        this.forma=forma;
    }
   

    
}
