package Replit2;

import java.util.HashSet;

public class Replit196 {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();
        set.add("third");
        set.add("first");
        set.add("second");

        System.out.println(set);

        set.removeAll(set);
        System.out.println(set);
    }
}
