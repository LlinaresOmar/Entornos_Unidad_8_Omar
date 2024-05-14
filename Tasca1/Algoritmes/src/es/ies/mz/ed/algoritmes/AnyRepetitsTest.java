package es.ies.mz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyRepetitsTest {

    public static AnyRepetits any = new AnyRepetits();

    @Test
    public void test2000(){
        assertEquals(1,any.numRepetits(2000));
    }

    @Test
    public void test2001(){
        assertEquals(3,any.numRepetits(2001));
    }

    @Test
    public void test1999(){
        assertEquals(2,any.numRepetits(1999));
    }

    @Test
    public void test1995(){
        assertEquals(3,any.numRepetits(1995));
    }

    @Test
    public void test2013(){
        assertEquals(0,any.numRepetits(2013));
    }
}