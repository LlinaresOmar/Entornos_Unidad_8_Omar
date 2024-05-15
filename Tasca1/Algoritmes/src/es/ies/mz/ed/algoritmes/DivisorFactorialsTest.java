package es.ies.mz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFactorialsTest {

    public static DivisorFactorials div = new DivisorFactorials();

    @Test
    public void test1y0(){
        assertEquals(1, div.divisio(1, 0));
    }

    @Test
    public void test5y0(){
        assertEquals(120, div.divisio(5, 0));
    }

    @Test
    public void test5y3(){
        assertEquals(20, div.divisio(5, 3));
    }

    @Test
    public void test5y5(){
        assertEquals(1, div.divisio(5, 5));
    }

    @Test
    public void test10y5(){
        assertEquals(30240, div.divisio(10, 5));
    }

    @Test
    public void test3y5(){
        assertEquals(0.05, div.divisio(3, 5));
    }

    @Test
    public void test5y10(){
        assertEquals(0.00003306878, div.divisio(5, 10), 0.000001);
    }

}