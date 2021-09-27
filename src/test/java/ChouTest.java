import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChouTest {
    Chou c;
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, c.getMaxSpeed());
    }
}
