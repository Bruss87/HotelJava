import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Atlantic");
    }

    @Test
    public void hasName(){
        assertEquals("Atlantic", conferenceRoom1.getName());
    }
}
