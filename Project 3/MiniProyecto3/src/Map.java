/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JordiBlancoLopez
 */
public interface Map <K, V> {
    boolean isEmpty();
    V get (K key);
    void put (K key, V value);
    void remove (K key);   
}
