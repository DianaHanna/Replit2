package Replit2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Replit209 {
        public static void main(String[] args) {

            List<Map<String, Object>> dataList = new ArrayList<>();

            Map<String, Object> appleMap = new HashMap<>();
            appleMap.put("Items", "Apple");
            appleMap.put("Price", 20.00);
            appleMap.put("Quantity", 10.0);

            dataList.add(appleMap);

            Map<String, Object> orangeMap = new HashMap<>();
            orangeMap.put("Items", "Orange");
            orangeMap.put("Price", 21.99);
            orangeMap.put("Quantity", 10.0);

            dataList.add(orangeMap);

            for (Map<String, Object> map : dataList) {
                String items = (String) map.get("Items");
                double price = (double) map.get("Price");
                double quantity = (double) map.get("Quantity");

                double subtotal = price * quantity;

                System.out.println("Items: " + items + " Price: " + price +
                        " Quantity: " + quantity + " SubTotal: " + subtotal);

                System.out.println();
            }

            double totalPurchase = 0;
            for (Map<String, Object> map : dataList) {
                double price = (double) map.get("Price");
                double quantity = (double) map.get("Quantity");
                totalPurchase += price * quantity;
            }

            System.out.println("Your Purchase total : " + totalPurchase);
            System.out.println();
        }
    }
