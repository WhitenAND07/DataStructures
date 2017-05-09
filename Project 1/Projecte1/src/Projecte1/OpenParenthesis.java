/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projecte1;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class OpenParenthesis implements Token{
  
    public OpenParenthesis() {
    }    
    
    public boolean sameClass (Token tk){               
    //Comprueba que el elemento tiene la misma clase que el que se pasa como parametro.
        return(this.getClass() == tk.getClass());
    }

    @Override
    public String toString(){
        return "(";
    }
    
}
