package Replit2;

import java.util.HashMap;
import java.util.Map;

public class Replit201 {
    public static void main(String[] args) {

        Map<String, String> map=new HashMap<>();
        map.put("Street","Patrick ST");
        map.put("Suite","265");
        map.put("City","Vienna");
        map.put("Zip","22180");
        map.put("Country","United States");
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());
    }
}
