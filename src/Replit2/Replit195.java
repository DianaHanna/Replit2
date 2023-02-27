package Replit2;

import java.util.HashSet;

public class Replit195 {
    public static void main(String[] args) {

        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);

        for (Integer number:numbers) {
            System.out.println(number);
        }
    }
}
