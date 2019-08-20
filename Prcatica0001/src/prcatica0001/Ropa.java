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
public class Ropa {
     public String tipo;
    public double precio;
    public String tela;
    
    
    public Ropa()
    {
        tipo="desconocido";
        precio=0;
        tela="desconocido";
    }
    public Ropa(String tipo, double precio, String tela)
    {
        this.tipo=tipo;
        this.tela=tela;
        this.precio=precio;
        
    }
    
}
