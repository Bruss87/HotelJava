import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;


    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Atlantic", 3);
        guest1 = new Guest("Zbigniew Boniek");
        guest2 = new Guest("Keanu Reeves");
        guest3 = new Guest("Dina Asher-Smith");
        guest4 = new Guest("James Maynard Keenan");
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

    @Test
    public void canAddGuestToCollectionOfGuests() {
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.getCollectionOfGuests());
    }

    @Test
    public void cannotAddGuestIfRoomIsFull() {
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest2);
        conferenceRoom1.addGuest(guest3);
        conferenceRoom1.addGuest(guest4);
        assertEquals(3, conferenceRoom1.getCollectionOfGuests());

    }

}
