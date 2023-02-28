package Replit2;

import java.util.HashMap;
import java.util.Map;

public class Replit206 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Remove : ");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("------------------");
        System.out.println("HashMap After Remove : ");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}