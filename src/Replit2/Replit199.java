package Replit2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Replit199 {
    public static void main(String[] args) {

        Set<String> objects=new LinkedHashSet<>();
        objects.add("null");
        objects.add("Sohil");
        objects.add("Diego");
        objects.add("Alijon");
        objects.add("Asel");
        objects.add("Sumair");

        for (String obj:objects) {
            System.out.println(obj);
        }

        Iterator<String> iterator=objects.iterator();
        while (iterator.hasNext()){
            String obj= iterator.next();
            System.out.println(obj);
        }
        }
    }

