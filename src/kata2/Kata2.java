package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = new int[15];
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        for (int i = 0; i < data.length; i++) {
            data[i] = i%7;
            
        }
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        //iterar solo sobre claves
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        } 
    }
    
}
