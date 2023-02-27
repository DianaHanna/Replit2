package Replit2;

import java.util.LinkedList;

public class Replit190 {

        public static void main(String[] args) {

            LinkedList<Integer> fibonacciList = new LinkedList<Integer>();

            fibonacciList.add(0);
            fibonacciList.add(1);

            for (int i = 2; i < 10; i++) {
                int sum = fibonacciList.get(i-1) + fibonacciList.get(i-2);
                fibonacciList.add(sum);
            }

            for (int i = 0; i < fibonacciList.size(); i++) {
                System.out.print(fibonacciList.get(i) + " ");
            }
        }
    }
