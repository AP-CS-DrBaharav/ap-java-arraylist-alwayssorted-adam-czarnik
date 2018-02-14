
/**
 *
 * All direction are in the file KList.java
 * 
 */

public class Main {

    public static void main(String[] args) {
        
        
        int[] a = {4,7,8};
        
        KList k = new KList(a);
        
        System.out.println("Original    : " + k);
        
        k.add(2);
        k.add(5);
        k.add(9);

        System.out.println("Adding 2,5,9: " + k);
        
        
        KList k1 = new KList(new int[0]);
        System.out.println("Empty  k1   : " + k1);

        KList k2 = new KList(new int[0]);
        System.out.println("Empty  k2   : " + k2);
        
        k2.add(2);
        k2.add(5);
        k2.add(9);

        System.out.println("Adding 2,5,9: " + k2);
        
        k2.remove(0);
        k2.remove(0);
        k2.remove(0);
        k2.remove(0);
        
        System.out.println("Removing    : " + k2);
        
        
    }
    
    
}
