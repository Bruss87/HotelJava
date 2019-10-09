import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Atlantic", 3);
        hotel = new Hotel();

    }
    @Test
    public void collectionOfConferenceRoomsBeginsAtZero(){
        assertEquals(0, hotel.countConferenceRooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.countConferenceRooms());
    }

}
