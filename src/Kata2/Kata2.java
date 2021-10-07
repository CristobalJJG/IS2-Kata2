package Kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] data = new int[]{2, 4, 6, 13, 5, 6, 9, 13, 2, 4, 1, 15, 13, 13, 15};
        Map<Integer, Integer> histogram = new HashMap<>();

        for (int key : data) {histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);}

        for(Integer key : histogram.keySet()) {System.out.println(key + "==>" + histogram.get(key));}
    }
}