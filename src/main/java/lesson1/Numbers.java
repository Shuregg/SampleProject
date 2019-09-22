package lesson1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Write the 1st number.");
    int a = sc.nextInt();
    System.out.println("Write the 2nd number.");
    int b = sc.nextInt();
    System.out.println("Write the 3rd number.");
    int c = sc.nextInt();
    int min = minFromThree(a, b, c);
        System.out.println(min);
    }
    public static int minFromThree (int a, int b, int c) {
        int min = 0;
        if(a <= b && a <= c) {
            min = a;
        }
        if(b <= a && b <= c) {
            min = b;
        }
        if(c <= a && c <= b) {
            min = c;
        }
        return min;
    }
}
