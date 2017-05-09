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
public class Lector extends Professor{

    
    protected String grec;
    
    /////////////Constructor/////////////////
    public Lector (String nombre, String dni, String despatx, String grec){
        super (nombre,dni,despatx); //Crea un Lector y tambien da de alta el Professor con nombre, dni y despatx.
        this.grec= grec;
    
    }
        
    
    ////////GETTERS///////////
    public String getGrec() {
        return this.grec;
    }

    ////////SETTERS///////////
    public void setGrec(String grec){
        this.grec = grec;
    }

    
    @Override
    public String toString(){
        return super.toString() + " " + getGrec();
    }
        
}
