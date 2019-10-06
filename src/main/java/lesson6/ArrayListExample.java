package lesson6;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ArrayListExample {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        ArrayList<String> list = new ArrayList<>();
        /*
        list.add("asd");
        list.add("Ya");
        list.remove("asd");
        list.contains("test");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ya");
        list.removeAll(list1);
        list.addAll(list1);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\n" + "\n");
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                    list.remove(j);
                }
            }
            System.out.println(list.get(i) + " " + count);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }*/
        for (int i = 0; i < 10; i++) {
            list.add(faker.dog().age());
        }
        System.out.println("Set:"); //множество
        Set<String> strings = new HashSet<>(list);
        for (String x : strings) {
            System.out.println(x);
        }

    }
}
