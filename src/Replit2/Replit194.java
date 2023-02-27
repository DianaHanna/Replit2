package Replit2;

import java.util.ArrayList;
import java.util.List;

public class Replit194 {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        List<String> updatedList = removeCountriesStartingWithA(countries);

        System.out.println(updatedList);
    }

    public static List<String> removeCountriesStartingWithA(List<String> list) {

        List<String> updatedList = new ArrayList<>();

        for (String element : list) {
            if (!element.startsWith("A")) {
                updatedList.add(element);
            }
        }

        return updatedList;
    }
}