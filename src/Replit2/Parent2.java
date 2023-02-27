package Replit2;

public class Parent2 {

    public void method(){
        System.out.println("Parent method");
    }
    public static class Child2 extends Parent2{
        public void method(){
            System.out.println("Child method");
        }
    }

    public static void main(String[] args) {

        Parent2 parent2=new Parent2();
        parent2.method();
        Child2 child2=new Child2();
        child2.method();
    }
}
