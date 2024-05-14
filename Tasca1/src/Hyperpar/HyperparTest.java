package Hyperpar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    public static Hyperpar hy = new Hyperpar();

    @Test
    public void testCon24680(){
        assertTrue(hy.esHyperpar(24680));
    }


}