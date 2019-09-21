package lesson1;

import java.util.Scanner;

public class Justice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of family members");
        int famnum = sc.nextInt();
        System.out.println("Enter number of money");
        int balance = sc.nextInt();
        System.out.println("Enter the price of product");
        int price = sc.nextInt();
        if(famnum < 0 || balance < 0 || price < 0) {
            System.exit(0);
        }
        if((price * famnum) <= balance) {
            balance = (balance - (price * famnum));
            System.out.println("You can buy it for Your family! Your money: " + balance);
        }
        else {
            System.out.println("You can not buy it for Your family");
        }
    }
}
