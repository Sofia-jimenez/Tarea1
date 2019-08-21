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
    private String forma;
    private double medidas;
    private String tamano;
    
    
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
   public String getForma()
   {
       return this.forma;
   }
   public double getMedidas()
   {
       return this.medidas;
   }
   public String getTamano()
   {
       return this.tamano;
   }
   public void setForma(String forma)
   {
       this.forma=forma;
   }
   public void setMedidas( double medidas)
   {
       this.medidas=medidas;
   }
   public void setTamano(String tamano)
   {
       this.tamano=tamano;
   }

    
}
