package es.iesmz.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void test1(){
        float esperado = 28.37f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88f));
    }

    @Test
    public void test2(){
        float esperado = 1165.83f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0f));
    }

    @Test
    public void test3(){
        float esperado = 201.21f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56f));
    }

    @Test
    public void test4(){
        float esperado = 37.51f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56f));
    }

    @Test
    public void test5(){
        float esperado = 138.49f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0f));
    }

    @Test
    public void test6(){
        float esperado = 722.14f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.USD, TipoMoneda.GBP, 1000.0f));
    }

    @Test
    public void test7(){
        float esperado = -1f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.PTS, TipoMoneda.EUR, -1f));
    }

    @Test
    public void test8(){
        float esperado = -1f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.EUR, TipoMoneda.PTS, -1f));
    }

    @Test
    public void test9(){
        float esperado = -1f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.USD, TipoMoneda.EUR, -1f));
    }
}
