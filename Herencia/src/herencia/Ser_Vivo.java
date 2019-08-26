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
public class Ser_Vivo {
    private String genero;
    private int edad;
    private  String tipo;

    public Ser_Vivo() {
        this.genero = "";
        this.edad = 0;
        this.tipo = "";
    }

    public Ser_Vivo(String genero, int edad, String tipo) {
        this.genero = genero;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     
    
}
