/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projecte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class Parser {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testCase_1(); // aquest joc de proves hauria de ser OK
        testCase_2(); // joc de proves incorrecte; expressiÃ³ mal formada
        testCase_3(); // joc de proves incorrecte; expressiÃ³ comenÃ§a amb un closing
        testCase_4(); // joc de proves correcte;
        testCase_5(); // joc de proves incorrecte; nÂº de elementos impar
    }             
    
    public static void testCase_1 ()
    {
        ArrayList<Token> tokens = new ArrayList<Token> ();
        
        OpenParenthesis openParenthesis = new OpenParenthesis ();
        ClosingParenthesis closeParenthesis = new ClosingParenthesis ();
        
        OpenCurly openCurly = new OpenCurly ();
        ClosingCurly closeCurly = new ClosingCurly ();
        
        tokens.add(openParenthesis);
        tokens.add(openCurly);
        tokens.add(closeCurly);
        tokens.add(closeParenthesis);
        
        System.out.println("Test case 1");
        
        System.out.println("-------");
        
        for (Token token : tokens) {
            System.out.println(token.toString());
        }
        
        System.out.println("-------");
        
        if (parse(tokens))
        {
            System.out.println("Resultat: ExpressiÃ³ correcte");
            System.out.println("-------");
        }
        else
        {
            System.out.println("Resultat: ExpressiÃ³ incorrecte");
            System.out.println("-------");
        }
    }
    
    public static void testCase_2()
    {
        ArrayList<Token> tokens = new ArrayList<Token> ();
        
        OpenParenthesis openParenthesis = new OpenParenthesis ();
        ClosingParenthesis closeParenthesis = new ClosingParenthesis ();
        
        OpenCurly openCurly = new OpenCurly ();
        ClosingCurly closeCurly = new ClosingCurly ();
        
        tokens.add(openParenthesis);
        tokens.add(openCurly);
        tokens.add(closeParenthesis);
        tokens.add(closeCurly);
        
        System.out.println("Test case 2");
        
        System.out.println("-------");
        
        for (Token token : tokens) {
            System.out.println(token.toString());
        }
        
        System.out.println("-------");
        
        if (parse(tokens))
        {
            System.out.println("Resultat: ExpressiÃ³ correcte");
            System.out.println("-------");
        }
        else
        {
            System.out.println("Resultat: ExpressiÃ³ incorrecte");
            System.out.println("-------");
        }
    }
    
    public static void testCase_3()
    {
        ArrayList<Token> tokens = new ArrayList<Token> ();
        
        OpenParenthesis openParenthesis = new OpenParenthesis ();
        ClosingParenthesis closeParenthesis = new ClosingParenthesis ();
        
        OpenCurly openCurly = new OpenCurly ();
        ClosingCurly closeCurly = new ClosingCurly ();
        
        tokens.add(closeParenthesis);
        tokens.add(openParenthesis);
        tokens.add(openCurly);        
        tokens.add(closeCurly);
        
        System.out.println("Test case 3");
        
        System.out.println("-------");
        
        for (Token token : tokens) {
            System.out.println(token.toString());
        }
        
        System.out.println("-------");
        
        if (parse(tokens))
        {
            System.out.println("Resultat: ExpressiÃ³ correcte");
            System.out.println("-------");
        }
        else
        {
            System.out.println("Resultat: ExpressiÃ³ incorrecte");
            System.out.println("-------");
        }
    }
    public static void testCase_4()
    {
        ArrayList<Token> tokens = new ArrayList<Token> ();
        
        OpenParenthesis openParenthesis = new OpenParenthesis ();
        ClosingParenthesis closeParenthesis = new ClosingParenthesis ();
        
        OpenCurly openCurly = new OpenCurly ();
        ClosingCurly closeCurly = new ClosingCurly ();
        
        tokens.add(openParenthesis);
        tokens.add(closeParenthesis);
        tokens.add(openCurly);        
        tokens.add(closeCurly);
        
        
        
        System.out.println("Test case 4");
        
        System.out.println("-------");
        
        for (Token token : tokens) {
            System.out.println(token.toString());
        }
        
        System.out.println("-------");
        
        if (parse(tokens))
        {
            System.out.println("Resultat: ExpressiÃ³ correcte");
            System.out.println("-------");
        }
        else
        {
            System.out.println("Resultat: ExpressiÃ³ incorrecte");
            System.out.println("-------");
        }
    }
    
    public static void testCase_5() {
        
        ArrayList<Token> tokens = new ArrayList<Token> () {};
        
        OpenParenthesis openParenthesis = new OpenParenthesis ();
        ClosingParenthesis closeParenthesis = new ClosingParenthesis ();
        
        OpenCurly openCurly = new OpenCurly ();
        ClosingCurly closeCurly = new ClosingCurly ();
        
        
        tokens.add(openParenthesis);
        tokens.add(openParenthesis);
        tokens.add(closeParenthesis);
        tokens.add(closeParenthesis);
        tokens.add(openCurly);  
        tokens.add(openParenthesis);
        tokens.add(closeParenthesis);
        tokens.add(closeCurly);
        tokens.add(openParenthesis);
        
        
        System.out.println("Test case 5");
        
        System.out.println("-------");
        
        for (Token token : tokens) {
            System.out.println(token.toString());
        }
        
        System.out.println("-------");
        
        if (parse(tokens))
        {
            System.out.println("Resultat: ExpressiÃ³ correcte");
            System.out.println("-------");
        }
        else
        {
            System.out.println("Resultat: ExpressiÃ³ incorrecte");
            System.out.println("-------");
        }
    }
    
    public static boolean parse(List<Token> tokens){
        Stack<Token> pila = new Stack(); //Pila
      
        Token buffer; //Buffer para peek y evitar el pop
        Token element;
        
        
        // COMPROBACION PRIMERA CERRADA
        
        if(Token.checkOpen(tokens.get(0)) ){
            pila.push(tokens.get(0)); //ABIERTO => PILA
        }
        else{
            return false; //Si empieza por cerrado /FALSE
        }
        
        //Recorremos el resto de elementos del array
        
        for(int i = 1; i<tokens.size(); i++){
           
            element = tokens.get(i);
            
            if(Token.checkOpen(element)){
                pila.push(element); //ABIERTO => PILA

            }
            else{
                if(!pila.empty()){
                    buffer = pila.peek();
                    
                    if(Token.correctParenthesis(buffer,element)|| Token.correctCurly(buffer,element)){ 
                       //Comprueba que los elementos buffer (estaba en pila) y element (elemento actual) coindican y 
                       //poderlos sacar de la pila
                        pila.pop();
                    }   
                }
            }
        }
        return pila.empty();
    } 
}