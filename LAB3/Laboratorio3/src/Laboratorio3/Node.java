/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class Node<E> {
    E element;
    Node<E> left;
    Node<E> right;
    
    public Node(E element, Node<E> left, Node<E> right){
            this.element = element;
            this.left = left;
            this.right = right;
    }
}
