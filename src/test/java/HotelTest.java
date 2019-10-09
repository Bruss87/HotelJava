import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private ConferenceRoom conferenceRoom1;
    private Bedroom bedroom1;

    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Atlantic", 3);
        bedroom1 = new Bedroom("Room 1", 4, "Single");
        hotel = new Hotel();
        guest1 = new Guest("Zbigniew Boniek");
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

    //tests whether the hotel can check a guest into a conference room. I'm not sure that we should be calling a method on cothe conference room in the hotel test (this is an issue about responsibility).
    @Test
    public void canAddGuestToConferenceRoom(){
        hotel.addGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.countCollectionOfGuests());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom() {
        hotel.addGuestToConferenceRoom(guest1, conferenceRoom1);
        hotel.removeGuestFromConferenceRoom(guest1, conferenceRoom1);
        assertEquals(0, conferenceRoom1.countCollectionOfGuests());
    }

    //bedroom tests

    @Test
    public void collectionOfBedroomsBeginsAtZero(){
        assertEquals(0, hotel.countBedrooms());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addGuestToBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.countCollectionOfGuests());
    }

    @Test
    public void canRemoveGuestFromBedroom() {
        hotel.addGuestToBedroom(guest1, bedroom1);
        hotel.removeGuestFromBedroom(guest1, bedroom1);
        assertEquals(0, bedroom1.countCollectionOfGuests());
    }

}
