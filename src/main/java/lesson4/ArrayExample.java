package lesson4;
import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 346;
            System.out.println(mas[i]);
        }
    }
    public static float midnum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        float midnumber = sum / arr.length;
        return midnumber;
    }
}
