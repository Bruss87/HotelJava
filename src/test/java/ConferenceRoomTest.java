import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Atlantic", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Atlantic", conferenceRoom1.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, conferenceRoom1.getCapacity());
    }

    @Test
    public void collectionOfGuestsBeginsAtZero() {
        assertEquals(0, conferenceRoom1.getCollectionOfGuests());

    }

}
