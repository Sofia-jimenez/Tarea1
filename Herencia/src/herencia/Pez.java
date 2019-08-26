/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author fofib
 */
public class Pez extends Acuatico {
    private double tamano;
    private double peso;
    private String color;
    private String nombre;

    public Pez() {
        this.tamano = 0;
        this.peso = 0;
        this.color = "";
        this.nombre="";
    }

    public Pez(double tamano, double peso, String color,String nombre) {
        this.tamano = tamano;
        this.peso = peso;
        this.color = color;
        this.nombre= nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
