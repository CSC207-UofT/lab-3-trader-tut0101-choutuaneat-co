import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChouTest {
    Chou c;
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(11, c.getMaxSpeed());

    }
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(9, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, c.getPrice());
    }
}
