import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {


    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before() {
        bedroom1 = new Bedroom("Room 1", 4, "Single");
        bedroom2 = new Bedroom("Room 2", 2, "Double");
        guest1 = new Guest("Zbigniew Boniek");
        guest2 = new Guest("Keanu Reeves");
        guest3 = new Guest("Dina Asher-Smith");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals("Room 1", bedroom1.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom2.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("Single", bedroom1.getType());
    }

    @Test
    public void collectionOfGuestsBeginsAtZero(){
        assertEquals(0, bedroom1.countCollectionOfGuests());
    }

    @Test
    public void canAddGuestToCollectionOfGuests(){
        bedroom2.addGuest(guest1);
        assertEquals(1, bedroom2.countCollectionOfGuests());
    }

    @Test
    public void cannotAddGuestIfRoomIsFull() {
        bedroom2.addGuest(guest1);
        bedroom2.addGuest(guest2);
        bedroom2.addGuest(guest3);
        assertEquals(2, bedroom2.countCollectionOfGuests());
    }

    @Test
    public void canRemoveGuestFromCollectionOfGuests() {
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.countCollectionOfGuests());
    }
}
