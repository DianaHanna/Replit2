package Replit2;

import java.util.*;

public class Replit204 {
    public static void main(String[] args) {

        Map<String,String> map=new LinkedHashMap<>();
        map.put("Street","Patrick ST");
        map.put("Suite","265");
        map.put("City","Vienna");
        map.put("Zip","22180");
        map.put("Country","United States");

        var iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            var entry = iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
