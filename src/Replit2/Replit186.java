package Replit2;


import java.util.ArrayList;


public class Replit186 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);

        for (Integer number:numbers) {
            System.out.println(numbers);
            numbers.clear();
            System.out.println(numbers);
        }
    }
}
