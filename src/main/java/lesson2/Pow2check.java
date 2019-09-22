package lesson2;

import java.util.Scanner;

    public class Pow2check {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            boolean x = pow2Check(a);
            System.out.println(x);
        }
        public static boolean pow2Check(int num) {
            int i = 0;
            while(Math.pow(2, i) <= num) {
                if ((Math.pow(2, i)) == num) {
                    return true;
                }
                i++;
            }
            return false;
        }
    }
