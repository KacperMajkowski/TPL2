package com.majkowski;
import static org.junit.Assert.assertEquals;
import org.junit.*;

import java.util.ArrayList;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Klient testowy 1
     */
    protected transient Client testClient;
    
    /**
     * Klient testowy 2
     */
    protected transient Client testClient2;
    
    /**
     * Przykładowa baza danych
     */
    protected ArrayList<Product> testDatabase;
    
    /**
     * Setup testu
     */
    @Before
    public void setUp() {
        testClient = new Client("FirstNameTest", "LastNameTest");
        testClient.inv.products.add(new Product("TestProduct1", 3, 4));
        testClient.inv.products.add(new Product("TestProduct2", 5.50, 6));
        testClient.inv.products.add(new Product("TestProduct3", 7.99, 8));
        
        testClient2 = new Client("FirstNameTest2", "LastNameTest2");
        testDatabase = new ArrayList<>();
        testDatabase.add(new Product("TestProduct4", 30, 40));
        testDatabase.add(new Product("TestProduct5", 50, 60));
        testDatabase.add(new Product("TestProduct6", 70, 80));
    }
    
    /**
     * Test sumowania faktury
     */
    @Test
    public void sumTest()
    {
        double total = 0;
        for (final Product p : testClient.inv.products) {
            total += p.price * p.count;
        }
        assertEquals("Czy poprawnie suma rachunku?", total, 3*4 + 5.50*6 + 7.99*8, 0.01);
    }
    
    /**
     * Test importowania danych
     */
    @Test
    public void importTest()
    {
        testClient2.inv.products.addAll(testDatabase);
        assertEquals("Czy ilość zaimportowanych produktów się zgadza?", testClient2.inv.products.size(), testDatabase.size());
    }
    
    /**
     * Koniec testu
     */
    @After
    public void tearDown() {
        System.out.println("Tearing down");
    }
}
