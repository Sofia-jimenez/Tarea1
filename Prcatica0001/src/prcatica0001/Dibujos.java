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
public class Dibujos {
    private String tamano;
    private String colores;
    private int numero;
    
    
    public Dibujos()
    {
        tamano="desconocido";
        colores="desconocido";
        numero=0;
        
    }
    public Dibujos(String tamano, String colores, int numero)
    {
         this.tamano=tamano;
         this.numero=numero;
         this.colores=colores;
    }
    public String getTamano ()
    {
        return this.tamano;
        

}
    public String getColores ()
    {
        return this.colores;
    }
    public int getNumero ()
    {
        return this.numero;
    }
    public void setTamano (String tamano)
    {
        this.tamano=tamano;
    }
    public void setColores (String colores)
    {
        this.colores=colores;
    }
    public void setNumero (int numero)
    {
        this.numero=numero;
    }
}
