package com.majkowski;

import static org.junit.Assert.assertEquals;
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
    public void SumTest()
    {
        Client c = new Client("FirstNameTest", "LastNameTest");
        c.inv.products.add(new Product("TestProduct1", 3, 4));
        c.inv.products.add(new Product("TestProduct2", 5, 6));
    
        int total = 0;
        for (final Product p : c.inv.products) {
            total += p.price * p.count;
        }
        assertEquals("Czy poprawnie suma rachunku",total, 3*4 + 5*6);
        
    }

}
