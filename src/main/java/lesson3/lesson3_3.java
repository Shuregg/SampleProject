/*package lesson3;


import java.util.Scanner;

public class lesson3_3 {
    public static boolean mirrorword(String a) {
        a = a.toLowerCase();
        if(a.length() % 2 == 0) {
            int count = 0;
            for (int i = 0; i < (a.length() / 2) - 1; i++) {
                for (int j = a.length(); j > a.length() / 2 ; j--) {
                    if(a.charAt(i) == a.charAt(j)) {
                        count++;
                    }
                }
            }
            if(count == a.length() /2) {
                return true;
            } else {
                return false;
            }
        }
        else {
            int count2 = 0;
            for (int i = 0; i < (a.length() - 1) / 2 ; i++) {
                for (int j = a.length(); j > ; j++) {

                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            if(txt.charAt(i) == '!') {
                count++;
            }
        }
        System.out.println(txt);
        System.out.println(count);
        for (int i = txt.length() - 1; i > -1 ; i--) {
            System.out.print(txt.charAt(i));
        }
        if(txt.contains("Anatoliy") == true) {
            System.out.println("It is a bad word!");
        } else {
            System.out.println("Text is normal");
        }

        }
    }

*/