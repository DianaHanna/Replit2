package Replit2;

public class Parent {

    public void m1() {
        System.out.println("m1 method in parent class");
    }

    public static class Child extends Parent {
        @Override
        public void m1() {
            System.out.println("m1 method in child class");
        }

        public void m2() {
            m1();
            super.m1();
        }
    }
        public static void main(String[] args) {
            Child child = new Child();
            child.m2();
        }
    }

