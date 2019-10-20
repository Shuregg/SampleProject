package lesson8.lilApp;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private Map<String, User> users;

    public UserService() {
        users = FileHelper.readFromFile( "src\\main\\java\\lesson8\\lilApp\\users.txt");
        User adminUser = new User("admin", "admin", "Sasha");
        users.put("admin", adminUser);
    }
    //
    public void saveData() {
        FileHelper.saveToFile("src\\main\\java\\lesson8\\lilApp\\users.txt", users);
    }
    //
    public User getByLogin(String login) {
        return users.get(login);
    }
    //
    public boolean addUser(String login,User user) {
        if (users.get(login) == null) {
            users.put(login, user);
            return true;
        } else {
            return false;
        }
    }
    //
    public boolean deleteByLogin(String login) {
        if (users.get(login) != null) {
            users.remove(login);
            return true;
        } else {
            return false;
        }

    }
    //
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }
    //
    public boolean editUser(User user, String newLogin, String newPassword, String newName) {
        if (users.get(user.getLogin()) != null) {
        if(users.get(newLogin) == null) {
            users.remove(user.getLogin(), user);
            User editedUser = new User(newLogin, newPassword, newName);
            users.put(newLogin, editedUser);
            return true;
        } else {
            return false;
        }
        } else {
            return false;
        }

    }
    //
    public boolean auth(String login, String password) {
        if (users.containsKey(login)) {
            if(users.get(login).getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
