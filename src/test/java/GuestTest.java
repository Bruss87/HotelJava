import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {
    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Zbigniew Boniek");
    }

    @Test
    public void hasName(){
        assertEquals("Zbigniew Boniek", guest1.getName());
    }
}
