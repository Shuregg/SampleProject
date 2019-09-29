package lesson4;

import java.util.Scanner;

public class Authentication {
    public static boolean logIn(String login, String password) {
        String correctLogin = "pupil";
        String correctPassword = "pupil";
        if (login.equals(correctLogin) == true && password.equals(correctPassword) == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String log = sc.next();
        String pass = sc.next();
        if(logIn(log, pass) == true) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Try again.");
        }
    }
}
