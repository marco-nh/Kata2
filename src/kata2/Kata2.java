package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = new int[15];
        for (int i = 0; i < data.length; i++) {
            data[i] = i%7;
            
        }
        Histogram histo = new Histogram(data);
       
        Map<Integer,Integer> histogr = histo.getHistogram();
        //iterar solo sobre claves
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        } 
    }
    
}
