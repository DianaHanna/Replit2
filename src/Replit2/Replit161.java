package Replit2;

public class Replit161 {

    private void m1(){
        System.out.println("private m1 method");
    }
    private void m1(int num){
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {

        Replit161 obj=new Replit161();
        obj.m1();
        obj.m1(0);
    }
}
