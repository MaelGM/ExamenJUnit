package es.iesmz.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void test1_EUR_USD(){
        float esperado = 28.37f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88f), 0.01);
    }

    @Test
    public void test2_GBP_EUR(){
        float esperado = 1165.83f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0f), 0.01);
    }

    @Test
    public void test3_EUR_GBP(){
        float esperado = 201.21f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56f), 0.01);
    }

    @Test
    public void test4_USD_EUR(){
        float esperado = 37.51f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56f), 0.01);
    }

    @Test
    public void test5_GBP_USD(){
        float esperado = 138.49f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0f), 0.01);
    }

    @Test
    public void test6_USD_GBP(){
        float esperado = 722.14f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.USD, TipoMoneda.GBP, 1000.0f), 0.01);
    }

    @Test
    public void test7_PTS_EUR_ERROR(){
        float esperado = -1f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.PTS, TipoMoneda.EUR, -1f), 0.01);
    }

    @Test
    public void test8_EUR_PTS_ERROR(){
        float esperado = -1f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.EUR, TipoMoneda.PTS, -1f), 0.01);
    }

    @Test
    public void test9_USD_EUR_ERROR(){
        float esperado = -1f;
        Money dinero = new Money();
        assertEquals(esperado, dinero.change(TipoMoneda.USD, TipoMoneda.EUR, -1f), 0.01);
    }
}
