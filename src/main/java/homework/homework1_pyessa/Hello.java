package homework.homework1_pyessa;

import java.util.Scanner;

public class Hello {
    public static boolean check (String txt) {
        String low = txt.toLowerCase();
        if(low.startsWith("здравствуйте")) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String text = sc.next();
if(check(text)) {
    System.out.println("Культурно!");
} else {
    System.out.println("Не очень то и вежливо!");
}
    }
}
