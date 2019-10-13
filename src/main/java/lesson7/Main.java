package lesson7;

import java.util.List;

public class Main {

    static int designerPdfViewer(int[] h, String word) {
        int w = word.length();
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
           int index = (int) word.charAt(i) -97;
           int height = h[index];
           if(height > max) {
               max = height;
           }
        }
        int s = max * w;
        return s;
    }
    /*
    static int migratoryBirds(List<Integer> arr) {
        for (int i = 0; i < arr.; i++) {

        }
    } */
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[9]);
    }
}

