/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici1;

import java.util.*;
/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class Exercici1{

    public static void main(String[] args) {
        // Creación de ArrayList de profesores
        ArrayList<Professor> profesores = new ArrayList<Professor>();
        Professor profe1 = new Professor("11111111A", "Juan", "3.01");
        Professor profe2 = new Professor("22222222A", "Antonio", "3.02");
        //mas Professores
        Professor profe3 = new Professor("12161914A", "Pepe", "4.01");
        Professor profe4 = new Professor("29876543A", "Nil", "1.02");
        Professor profe5 = new Professor("34151617A", "Eric", "2.01");
        
        profesores.add(profe1);
        profesores.add(profe2);
        //Añadimos mas professores
        profesores.add(profe3);
        profesores.add(profe4);
        profesores.add(profe5);
        
        LinkedList<Lector> lectores = new LinkedList<Lector>();
        Lector lec1 = new Lector("11111111A", "Juan", "3.01", "GI_1");
        Lector lec2 = new Lector("22222222A", "Kike", "3.02", "GI_3");
        //mas Lectores
        Lector lec3 = new Lector("12161914A", "Pepe", "4.01", "GI_5");
        Lector lec4 = new Lector("29876543A", "Nil", "1.02", "GI_6");
        Lector lec5 = new Lector("34151617A", "Eric", "2.01", "GI_7");
                
        lectores.add(lec1);
        lectores.add(lec2);
        //Añadimos mas Lectores
        lectores.add(lec3);
        lectores.add(lec4);
        lectores.add(lec5);
        
        //Escribo profesores
        System.out.println("Lista de profesores:");
        printList(profesores);

        //Escribo lectores
        System.out.println("Lista de lectores:");
        printList(lectores);
    }

    public static void printList (List <? extends Persona> milist){
        Iterator it = milist.iterator();
        while(it.hasNext()){                //¿Hay mas elementos?
            System.out.println(it.next());  //Coge el proximo elemento
                     
        }
    
    }
    
}

