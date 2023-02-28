package Replit2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public interface Replit207 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Replace : ");
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.replace("THREE", "CCC", "ASEL");
        map.replace("FIVE", "EEE", "SUMAIR");
        System.out.println("------------------");
        System.out.println("HashMap After Replace : ");
        iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
