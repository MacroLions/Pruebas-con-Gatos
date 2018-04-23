/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacion.de.gatos;

/**
 *
 * @author UCA
 */
public class Gato {
    public String nombre;
    public String raza;
    private int ID;
    public int edad;
    public String colorPelaje;
    public String colorOjos;
    public String size;
    
    public Gato(String nombre, String raza, int edad, String colorPelaje, String colorOjos, String size){
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
        this.colorPelaje=colorPelaje;
        this.colorOjos=colorOjos;
        this.size=size;
        
    }
    
    public Gato(){
    
    }
    
    public Gato(String nombre){
        this.nombre=nombre;
        setID();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getID() {
        return ID;
    }

    public void setID() {
        this.ID = (int)(1000000*Math.random());   
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
    //Cosas que puede hacer el gato (?????)
    
    public void maullar(){
        System.out.println(getNombre()+": Miau");
    }
    
    public void morir(){
        System.out.println(getNombre()+" ha fallecido");
    }
    
    public void rasgar (){
        System.out.println(getNombre()+ " aruño a alguien");
    }
    
    public void trucoMagico (){
        System.out.println("El gato "+getNombre()+" activa su Noble Phantasm!");
    }
    
    public void bailar(){
        System.out.println("El gato "+getNombre()+" ha bailado.");
    }
    
    public void ponerMusica(){
        System.out.println("El gato "+ getNombre()+ " puso musica");
    }
    
    public void cantar(){
        System.out.println("El gato "+ getNombre()+ " comenzo a cantar");
    }
}
