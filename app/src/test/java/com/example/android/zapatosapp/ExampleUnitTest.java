package com.example.android.zapatosapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Prueba_uno() throws Exception {
        int n = (int) Metodos.tipo1(1 , 1,  1 );
        assertEquals(70000, n,0);
    }

    @Test
    public void Prueba_tres() throws Exception {
        double n = (int) Metodos.tipo1(0 , 1,  1 );
        assertEquals(80000, n,0);
    }

    @Test
    public void Prueba_dos() throws Exception {
        double n = (int) Metodos.tipo1(1 , 0,  2 );
        assertEquals(110000, n, 0);
    }
}