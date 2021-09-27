import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WolfTest {
    Wolf n;
    @Before
    public void setUp() throws Exception {
        n = new Wolf();
    }


    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, n.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        n.upgradeSpeed();
        assertEquals(3, n.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        n.downgradeSpeed();
        assertEquals(1, n.getMaxSpeed());
    }

//    @Test(timeout = 50)
//    public void TestGetPrice() {
//        assertEquals(20, n.getPrice());
//    }
}
