package com.majkowski;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    protected Client c;
    
    @Before
    public void setUp() {
        c = new Client("FirstNameTest", "LastNameTest");
        c.inv.products.add(new Product("TestProduct1", 3, 4));
        c.inv.products.add(new Product("TestProduct2", 5, 6));
    }
    
    @Test
    public void SumTest()
    {
        int total = 0;
        for (final Product p : c.inv.products) {
            total += p.price * p.count;
        }
        Assert.assertEquals("Czy poprawnie suma rachunku", total, 3 * 4 + 5 * 6);
    }
    
    @After
    public void tearDown() {
        System.out.println("Tearing down");
    }
}
