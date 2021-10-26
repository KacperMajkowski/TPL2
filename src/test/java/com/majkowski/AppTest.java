package com.majkowski;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void additionTest()
    {
        assertEquals(2 + 2, 4);
    }

    @Test
    public void varTest()
    {
        Class1 c = new Class1();
        assertEquals(c.x, 5);
    }
}
