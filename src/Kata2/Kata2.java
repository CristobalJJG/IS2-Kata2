package Kata2;

import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        //Integer[] data = {2, 4, 6, 13, 5, 6, 9, 13, 2, 4, 1, 15, 13, 13, 15};
        String[] data = {"Rosa", "Rosa", "Nano", "Daniel", "Nano", "Manolo", "Nano", "Nano", "Pepito", "Pepito",
        "Roberto", "Pepito", "Rosa", "Manolo", "Nano"};
        
        Histogram histograma = new Histogram(data);
        Map<String, Integer> histogr = histograma.getHistogram();
        
        for(String key : histogr.keySet()) {System.out.println(key + "==>" + histogr.get(key));}
    }
}