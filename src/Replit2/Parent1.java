package Replit2;

public class Parent1 {
    public String city;

    public Parent1(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println("City name "+city);
    }
    public static class Child1 extends Parent1{
        public Child1(String city) {
            super(city);
        }
    }

    public static void main(String[] args) {

        Child1 child1=new Child1("Fairfax");
        child1.display();
    }
}
