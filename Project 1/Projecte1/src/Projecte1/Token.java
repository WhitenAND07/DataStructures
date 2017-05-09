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
public interface Token {
    
     
    public boolean sameClass (Token tk);             
    //Comprueba que el elemento tiene la misma clase que el que se pasa como parametro.
    
    public static boolean checkOpen(Token tk){ //Comprueba si es un simbolo abierto
        
        Token OpenParenthesis = new OpenParenthesis();
        Token OpenCurly = new OpenCurly();
        
        return (OpenParenthesis.sameClass(tk) || OpenCurly.sameClass(tk));
    }
    
    public static boolean correctParenthesis(Token open, Token close){          
    //Comprueba si el buffer es un OpenParentesi y el elemento es un ClosingParentesi
        Token OpenParenthesis = new OpenParenthesis();
        Token ClosingParenthesis = new ClosingParenthesis();
        
        return (open.sameClass(OpenParenthesis) && close.sameClass(ClosingParenthesis));
    }
    
    public static boolean correctCurly (Token open, Token close){         
    //Comprueba si el buffer es un OpenClaudator y el elemento es un ClosingClaudator
        Token OpenCurly = new OpenCurly();
        Token ClosingCurly = new ClosingCurly();
        
        return (open.sameClass(OpenCurly) && close.sameClass(ClosingCurly));
    }
}
