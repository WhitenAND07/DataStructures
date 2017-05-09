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
public interface Queue<T> {
//Definimos las funciones que heredaran las clases de esta inferface con implements o extends.
   public boolean isEmpty();
   public void inserir (T x);
   public T treure();    
}
