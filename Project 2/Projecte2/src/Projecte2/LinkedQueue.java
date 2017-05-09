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
public class LinkedQueue<T> implements Queue <T> {
     //atributs
    private NodeCua<T> cap;
    private NodeCua<T> cua;
    T element;
    //constructora crea una cua buida
    public LinkedQueue(){
        cap = cua = null;
    }
    //retorna true si la cua està buida.
    @Override
    public boolean isEmpty(){
        return this.cap == null;
    }
    /*insereix un Node a la llista amb element x. Comprova si la cua està buida.
   Quin dels dos nodes s’actualitza, el cap o la cua?*/
    @Override
    public void inserir (T x){
        NodeCua<T> nouNode = new NodeCua<T>(x,null);

        if (isEmpty()){
            cap = cua = nouNode;   //Si no hay nadie: el que entra es el primero (cap) y el ultimo (cua).
        }
        else{
            cua.next = nouNode;   //El ultimo de la fila le decimos que el ultimo de la fila sera el que ha llegado
            cua = nouNode;          //La cua es ahora el que entra
        }    
    }

    //retorna el cap/cua? de la cua. Si la cua està buida, llença una excepció
   //(NullPointerException)
    @Override
    public T treure(){

        if(isEmpty() ){
            throw new NullPointerException();       //No hay clientes: Al intentar quitar mandamos una excepción.
        }
        else{     
            T elementi = cap.getElement();          
            cap = cap.next;                         //Adelantamos al siguiente de la fila como cap.
            return elementi;                        //Devolvemos el Cliente que se va de la fila
        }  
    }
    
}
