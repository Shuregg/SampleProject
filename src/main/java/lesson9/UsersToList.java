package lesson9;


import lesson8.lilApp.User;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class UsersToList {
    public static void main(String[] args) {
        User user;
        List<User> users = new ArrayList<>();
        try (FileReader reader = new FileReader("src\\main\\resources\\users.txt")) {
            Scanner sc = new Scanner(reader);
        while(sc.hasNext()) {
            String login = sc.next();
            String password = sc.next();
            String name = sc.next();
            user = new User(login, password, name);
            users.add(user);
        }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла\n" + e.getMessage());
        } catch (NoSuchElementException e) {
            System.err.println("Неверный формат данных\n");
        }
        for (User x : users) {
            System.out.println(x);
        }

    }
}
