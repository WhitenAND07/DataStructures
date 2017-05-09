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
public class Cotxe implements Comparable <Cotxe>{
    
    protected String nombre;
    protected String matricula;
    
    ///////////  Constructor  //////////////
    public Cotxe (String nombre,String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }

    
    //////// SETTERS ///////////////////
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setMatricula (String matricula){
        this.matricula = matricula;
    }
    
    
    ///////// GETTERS ////////////
    public String getNombre(){
        return this.nombre;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    
    
    @Override
    public String toString(){
        return getNombre() + ", " + getMatricula();
    }
    
    ///////////  COMPARADOR 2 PERSONAS  //////////////
    @Override
    public int compareTo(Cotxe otro){
    
        return this.matricula.compareTo(otro.matricula);
    }   
     
}

