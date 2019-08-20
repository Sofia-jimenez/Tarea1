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
public class Amigos {
    public String tipos;
    public int valor;
    public int cantidad;
    
    
    public Amigos()
    {
        tipos="desconocido";
        valor=0;
        cantidad=0;
        
    }
    public Amigos(String tipos, int valor, int cantidad)
    {
        this.tipos=tipos;
        this.valor=valor;
        this.cantidad=cantidad;
    }    
    
}
