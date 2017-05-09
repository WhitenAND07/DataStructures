/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class Persona implements Comparable <Persona>{

    protected String nombre;
    protected String dni;
    
    ///////////  Constructor  //////////////
    public Persona (String dni,String nombre){
        this.dni = dni;
        this.nombre = nombre;
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
        return getDni() + ", " + getNombre();
    }
    
    
    ///////////  COMPARADOR 2 PERSONAS  //////////////
    @Override
    public int compareTo(Persona other){
    
        return this.dni.compareTo(other.dni);
    }    
     
}