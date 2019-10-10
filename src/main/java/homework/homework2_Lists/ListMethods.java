package homework.homework2_Lists;

import java.util.*;

public class ListMethods {

    public static void deleteLong(List<String> list, int n) { //deleteLong
        if (list.isEmpty()) {
            System.out.println("This list is empty!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() > n) {
                    list.remove(i);
                }
            }
        }
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) { //symmetricDifference
        Set<Integer> var1 = new HashSet<>(set1);
        var1.retainAll(set2);
        Set<Integer> var2 = new HashSet<>(set1);
        var2.addAll(set2);
        var2.removeAll(var1);
        return var2;

    }

    public static Map<String, Integer> countInList(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        int value = 1;
        for (String string : list) {
            int count = 0;
            for (String string1: list) {
            if (string1 == string) {
                count++;
            }
            }
            map.put(list.get(1), count);
            value++;
        }
        return map;
    }
}


