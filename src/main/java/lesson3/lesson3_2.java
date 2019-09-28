package lesson3;

import java.util.Scanner;

public class lesson3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float L = 2.5f;
        float E = 0.01f;
        float enter = -1;
        while (enter != 0) {
            enter = sc.nextFloat();
            if (enter >= (L - E) && enter <= (L + E)) {
                System.out.println("E is ok");
            } else {
                System.out.println("E isn't ok");
            }
        }
    }
}
