import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeliveryTest {
    Delivery d;

    @Before
    public void setUp() throws Exception{
        d = new Delivery("item", "John", "2021/09/27");
    }

    @Test
    public void testGetPrice(){
       int price = d.getPrice();
       assertEquals(0, price);
    }

    @Test
    public void testSound(){
        String sound = d.sound();
        assertEquals("WUHUUUUUUUUUU", sound);
    }

    @Test
    public void testGetDate(){
        String date = d.getDate();
        assertEquals( "2021/09/27", date);
    }

    @Test
    public void testGetItem(){
        String item = d.getItem();
        assertEquals("item", item);
    }

    @Test
    public void testGetDeliver_name(){
        String name = d.getDeliver_name();
        assertEquals("John", name);
    }

}
