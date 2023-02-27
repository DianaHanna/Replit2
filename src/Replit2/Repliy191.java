package Replit2;

import java.util.ArrayList;
import java.util.Iterator;

public class Repliy191 {
    public static void main(String[] args) {

        ArrayList<Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB = new ArrayList<>();
        listB.addAll(listA);

        Iterator<Boolean> itr = listB.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}