package es.ies.mz.ed.algoritmes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    public static Hyperpar hy = new Hyperpar();

    @Test
    public void testCon24680(){
        assertTrue(hy.esHyperpar(24680));
    }

    @Test
    public void testCon2568(){
        assertFalse(hy.esHyperpar(2568));
    }

    @Test
    public void testCon2468(){
        assertTrue(hy.esHyperpar(2468));
    }

    @Test
    public void testCon00022(){
        assertTrue(hy.esHyperpar(Long.parseLong("00022")));
    }

    @Test
    public void testCon00012(){
        assertFalse(hy.esHyperpar(Long.parseLong("00012")));
    }
}