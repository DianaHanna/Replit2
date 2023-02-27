package Replit2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Replit200 {
    public static void main(String[] args) {

        Map<String, String> map=new LinkedHashMap<>();
        map.put("Street","Patrick ST");
        map.put("Suite","265");
        map.put("City","Vienna");
        map.put("Zip","22180");
        map.put("Country","United States");

        for (String value: map.values()) {
            System.out.println(value);
        }
    }
}
