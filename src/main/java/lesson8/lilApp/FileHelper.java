package lesson8.lilApp;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileHelper {
    public static Map<String, User> readFromFile(String path) {
        Map<String, User> users = new HashMap<>();
        try (FileReader reader = new FileReader("src\\main\\resources\\usersMap.txt")) {
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()) {
                String login = sc.next();
                String password = sc.next();
                String name = sc.next();
                User user = new User(login, password, name);
                users.put(user.getLogin(), user);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла\n" + e.getMessage());
        } catch (NoSuchElementException e) {
            System.err.println("Неверный формат данных\n");
        }

    }
    public static void saveToFile (String path, Map < String, User > users){

    }
}
