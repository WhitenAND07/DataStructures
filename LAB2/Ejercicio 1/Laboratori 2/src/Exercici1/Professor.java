/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici1;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */

public class Professor extends Persona{

    /*String nombre;
    String dni;*/
    protected String despatx;
    
    /////////////Constructor/////////////////
    public Professor (String nombre, String dni, String despatx){
        super (nombre,dni);     //Crea el profesor y creara la persona con nombre y Dni
        this.despatx= despatx;
    
    }
    
   
    ////////GETTERS///////////
    public String getDespatx() {
        return this.despatx;
    }

    ////////SETTERS///////////
    public void setDespatx(String despatx){
        this.despatx = despatx;
    }

    
    @Override
    public String toString(){
        return super.toString() + " " + getDespatx();
    }
    
    
    
    
}