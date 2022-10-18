/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclases;

/**
 *
 * @author hola
 */
public class EjemploClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro();
        System.out.println("Perro 1");
        System.out.println(perro1.nombre);
        System.out.println(perro1.raza);
        System.out.println(perro1.tamanio);
        
        Perro perro2 = new Perro();
        System.out.println("Perro 2");
        System.out.println(perro2.nombre);
        System.out.println(perro2.raza);
        System.out.println(perro2.tamanio);
        
        Perro perro3 = new Perro("Coco","pitbull",60);
        System.out.println("Perro 3");
        System.out.println(perro3.nombre);
        System.out.println(perro3.raza);
        System.out.println(perro3.tamanio);
        
        Perro perro4 = new Perro("peluche",
                "chihuahua",10,"negro",2,0);
        System.out.println("Perro 4");
        System.out.println(perro4.nombre);
        System.out.println(perro4.raza);
        System.out.println(perro4.tamanio);
        
        perro1.ladra();
        perro2.ladra();
        perro3.ladra();
        perro4.ladra();
        
        perro1.camina();
        perro1.detente();
        
        perro3.camina();
        perro3.detente();
    }
    
}
