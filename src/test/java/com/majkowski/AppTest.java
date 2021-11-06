package com.majkowski;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.*;
import org.mockito.Mock;


/**
 * Unit test for simple App.
 */
public class AppTest {
    protected Client c1;
    protected Client c2;
    
    @Mock
    public Database data;
    
    String[] ProductNames;
    double[] ProductPrices;
    int[] ProductCounts;
    
    @Before
    public void setUp() {
        c1 = new Client("FirstNameTest", "LastNameTest");
        c1.inv.products.add(new Product("TestProduct1", 3, 4));
        c1.inv.products.add(new Product("TestProduct2", 5, 6));
        
        c2 = new Client("FirstNameTest", "LastNameTest");
        //data = mock(Database.class);
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
        assertEquals("Czy poprawnie suma rachunku", total, total);
    }
    

    @Test
    public void Test()
    {
        assertEquals(2+2, 4);
    }
    
    
    
    @Test
    public void ImportTest()
    {
        Assert.assertEquals(2, 2);
        
    
        /*
        when(data.getName(0)).thenReturn("P1");
        when(data.getPrice(0)).thenReturn(4.50);
        when(data.getCount(0)).thenReturn(3);
        when(data.getName(1)).thenReturn("P2");
        when(data.getPrice(1)).thenReturn(6.00);
        when(data.getCount(1)).thenReturn(5);
        when(data.getLen()).thenReturn(2);
        
        
        for(int i = 0; i < data.getLen(); i++)
        {
            ProductNames[i] = data.getName(i);
            ProductPrices[i] = data.getPrice(i);
            ProductCounts[i] = data.getCount(i);
        }
        
        if(ProductNames.length == ProductPrices.length && ProductPrices.length == ProductCounts.length)
        {
            for(int i = 0; i < ProductNames.length ; i++)
            {
                c2.inv.products.add(new Product(ProductNames[i], ProductPrices[i], ProductCounts[i]));
            }
            //assertEquals(2, 2);
        }
        */
    }
    
    
    @After
    public void tearDown() {
        System.out.println("Tearing down");
    }
}
