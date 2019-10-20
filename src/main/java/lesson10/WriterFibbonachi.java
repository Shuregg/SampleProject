package lesson10;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFibbonachi {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("src\\main\\resources\\fibbonachi.txt", false)) {
            String text = "20 54 343 21 89 54";
            //Запись всей строки
            writer.write(text);
            //Запись по символам
            // writer.append('\n);
            //writer.append('E');

            //Запись всего
            writer.flush();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
