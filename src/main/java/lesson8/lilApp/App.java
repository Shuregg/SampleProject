package lesson8.lilApp;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        //scanner
        //авторизация
        //while
        //считывание команды
        //switch
        /*

        */
        System.out.println("Enter your login");
        String log = sc.next();
        System.out.println("Enter your password");
        String passw = sc.next();
        if ( userService.auth(log, passw) != true) {
            System.out.println("Wrong login or password. Please, try again.");
            while(userService.auth(log, passw) == false) {
                System.out.println("Enter your login");
                log = sc.next();
                System.out.println("Enter your password");
                passw = sc.next();
            }
        }

        int answer = -1;
        while(answer != 0) {
            System.out.println("1. Добавить.");
            System.out.println("2. Просмотреть всех пользователей.");
            System.out.println("3. Редактировать пользователя.");
            System.out.println("4. Проверка по логину.");
            System.out.println("5. Удалить по логину.");
            System.out.println("0. Выйти из программы.");
            answer = sc.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Enter new login.");
                    String login = sc.next();
                    System.out.println("Enter new password");
                    String pass = sc.next();
                    System.out.println("Enter your Fullname");
                    String fName = sc.next();
                    User newUser = new User(login, pass, fName);
                    if (userService.addUser(login, newUser) == true) {
                        System.out.println("New user created!");
                    } else {
                        System.out.println("You can not create a user with this parameters.");
                    }
                    break;
                case 2:
                    List<User> allUsers = userService.getAllUsers();
                    for (User x : allUsers) {
                        System.out.println(x);
                    }
                    break;

                case 3:
                    System.out.println("Enter your login");
                    String oldLog = sc.next();
                    System.out.println("Enter your password");
                    String oldPass = sc.next();
                    System.out.println("Enter your name");
                    String oldName = sc.next();
                    User editedUser = new User(oldLog, oldPass, oldName);
                    System.out.println("Enter new login");
                    String newLogin = sc.next();
                    System.out.println("Enter new password");
                    String newPassword = sc.next();
                    System.out.println("Enter new Fullname");
                    String newName = sc.next();
                    if (userService.editUser(editedUser, newLogin, newPassword, newName) == true) {
                        System.out.println("Editing is complete!");
                    } else {
                        System.out.println("Editing is not complete (Wrong oldLogin/newLogin or oldPassword");
                    }
                    break;
                case 4:
                    System.out.println("Enter login");
                    String logCheck = sc.next();
                    System.out.println(userService.getByLogin(logCheck).getLogin());
                    System.out.println(userService.getByLogin(logCheck).getPassword());
                    System.out.println(userService.getByLogin(logCheck).getFullName());
                    break;
                case 5:
                    System.out.println("Enter the login, that will be deleted");
                    String delLog = sc.next();
                    if (userService.deleteByLogin(delLog) == true) {
                        System.out.println("User was deleted.");
                    } else {
                        System.out.println("User was not deleted.");
                    }
                    break;
            }
            userService.saveData();
        }
    }
}
