import java.util.ArrayList;

public class Bedroom {

    private String roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> collectionOfGuests;

    public Bedroom(String roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.collectionOfGuests = new ArrayList<Guest>();
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }

    public int countCollectionOfGuests(){
        return this.collectionOfGuests.size();
    }

    public void addGuest(Guest guest){
        if (this.countCollectionOfGuests() < this.capacity){
            this.collectionOfGuests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        if (this.countCollectionOfGuests() > 0) {
            this.collectionOfGuests.remove(guest);
        }
    }
}
