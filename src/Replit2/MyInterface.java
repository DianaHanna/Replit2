package Replit2;

public interface MyInterface {

    void method1();
    void method2();

}
class Main implements MyInterface {

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {
        MyInterface myInterface=new Main();
        myInterface.method1();
        myInterface.method2();

    }
}