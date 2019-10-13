package lesson8;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] a = new int[5];
        try {
            System.out.println("Element at" + index + "=" + a[index]);
        } catch(Exception e) {
            System.out.println("Wrong number");
        }
    }
}
