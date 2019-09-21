package lesson1;

import java.util.Scanner;

public class Poorboy {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int cost = -1;
int max = -1;
int balance = 0;
while(cost != 0) {
    int coin = sc.nextInt();
    while(coin<0) {
        if(coin < 0) {
            System.out.println("Please, enter the right number!");
            coin = sc.nextInt();
        }
    }

    balance = balance + coin;
    if(coin > max) {
        max = coin;
    }

}
if(cost == 0) {
    System.out.println("Your total balance: " + balance + " Max cost of coins: " + max);
}

    }
}

