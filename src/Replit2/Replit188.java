package Replit2;
import java.util.Scanner;
import java.util.ArrayList;
public class Replit188 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            int number= scanner.nextInt();
            numbers.add(number);
        }
        for (int i = 0; i <numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
        }
    }

