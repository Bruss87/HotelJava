import java.util.ArrayList;

public class Hotel {

    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> bedrooms;


    public Hotel(){
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bedrooms =  new ArrayList<Bedroom>();
    }

    public int countConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void removeGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }

//BEDROOMS methods

    public int countBedrooms(){
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void removeGuestFromBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }


}
