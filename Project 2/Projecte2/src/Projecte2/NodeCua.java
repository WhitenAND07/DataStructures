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
public class NodeCua<T> {

  T element;       //Elemento generico
  NodeCua<T> next; //El siguiente de la cola, es como el puntero que señala el siguiente elemento de la fila
   
   /////////// Constructor /////////////
   NodeCua (T e,NodeCua<T> next){
       element = e;
       this.next = next;
   }
   
   
   ////////////GETTERS//////////////////
   public NodeCua<T> getNext(){
       return this.next;
   }
   
   public T getElement(){
       return this.element;
   }
   
   //////////////SETTERS//////////////////
   public void setNext(NodeCua<T> nextn){
       this.next = nextn;
   }
   
   public void setElement (T elementi){
       this.element = elementi;
   }


    

}