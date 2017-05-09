/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 * @param <K>
 * @param <V>
 */
public class BSTMap <K extends Comparable <? super K>, V> implements Map <K, V> {
    
    private BST tree;
    
    private class BST{
       final K key;
       private V value;
       private BST left; 
       private BST right;
       private int size;

       BST(K key,V value, int size){
         this.key = key;
         this.value = value;
         this.size = size;
         this.left = null;
         this.right = null;
       }
   }

    //////////// Constructor ////////////

    public BSTMap () {
    // Construct a map, initially empty.
        tree = null;
    }

    //////////// Accessors ////////////
    
    public int size(){
      return size(tree);
    }
    public int size(BST tree){
      if(tree == null) return 0;
      else
          return tree.size;
    }
    @Override
    public boolean isEmpty () {
    // Return true if and only if this map is empty.
	return size() == 0;
    }

    @Override
    public V get (K key) {
    // Return the value in the entry with key in this map, or null if there
    // is no such entry.
        return get(tree,key);
    }
    private V get(BST tree, K key){
        if(tree == null){       //If we have not found the key we will return null
            return null;
        }
        int actual = key.compareTo(tree.key);     //Compare the key passed by parameter with the key of the tree
        if (actual > 0){
           return get(tree.right,key);            //If are older, look in the right tree.
        }
        else if (actual<0){
           return get(tree.left,key);             //If is young,look in the left tree.
        }else{
            return tree.value;                    //If it is the same it returns the value associated 
                                                    //to the key of the node of that tree.
        }
   }

    //////////// Transformers ////////////

    public K min(){
       return minimum(this.tree).key;
    }
    
    private BST minimum(BST tree){
       if(tree.left==null) return tree;
       return minimum(tree.left);           //Move on the left sub-plane until there are no more children left
    }
   
    @Override
    public void remove (K key) {
    // Remove the entry with key (if any) from this map. Return the value
    // in that entry, or null if there was no such entry.
         this.tree = remove(this.tree, key);
    }
    
    private BST remove(BST tree, K key){
        if(tree == null) return null;
        
        int actual = key.compareTo(tree.key);
        if(actual < 0){
            tree.left = remove(tree.left,key);      //Comparing and choosing the sub-tree according to whether                                                     
        }                                           //it is greater or less the key and updates as well 
        else if(actual > 0){
            tree.right = remove(tree.right,key);
        }
        else{
            if(tree.right == null){
                return tree.left;       //Change it directly for the left sub-tree if the right is null
            }
            if(tree.left==null){
                return tree.right;
            }
            BST auxTree =tree;
            tree = minimum(auxTree.right);                  //Calculate the minimum of the tree right
            tree.right = deleteMinimum(auxTree.right);      //Remove the minimum and keep it as a right sub-tree
            tree.left = auxTree.left;
        }
   
        return tree;
    }
    
    public void deleteMinimum(){
      this.tree = deleteMinimum(this.tree);
    }
    
    private BST deleteMinimum(BST tree){
      if(tree.left == null) return tree.right;
      tree.left = deleteMinimum(tree.left);
      tree.size = size(tree.left)+size(tree.right)+1;
      return tree;
    }
    
    @Override
    public void put (K key, V value) {
    // Add the entry <key, val> to this map, replacing any existing entry
    // with key.
        this.tree = put(this.tree, key, value);
    }
    
    private BST put(BST tree, K key, V value){
       if(key==null || value==null) throw new  NullPointerException();
       
       if(tree == null ) return new BST(key ,value,1);      //If a leaf is reached it creates a new tree with 
                                                            //measure 1 and with the corresponding key and value
       
       int actual = key.compareTo(tree.key);                //Compare keys
       
       if(actual<0) tree.left = put(tree.left,key,value);   //Update the left sub-tree and recursively I pass 
                                                            //the left sub-tree to follow for him 
       
       else if(actual>0) tree.right = put(tree.right,key,value);//The same about the right sub-tree
       
       else this.tree.value = value;//If I find the key, Update the value
       
       tree.size = size(tree.left)+size(tree.right)+1;//Update the size of the tree
       
       return tree;   
    }
    
    public void printInOrder () {
          printInOrder (tree);
          System.out.println();
    }
    
    private void printInOrder (BST root) {
          if (root != null){
              printInOrder (root.left);
              System.out.println("K: "+root.key + "-> V: "+root.value+" ");
              printInOrder (root.right);
          }
      }
    
}