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
public class Laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        test_binarytree_1();
        test_binarytree_2();
    }
    
    public static void test_binarytree_1()
    {
        LinkedBinaryTree<String> x6 = new LinkedBinaryTree("X6", null, null);
        LinkedBinaryTree<String> x5 = new LinkedBinaryTree("X5", null, null);
        LinkedBinaryTree<String> x8 = new LinkedBinaryTree("X8", null, null);
        LinkedBinaryTree<String> x3 = new LinkedBinaryTree("X3", null, null);
        LinkedBinaryTree<String> x7 = new LinkedBinaryTree("X7", x6, x5);
        LinkedBinaryTree<String> x4 = new LinkedBinaryTree("X4", x8, x7);
        LinkedBinaryTree<String> x1 = new LinkedBinaryTree("X1", null, x3);
        LinkedBinaryTree<String> x2 = new LinkedBinaryTree("X2", x1, x4);
        
        IterativeTraversals its = new IterativeTraversals();
        
        System.out.println("TEST 1" + "\n");
        
        System.out.println("PREORDRE" + "\n");
        List<String> list_pre = its.preOrder(x2);
        ListIterator<String> it = list_pre.listIterator();
        while (it.hasNext())
            System.out.println(it.next());  
        
        System.out.println("\n" + "INORDRE");
        List<String> list_in = its.inOrder(x2);
        ListIterator<String> it_in = list_in.listIterator();
        while (it_in.hasNext())
            System.out.println(it_in.next());
        
        System.out.println("\n" + "POSTORDRE");
        List<String> list_post = its.postOrder(x2);
        ListIterator<String> it_post = list_post.listIterator();
        while (it_post.hasNext())
            System.out.println(it_post.next());
        
    }
     public static void test_binarytree_2()
    {
        LinkedBinaryTree<String> x6 = new LinkedBinaryTree("X6", null, null);
        LinkedBinaryTree<String> x5 = new LinkedBinaryTree("X5", x6, null);
        LinkedBinaryTree<String> x8 = new LinkedBinaryTree("X8", null, null);
        LinkedBinaryTree<String> x3 = new LinkedBinaryTree("X3", x8, null);
        LinkedBinaryTree<String> x7 = new LinkedBinaryTree("X7", null, x5);
        LinkedBinaryTree<String> x4 = new LinkedBinaryTree("X4", x7, null);
        LinkedBinaryTree<String> x1 = new LinkedBinaryTree("X1", null, x3);
        LinkedBinaryTree<String> x2 = new LinkedBinaryTree("X2", x1, x4);
        
        IterativeTraversals its = new IterativeTraversals();
        
        System.out.println("TEST 2" + "\n");
        
        System.out.println("PREORDRE" + "\n");
        List<String> list_pre = its.preOrder(x2);
        ListIterator<String> it = list_pre.listIterator();
        while (it.hasNext())
            System.out.println(it.next());  

        System.out.println("\n" + "INORDRE");
        List<String> list_in = its.inOrder(x2);
        ListIterator<String> it_in = list_in.listIterator();
        while (it_in.hasNext())
            System.out.println(it_in.next());        
        
        System.out.println("\n" + "POSTORDRE");
        List<String> list_post = its.postOrder(x2);
        ListIterator<String> it_post = list_post.listIterator();
        while (it_post.hasNext())
            System.out.println(it_post.next());
       
    }
}    
    
