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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ser_Vivo ma=new Ser_Vivo("macho",10,"animal");
        ma.setGenero("hembra");
        System.out.println(ma.getGenero());
        ma.setEdad(20);
        System.out.println(ma.getEdad());
        ma.setTipo("plantas");
        System.out.println(ma.getTipo());
        
       Acuatico me= new Acuatico("con patas ", 1000 ,"seguro ");
       me.setCaracteristicas("con laetas");
       System.out.println(me.getCaracteristicas());
       me.setCatidad(100000);
       System.out.println(me.getCatidad());
       me.setSeguroONoseguro("no seguro");
       System.out.println(me.getSeguroONoseguro());
       
       Pez mo= new Pez(20,50,"azul","espada");
       mo.setTamano(10);
       System.out.println(mo.getTamano());
       mo.setPeso(35);
       System.out.println(mo.getPeso());
       mo.setColor("amarillo");
       System.out.println(mo.getColor());
       mo.setNombre("payaso");
       System.out.println(mo.getNombre());
       
       Tiburon mi=new Tiburon(150,"grande","gris","tiburon ballena");
       mi.setPeso(100);
       System.out.println(mi.getPeso());
       mi.setTamano("mediano");
       System.out.println(mi.getTamano());
       mi.setColor("blanco");
       System.out.println(mi.getColor());
       mi.setNombre("tiburon blanco");
       System.out.println(mi.getNombre());
       
       
       
       
       
       
       
        
        
        
        
        
        
        
        
        
    }
    
}
