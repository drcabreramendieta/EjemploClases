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
public class Perro {
    String nombre;
    String raza;
    int tamanio;
    String color;
    int peso;
    int edad;
    
    public Perro(){
        nombre = "Pipo";
        raza = "Pug";
        tamanio = 25;
    }
    
    public Perro(String nombre, String raza, int tamanio){
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
    }

    public Perro(String nombre, String raza, int tamanio, String color, int peso, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.color = color;
        this.peso = peso;
        this.edad = edad;
    }
    
    public void ladra(){
        System.out.println(this.nombre + " Guau Guau");
    }
    
    public void camina(){
        System.out.println(this.nombre + " caminando...");
    }
    
    public void detente(){
        System.out.println(this.nombre + " detenido...");
    }
}
