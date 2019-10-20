package lesson8.lilApp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileHelper {
    //
    public static Map<String, User> readFromFile(String path) {
        Map<String, User> users = new HashMap<>();
        try (FileReader reader = new FileReader(path)) {
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
        return users;
    }
    //
    public static void saveToFile (String path, Map < String, User > users){
        try (FileWriter writer = new FileWriter(path, false)) {
            for(Map.Entry<String, User> pair : users.entrySet()) {
                User userToWrite = pair.getValue();
                writer.write(userToWrite.getLogin() + " " + userToWrite.getPassword() + " " + userToWrite.getFullName() + '\n');
            }
            writer.flush();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    //
}
