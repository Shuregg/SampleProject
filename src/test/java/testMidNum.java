import lesson4.ArrayExample;
import lesson4.badword;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testMidNum {
    Random rand = new Random();
    @Test
    public void testIncorrect() {
        int[] mas = {1,2,3};
        float result = ArrayExample.midnum(mas);
        assertEquals(2, result);
    }

}
