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
    public String tamano;
    public String colores;
    public int numero;
    
    
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
}
