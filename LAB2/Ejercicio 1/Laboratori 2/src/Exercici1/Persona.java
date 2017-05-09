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
public class Persona{

    protected String nombre;
    protected String dni;
    
    ///////////  Constructor  //////////////
    public Persona (String nombre,String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    
    //////// SETTERS ///////////////////
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setDni (String dni){
        this.dni = dni;
    }
    
    
    ///////// GETTERS ////////////
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    
    @Override
    public String toString(){
        return getNombre() + " " + getDni();
    }
    
    
    
    
    
    
    
    
}