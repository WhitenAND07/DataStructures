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
public interface BinaryTree<E> {
    E elem();
    BinaryTree<E> left();
    BinaryTree<E> right();
    boolean isEmpty();
    public Node<E> giveRoot();
}
