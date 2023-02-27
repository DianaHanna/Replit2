package Replit2;

public interface ParentInterface {

    void parentMethod();
}
interface ChildInterface extends ParentInterface{
    void childMethod();
}
 class Main2 implements ChildInterface{
    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {

                ChildInterface obj =new Main2();
                obj.parentMethod();
                obj.childMethod();
            }
        }
