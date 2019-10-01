package lesson4;


import java.util.Scanner;

public class badword {


    public static String censure(String txt, String word) {
      String newString;
      newString = txt.replaceAll(word, "***");
      return newString;
    }

}
