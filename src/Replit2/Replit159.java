package Replit2;

public class Replit159 {

    public static int subtract(int a, int b){
        return a-b;
    }
    public static int subtract(int a, int b, int c){
        return a-b-c;
    }
    public static int subtract(int a, int b, int c, int d){
       return a-b-c-d;
    }

    public static void main(String[] args) {

        int result1=subtract(200,120,20,20);
        System.out.println(result1+ " (should come from subtracting 4 numbers)");
        int result2=subtract(200,120,50);
        System.out.println(result2+ " (should come from subtracting 3 numbers)");
        int result3=subtract(40,20);
        System.out.println(result3+ " (should come from subtracting 2 numbers)");
    }
}
