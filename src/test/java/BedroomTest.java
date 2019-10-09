import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {


    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void before() {
        bedroom1 = new Bedroom("Room 1", 4, "Single");
        bedroom2 = new Bedroom("Room 2", 2, "Double");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals("Room 1", bedroom1.getRoomNumber());
    }
}
