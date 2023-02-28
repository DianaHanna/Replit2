package Replit2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit203 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
        Map.Entry<String, Integer> entry = iterator.next();
        System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
    }
    }
}
