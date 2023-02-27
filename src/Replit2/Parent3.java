package Replit2;

public class Parent3 {

    public void hello(){
        System.out.println("method in Parent class");
    }
    static class Child3 extends Parent3{
        @Override
        public void hello() {
            System.out.println("method in Child1 class");
        }
    }
    static class Child4 extends Parent3{
        @Override
        public void hello() {
            System.out.println("method in Child2 class");
        }
    }
    static class Child5 extends Parent3{
        @Override
        public void hello() {
            System.out.println("method in Child3 class");
        }
    }

    public static void main(String[] args) {

        Child3 child3=new Child3();
        Child4 child4=new Child4();
        Child5 child5=new Child5();

        Parent3[] children={child3,child4,child5};
        for (Parent3 child:children) {
            child.hello();
        }

    }
}
