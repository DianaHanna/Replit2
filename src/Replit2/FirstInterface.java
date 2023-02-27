package Replit2;

public interface FirstInterface {
    void firstMethod();
}
interface SecondInterface{
    void secondMethod();
}
 class Main1 implements FirstInterface, SecondInterface {

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.firstMethod();
        main1.secondMethod();
    }
}


