package Replit2;
import java.util.ArrayList;

public class Replit187 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hi");
        list.add("yo");
        list.add("sup");
        list.add("yolo");
        list.add("boop");

        list.remove(4);

        list.remove(2);

        list.remove(0);


        for (String value : list) {
            System.out.print(value + " ");
        }
    }
}
