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
public class LinkedBinaryTree<E> implements BinaryTree<E> {
    
    private Node<E> root;
    int mida;
    
    @Override
    public E elem() {
       if (root == null) throw new NoSuchElementException();       
       return root.element;
    }

    @Override
    public BinaryTree<E> left() {
      if (root == null) throw new NoSuchElementException();
      return new LinkedBinaryTree<>(root.left);
    }

    @Override
    public BinaryTree<E> right() {
      if (root == null) throw new NoSuchElementException();
      return new LinkedBinaryTree<>(root.right);
    }

    @Override
    public boolean isEmpty() {
        return this.mida == 0;
    }
    
    public LinkedBinaryTree(){
        this.root = null;
        this.mida = 0;
    }
    public LinkedBinaryTree(E elem){
        this.root = new Node<E>(elem, null, null);
        this.mida = 1;
    }
    public LinkedBinaryTree(E elem, LinkedBinaryTree<E> left, LinkedBinaryTree<E> right){
        
        root = new Node(elem, null, null);
        int leftS = 0;
        int rightS = 0;
        
        if (left != null)
        {
            root.left = left.root;
            leftS = left.getSize();
        }
        else
            root.left = null;
        
        if (right != null)
        {
            root.right = right.root;
            rightS = right.getSize();
        }
        else
            root.right = null;
        
        mida = leftS + rightS + 1;
    }
    
    private LinkedBinaryTree(Node<E> root) {
        this.root = root;
        this.mida = size(root);
    }
    
    private int getSize(){
        return this.mida;
    }
    
    public int size(Node<E> e) {
        if (e == null)
            return 0;
        else
            return size(e.left) + size(e.right) + 1;
    }

    @Override
    public Node<E> giveRoot(){ //Funcion Auxiliar Propia que facilita el trabajo
        return LinkedBinaryTree.this.root;
    }
}
