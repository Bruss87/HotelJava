import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest>collectionOfGuests;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countCollectionOfGuests() {
        return this.collectionOfGuests.size();
    }

    public void addGuest(Guest guest) {
        if (this.countCollectionOfGuests() < this.capacity) {
//        if (this.collectionOfGuests.size() < this.capacity) {
            this.collectionOfGuests.add(guest);
        }
    }

}