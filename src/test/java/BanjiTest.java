import org.junit.*;

import static org.junit.Assert.*;

public class BanjiTest {
    Banji b = new Banji();

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(8888, b.getPrice());
    }

}
