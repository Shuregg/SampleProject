package lesson6;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class MapExample { //Ассоциативный массив
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tolya", 5);
        map.put("Alexander", 10);
        map.put("Alexander", 18);
        Faker faker = new Faker(new Locale("ru"));
        Integer a = map.get("Alexander");
        Double b = new Double(4.657);
        Double c = Double.parseDouble("42.542356");
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            map.put(faker.name().firstName(),rnd.nextInt(50));
        }
        for(Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " : " + value); //entry - пара

        }
    }
}
