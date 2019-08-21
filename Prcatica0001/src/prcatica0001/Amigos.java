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
    public String getTipos()
    {
        return this.tipos;
    }
    public int getValor()
    {
        return this.valor;
    }
    public int getCantidad()
    {
        return this.cantidad;
    }
    public void setTipos(String tipos)
    {
        this.tipos=tipos;
    }
    public void setValor(int valor)
    {
        this.valor=valor;
    }
    public void setCtantidad(int cantidad)
    {
        this.cantidad=cantidad;
    }

}
