import lesson4.Authentication;
import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAuthentication {
    @Test
    public void testIncorrect() {
        boolean result = Authentication.logIn("pupil", "pupil");
        assertEquals(true, result);
    }
    @Test
    public void testCorrect() {
        boolean result = Authentication.logIn("pupyl", "poopil");
        assertEquals(false, result);
    }
}
