
/**
 *
 * 
 * Write a class KList
 * 
 * The class should have a:
 * 1. private variable which is an ArrayList of Integers. Call this variable A.
 * 2. Constructor that accepts an array of already sorted integers, and assign these to A.
 *  The first element in the array is the smallest, and the last one is the largest.
 * 3. Constructor that takes NO arguments, and sets A to an empty list.
 * 4. Method add() that returns void, and accepts an integer value. The value is added to A
 * such that A is still sorted.
 * 5. Method remove that accepts an integer, and removes the value in A at this location. It
 * returns the value as an integer. If the index is out of bounds, nothing is removed and the
 * returned value is zero.
 * 6. A function toString, that returns a String that will include all the elements of A
 * and will produce the output as below:
 * 
 * 
 * Expected output:

Original    :  {4 , 7 , 8 };
Adding 2,5,9:  {2 , 4 , 5 , 7 , 8 , 9 };
Empty  k1   :  { };
Empty  k2   :  { };
Adding 2,5,9:  {2 , 5 , 9 };
Removing    :  { };

 * 
 * 
 */

import java.util.ArrayList;

public class KList {
    
    private ArrayList<Integer> A;
    
    public KList(int[] in) {
        A = new ArrayList<Integer>(in.length);
        for (int i=0; i<in.length; ++i) {
            A.add(in[i]);
        }
    }
    public KList() {
        A = new ArrayList<Integer>();
    }
    
    public void add(int n) {
        int ii=0;
        while (ii<A.size()) {
            if (n<A.get(ii)) {
                A.add(ii, n);
                break;
            }
            ii++;
        }
        if (ii==A.size()) {
            A.add(ii, n);
        }
    }
    
    public int remove(int n) {
        if (n >= A.size())
            return 0;
        
        int out = A.get(n);
        A.remove(n);
        return out;
    }
    
    public String toString() {
//        String out = "";
//        if (A.size() == 0) return "{ }";
//        for (int i=1; i<A.size()-1; ++i)
//            out = out + ", " + A.get(i);
//        return "{ " + A.get(0) + out + A.get(A.size()) + " }";
        return "" + A;
    }
    
}


