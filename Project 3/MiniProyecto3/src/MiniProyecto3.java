

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class MiniProyecto3 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        test_BST_1();
    }
    
    public static void test_BST_1() {  
	Integer key1 = 1,key2 = 2,key3 = 3,key4 = 4,key5 = 5,key6 = 6,key7 = 7,key8 = 8,key9 = 9,key10 = 10;
        BSTMap table = new BSTMap();           
        
        System.out.println("It's Empty?");
        System.out.println(table.isEmpty());   
        System.out.println("Add Values, (The values are colors)");
        table.put(key8, "Red");   
        table.put(key6, "Yellow");
        table.put(key7, "Green"); 
        table.put(key2, "Blue");     
        table.put(key1, "Black");  
        table.put(key10, "White");  
        table.put(key9, "Purple"); 
        table.put(key3, "Orange");
        table.put(key4, "Gray");
        table.put(key5, "Pink");
        
        System.out.println("Recorrido InOrdre del arbol: ");
        table.printInOrder();

        table.remove(key6);
        System.out.println("Recorrido InOrdre del arbol, despues de eliminar key6 cuyo valor es Barcelona: ");
        table.printInOrder();
        
        System.out.println("It's Empty table?");
        System.out.println(table.isEmpty());
        
        System.out.println("El value de la key10 es-->"+table.get(key10));
        table.put(key10, "Lime Green");
        System.out.println("La key una vez modificada es: "+table.get(key10));
    }
}

