
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prcatica0001;

/**
 *
 * @author fofib
 */
public class Prcatica0001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro pan=new Perro("hope", 8, "pug");
        pan.edad=40;
        pan.nombre="jordan";
        pan.raza= "gran danes";
        
        
        Gato cacerola=new Gato("kity", 10, "gris");
       cacerola.setNombre("hola");
      
        System.out.println(cacerola.getNombre());
        cacerola.setColor("rosa");
         System.out.println(cacerola.getColor());
        Utensilio ja=new Utensilio("tenedor","mediano","metal");
       
        
        Platos redo=new Platos ("redonda",10,"mediano");
        
        
        Musica pop=new Musica ("pop","caso perdido",3.3 );
       
        
        
        Dibujos bonis= new Dibujos("chico","blanco y negro",3);
        
        
        
       Carros ford=new Carros("ford",20000,"azul");
       
       
       
       Ropa aeropostale=new Ropa("sudadera",500 , "algodon");
       aeropostale.precio=250;
       aeropostale.tela="fina";
       aeropostale.tipo="camisa";
       
       
       Amigos buenos= new Amigos("regulares",60,10 );
       buenos.cantidad=5;
       buenos.tipos= "buenos";
       buenos.valor=100;
       
       
       Basquetbol equipo=new Basquetbol("titanes",40 , 12);
       equipo.duracion= 50;
       equipo.jugadores=10;
       equipo.nombre="CDN";
       
       Alumno sofia= new Alumno ("sofia",19 ,"femenino");
       sofia.edad=18;
       sofia.nombre="aranza";
       sofia.sexo="femenino";
       
       Bebidas nara= new Bebidas("hola",600,"regular");
       nara.calidad="excelente ";
       nara.mililitros=600;
       nara.nombre="riiii";
       
       Fotografias cuadra =new Fotografias("cuadrada",20,"blanco y negro");
       cuadra.color="colores brillantes";
       cuadra.forma="redonda";
       cuadra.precio=180;
       
       Audifonos chidos= new Audifonos("sony",2000,"excelente");
       chidos.calidad="buena";
       chidos.marca="hp";
       chidos.precio=1800;
       
       Libretas feas=new Libretas("scrib",10,6);
       feas.cantidad=100;
       feas.marca="de las buenas";
       feas.precio=10;
       
        Galletas naaa= new Galletas("vainilla",20,"de las buenas jeje");
        naaa.cantidad=25;
        naaa.nombre="estas si";
       naaa.sabor="chocolate";
        
       Helado rico=new Helado("napolitano","mediano",200);
       rico.cantidad=300;
       rico.sabor="nuez";
       rico.tamano="grande";
       
       Computadoras lenovo=new Computadoras("lenovo",2000,19000);
       lenovo.capacidad=30000;
       lenovo.marca="hp";
       lenovo.precio=15000;
               
       Muñecos  peluches=new Muñecos("peluches",300,"buena");
       peluches.calidad="excelente";
       peluches.nombre="barbies";
       peluches.precio=500;
               
               
       Taekwondo fuerte=new Taekwondo("coderas y espinilleras",2,"regular");
       fuerte.horas=4;
       fuerte.progreso="excelente";
       fuerte.protecciones="peto y careta";
        
    }
    
    
}