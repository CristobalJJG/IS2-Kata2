package kata2;

import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        Integer[] data = new Integer[]{2, 4, 6, 13, 5, 6, 9, 13, 2, 4, 1, 15, 13, 13, 15};

        Histogram histograma = new Histogram(data);
        Map<Integer, Integer> histogr = histograma.getHistogram();
        
        for(Integer key : histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));                    
        }
    }
}