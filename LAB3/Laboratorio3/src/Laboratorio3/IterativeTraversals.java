/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;

import java.util.*;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class IterativeTraversals implements Traversals {
    
    @Override
    public <E> List<E> preOrder(BinaryTree<E> tree){
        List<E> list = new ArrayList<>();
        
        Node<E> rooted = tree.giveRoot() ;//Se obtiene el nodo raiz del arbol
        
    
        Stack<Node> stack = new Stack<>(); //Pila
        stack.push(rooted);
        
        while(!stack.empty()){
            
            Node<E> actual = stack.pop();
            list.add(actual.element); //Se van añadiendo en orden que estan en la pila
            
            if(actual.right != null){ //Siempre que haya se mete en la pila
                
                stack.push(actual.right);
                
            }
            if(actual.left != null){ //Siempre que haya se mete en la pila
                
                stack.push(actual.left);
            }
            
        }  
        return (List<E>) list;
    }
    @Override
    public <E>	List<E>	inOrder(BinaryTree<E> tree){
        List<E> list = new ArrayList<>();
        Node<E> actual = tree.giveRoot();//Se obtiene el nodo raiz del arbol
        
        Stack<Node> stack = new Stack<>();
        
        do{   
            if(actual!=null){  //Si existe se mete en la pila y se pasa al izquierdo (Lado izquierdo siempre que se pueda)
                
                stack.push(actual);  
                actual = actual.left; 
                
            }  
            else{  //Ya no queda en el lado izquierdo, pasa al centro y posteriormente al derecho.
                
                Node aux = stack.pop();  
                list.add((E) aux.element);   //Si no existia el nodo se añade el de la pila y se pasa al derecho
                actual = aux.right;  
                
            } 
            
        }while(!stack.empty() || actual != null); //El caso actual != null es para cuando hace el lado izquierdo pase al derecho.
          
        return (List<E>) list;  
    }
    @Override
    public <E>	List<E>	postOrder(BinaryTree<E>	tree){
        List<E> list = new ArrayList<>();
        
        Stack<Node> stack = new Stack<>();
        stack.push(tree.giveRoot()); //Se obtiene el nodo raiz del arbol
        
        Node<E> previo = null;
        
        while (!stack.empty()){ //Pila no vacia
           
            Node<E> actual = stack.peek(); //Peek no Pop para ver si lo tendremos que sacar de la pila o no
            
            if(previo == null || previo.left == actual || previo.right == actual){ //previo null (Primera vuelta) // Previos (Si el nodo era final) 
    
                if(actual.left != null){
                    
                    stack.push(actual.left);
                    
                }else if(actual.right != null){
                   
                    stack.push(actual.right);
                    
                }else{
                    stack.pop();
                    list.add(actual.element);//Elemento añadido
                }
             
            }
            else if(actual.left == previo){ //Parte Izquierda del arbol desde arriba
                if(actual.right != null){
                    
                    stack.push(actual.right);
                    
                }else{
                    
                    stack.pop();
                    list.add(actual.element);//Elemento añadido
                }
  
            }
            else if(actual.right == previo){ //Parte derecha del arbol desde arriba
               
                stack.pop();
                list.add(actual.element);
            }
            else if(actual == previo){
                
                stack.pop();
                list.add(actual.element); //Elemento añadido
            }
            
            previo = actual; //Almacenamiento 
            
        }
        return (List<E>) list; 
    }
    
}
