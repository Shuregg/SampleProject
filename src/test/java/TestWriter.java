import lesson8.lilApp.FileHelper;
import lesson8.lilApp.User;
import org.junit.jupiter.api.Test;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class TestWriter {
    @Test
    public void testWrite() {
        Map<String, User> map = new HashMap<>();
        map.put("Sasha", new User("admin", "admin", "Sasha"));
        FileHelper.saveToFile("src\\main\\resources\\usersMap.txt", map);
    }
}
