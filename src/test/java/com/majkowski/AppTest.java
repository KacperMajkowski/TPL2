package com.majkowski;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

/**
 * Unit test for simple App.
 */
public class AppTest {
    protected Client c1;
    protected Client c2;
    
    @Before
    public void setUp() {
        c1 = new Client("FirstNameTest", "LastNameTest");
        c1.inv.products.add(new Product("TestProduct1", 3.0, 4));
        c1.inv.products.add(new Product("TestProduct2", 5.0, 6));
        
        c2 = new Client("FirstNameTest", "LastNameTest");
    }
    
    /**
     * Test sumowania faktury
     */
    @Test
    public void SumTest()
    {
        int total = 0;
        for (final Product p : c1.inv.products) {
            total += p.price * p.count;
        }
        Assert.assertEquals("Czy poprawnie suma rachunku", total, 3 * 4 + 5 * 6);
    }
    
    @Mock
    String[] ProductNames = {"P1", "P2", "P3"};
    
    @Mock
    double[] ProductPrices = {3.0, 4.0, 5.0};
    
    @Mock
    int[] ProductCounts = {6, 7, 8};
    
    @Test
    public void ImportTest()
    {
        if(ProductNames.length == ProductPrices.length && ProductPrices.length == ProductCounts.length)
        {
            for(int i = 0; i < ProductNames.length ;i++)
            {
                c2.inv.products.add(new Product(ProductNames[i], ProductPrices[i], ProductCounts[i]));
            }
            
            assertEquals(3, c2.inv.products.size());
        }
    }
    
    
    @After
    public void tearDown() {
        System.out.println("Tearing down");
    }
}
