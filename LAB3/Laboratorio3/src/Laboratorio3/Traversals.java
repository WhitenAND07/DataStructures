/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;

import java.util.List;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public interface Traversals {
    <E> List<E>	preOrder(BinaryTree<E> tree);
    <E>	List<E>	inOrder(BinaryTree<E> tree);
    <E>	List<E>	postOrder(BinaryTree<E>	tree);
}
