import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {
    Task2 H;

    @Before
    public void setUp() throws Exception {
        H = new Task2();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals(null, H.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(0, H.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(0, H.getPrice());
    }
}
