/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratori1;
import java.io.*;
import java.util.Random;
/**
 *
 * @author Jordi Blanco López, Jesús Fernández Cid de Rivera
 */
public class Laboratori1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testcase_1(); //array de l'enunciat
        testcase_2();
    }
    
    public static void testcase_1 () {
        
        int [] sequence = new int [6];
        sequence[0] = -2;
        sequence[1] = 11;
        sequence[2] = -4;
        sequence[3] = 13;
        sequence[4] = -5;
        sequence[5] = 2;
       
        System.out.println("Joc de Proves de l'enunciat");
        
        maxSubsequenceSum_cubic(sequence);
        maxSubsequenceSum_quadratic (sequence);
        maxSubsequenceSum_linear (sequence);   
    }
    
    public static void testcase_2 () {
        
        int[] sequence = getCadenaAleatoria(1000);
       
        System.out.println("Cas 1 Prova Aleatòria");
        
        maxSubsequenceSum_cubic(sequence);
        maxSubsequenceSum_quadratic (sequence);
        maxSubsequenceSum_linear (sequence);   
    }
        

    public static void maxSubsequenceSum_cubic (int [] a){
       int maxSum = 0;
       int thisSum;
       int seqStart = 0;
       int seqEnd = 0;       
       int numIte = 0;
       long start = System.currentTimeMillis(); 
       for (int i=0; i < a.length; i++)
       {
           numIte++;
           for (int j=i; j < a.length; j++)
           {
               numIte++;
               thisSum = 0;               
               for (int k = i; k <= j; k++)
                {
                    numIte++;
                    thisSum += a[k];
                }
                if (thisSum > maxSum){                    
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;                    
                }               
           }
       }
       long end = System.currentTimeMillis();
       System.out.println("Solució amb temps d'execució: O(N^3)");
       System.out.println("Temps d'execució en milisegons: " + (end-start));
       System.out.println("Màxim: " + maxSum);  
       System.out.println("Inici: " + seqStart + " Final: " + seqEnd);
       System.out.println("Numero iteracions: " + numIte);
}

     public static void maxSubsequenceSum_quadratic (int [] a){  
       int maxSum = 0;
       int thisSum;
       int seqStart = 0;
       int seqEnd = 0;
       int numIte = 0;
       long start = System.currentTimeMillis();    
       for(int i = 0; i < a.length;i++){
           
           numIte++;
           thisSum = 0;
                
           for(int j = i ; j < a.length;j++){
           
                    numIte++;
                    thisSum += a[j];
                
                if (thisSum > maxSum){                    
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;                    
                }               
            }
        }
       long end = System.currentTimeMillis();
       System.out.println("Solució amb temps d'execució: O(N^2)");
       System.out.println("Temps d'execució en milisegons: " + (end-start));
       System.out.println("Màxim: " + maxSum);  
       System.out.println("Inici: " + seqStart + " Final: " + seqEnd);
       System.out.println("Numero iteracions: " + numIte);
   }
     public static void maxSubsequenceSum_linear (int [] a){
       int maxSum = 0;
       int thisSum = 0;
       int seqStart = 0;
       int seqEnd = 0;
       int numIte = 0; 
       int initMax = 0;  
       long start = System.currentTimeMillis();
       for(int i = 0; i < a.length; i++){
       
           thisSum += a[i];
           numIte++;
           
            if(thisSum > maxSum)
            {
           
               maxSum = thisSum;
               seqStart = initMax;
               seqEnd = i;
               
            }
            else if(thisSum < 0)
            {
           
               thisSum = 0; 
               initMax = i + 1;               
            }    
        }
       long end = System.currentTimeMillis();
       System.out.println("Solució amb temps d'execució: O(N)");
       System.out.println("Temps d'execució en milisegons: " + (end-start));
       System.out.println("Màxim: " + maxSum);  
       System.out.println("Inici: " + seqStart + " Final: " + seqEnd); 
       System.out.println("Numero iteracions: " + numIte);
    }

    public static int[] getCadenaAleatoria (int longitud){
        int[] cadenaAleatoria = new int[longitud];// Cadena on guardarem els resultats finals
        int a = 0;
        while ( a < longitud){
                int i = (int) (Math.random()*(40000+40000)-40000);//Max = 40000, min: -40000
                cadenaAleatoria[a] += i;
                a ++;//Anirem col·locant els nombres aleatoris a dins de la cadena
            }
        
    return cadenaAleatoria;
    }
}

 