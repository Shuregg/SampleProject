package lesson9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Programme {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src\\main\\resources\\file.txt")) {
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            String fromFile = bufferedReader.readLine();
//            System.out.println(fromFile);
            Scanner sc = new Scanner(reader);
            int count = 0;
            int sum = 0;
            while(sc.hasNextInt()) {
                count++;
                int a = sc.nextInt();
                System.out.print(a + " ");
                sum = sum + a;
            }
            System.out.println("\n" + sum/count);
//            String fromFile = sc.next();
//            int c = 0;
//            while (c != -1) {
//                System.out.print((char) c);
//
//                c = reader.read();
//            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла\n" + e.getMessage());
        }
    }
}
