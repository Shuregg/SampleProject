package lesson3;

import java.util.Scanner;


public class lesson3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //scanner locale
        float temp = sc.nextFloat();
        if(temp >= 36.5 && temp <= 36.7) {
            System.out.println("U R OK.");
        } else {
            System.out.println("Call the ambulance");
        }

    }
}
