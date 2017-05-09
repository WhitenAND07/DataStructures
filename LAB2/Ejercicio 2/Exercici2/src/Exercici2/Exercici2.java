/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;

import java.util.*;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creación de ArrayList de Personas
        ArrayList<Persona> personas = new ArrayList<Persona>();
        Persona per1 = new Persona("11111111A", "Juan");
        Persona per2 = new Persona("22222222A", "Antonio");
        //mas Personas
        Persona per3 = new Persona ("2222222P", "Alijo" );
        Persona per4 = new Persona ("3333333333P", "Barro");
        Persona per5 = new Persona ("11111111P", "Zulu");
        
        personas.add(per1);
        personas.add(per2);
        //Añadimos mas personas
        personas.add(per3);
        personas.add(per4);
        personas.add(per5);
        
        LinkedList<Cotxe> cotxes = new LinkedList<Cotxe>();
        Cotxe c1 = new Cotxe("Juan", "L-1111");
        Cotxe c2 = new Cotxe("Kike", "C-4444");
        //mas Cotxes
        Cotxe c3 = new Cotxe ("Abajo", "L-1234");
        Cotxe c4 = new Cotxe ("Felpudo", "M-1234");
        Cotxe c5 = new Cotxe ("Zafro", "X-123234");
        
        cotxes.add(c1);
        cotxes.add(c2);
        //Añadimos mas cotxes
        cotxes.add(c3);
        cotxes.add(c4);
        cotxes.add(c5);
        
        //Ordeno personas
        sort(personas);
        //Ordeno coches
        sort(cotxes);
        
        //Escribo personas ordenadas
        System.out.println("Lista de personas ordenadas:");
        printList(personas);

        //Escribo cotxes ordenados
        System.out.println("Lista de coches ordenados:");
        printList(cotxes);
    }
    
    public static <T extends Comparable<T>> void sort (List<T> lista){
       
        //BubbleSort
        boolean swapped =true;
        T tmp;
        if(lista.size() == 1 || lista.isEmpty() ){
            swapped = false;        
        //Si solo hay un elemento o vacia ya esta ordenado, por lo que ya no hace falta que entre al bucle.
        }
        while(swapped){
            
            swapped = false; 
            
            for(int i = 0; i< lista.size()-1; i++){
                if(lista.get(i).compareTo(lista.get(i+1))>0){
                    tmp = lista.get(i); //Almacena en el temporal la posicion actual
                    
                    lista.set(i,lista.get(i+1)); //Sobreescribe la posicion actual
                    lista.set(i+1,tmp); // El temporal pasa a la siguiente posicion
                    
                    swapped = true; //Se ha intercambiado 
                }
            }
        }
        System.out.println(lista);
    }
    // Creamos la funcion printList para poder imprimir la lista ordenada
       public static void printList (List <? extends Comparable<?>> milist){
        Iterator it = milist.iterator();
        while(it.hasNext()){                //¿Hay mas elementos?
            System.out.println(it.next());  //Coge el proximo elemento
                     
        }
    
    }
}
