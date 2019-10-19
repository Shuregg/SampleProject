package lesson9;


import lesson8.lilApp.User;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsersToList {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src\\main\\resources\\users.txt")) {
            List<User> users = new ArrayList<>();
            Scanner sc = new Scanner(reader);
        while(sc.hasNext()) {
            String login = sc.next();
            String password = sc.next();
            String name = sc.next();
            User user = new User(login, password, name);
            users.add(user);
        }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла\n" + e.getMessage());
        }

    }
}
