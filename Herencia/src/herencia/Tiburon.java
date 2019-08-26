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
public class Tiburon extends Acuatico {
    private double peso;
    private String tamano;
    private String color;
    private String nombre;

    public Tiburon() {
        this.peso = 0;
        this.tamano = "";
        this.color = "";
        this.nombre = "";
    }

    public Tiburon(double peso, String tamano, String color, String nombre) {
        this.peso = peso;
        this.tamano = tamano;
        this.color = color;
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
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
