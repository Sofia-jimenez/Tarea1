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
public class Acuatico extends Ser_Vivo  {
    private String caracteristicas;
    private  int catidad;
    private String SeguroONoseguro;

    public Acuatico() {
        
        this.caracteristicas = "";
        this.catidad =0;
        this.SeguroONoseguro = "";
    }

    public Acuatico( String caracteristicas, int catidad, String SeguroONoseguro) {
        
        this.caracteristicas = caracteristicas;
        this.catidad = catidad;
        this.SeguroONoseguro = SeguroONoseguro;
    }

    
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getCatidad() {
        return catidad;
    }

    public void setCatidad(int catidad) {
        this.catidad = catidad;
    }

    public String getSeguroONoseguro() {
        return SeguroONoseguro;
    }

    public void setSeguroONoseguro(String SeguroONoseguro) {
        this.SeguroONoseguro = SeguroONoseguro;
    }
    
    
}
