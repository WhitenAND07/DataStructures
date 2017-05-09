/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projecte2;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class Client {
    private int Tllegada;
    private int Tsalida;
   
    
    public Client(int llegando){
        Tllegada= llegando;
        Tsalida=0;
    }
    
    ////////// GETTERS ////////////
    public int getTllegada(){
        return this.Tllegada;
    }

    public int getTsalida(){
        return this.Tsalida;
    }
    
    public int getTotal(){
        return (this.Tsalida - this.Tllegada);
    }
    
    
    //////////// SETTERS /////////
    public void setTllegada(int x){
        this.Tllegada = x;
    }
    
    public void setTSalida(int x){
        this.Tsalida = x;
    }
}
