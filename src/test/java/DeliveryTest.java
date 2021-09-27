import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeliveryTest {
    Delivery d;

    @Before
    public void setUp() throws Exception{
        d = new Delivery("item", "John", "2021/09/27");
    }

    @Test(timeout = 50)
    public void testGetPrice(){
       int price = d.getPrice();
       assertEquals(0, price);
    }

    @Test(timeout = 50)
    public void testSound(){
        String sound = d.sound();
        assertEquals("WUHUUUUUUUUUU", sound);
    }

    @Test(timeout = 50)
    public void testGetDate(){
        String date = d.getDate();
        assertEquals( "2021/09/27", date);
    }

    @Test(timeout = 50)
    public void testGetItem(){
        String item = d.getItem();
        assertEquals("item", item);
    }

    @Test(timeout = 50)
    public void testGetDeliver_name(){
        String name = d.getDeliver_name();
        assertEquals("John", name);
    }

}
