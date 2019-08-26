package xyz.iamraj.lambda;

import java.util.HashMap;
import java.util.Map;

public class IteratingMapThroughLambda {

    public static void main(String[] args) {
        Map<String, Integer> prices = new HashMap<>();

        prices.put("Apple", 50);
        prices.put("Orange", 20);
        prices.put("Banana", 10);
        prices.put("Grapes", 40);
        prices.put("Papaya", 50);

        prices.forEach((k, v) -> System.out.println("Fruit " + k + " price " + v));

        

    }
}
