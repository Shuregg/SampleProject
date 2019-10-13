package lesson8;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            //System.out.println("Wrong index");
        } catch(InputMismatchException e) {
           // System.out.println("It is not a number");
            e.printStackTrace();
        }
        System.out.println("Продолжение работы");

    }
}
