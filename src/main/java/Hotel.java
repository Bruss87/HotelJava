import java.util.ArrayList;

public class Hotel {

    private ArrayList<ConferenceRoom> conferenceRooms;
//      private String[] conferenceRooms;

    public Hotel(){
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
//          this.conferenceRooms = new String [3];
    }

    public int countConferenceRooms(){
        return this.conferenceRooms.size();
    }
}
