package Replit2;

import java.util.LinkedList;

public class Replit189 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int num = numbers.get(i);
            if (num % 3 != 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
        }
    }

