package lesson11.HW;

public class GoogleAPI implements API{
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        for (Room el : rooms) {
            if (el != null && price == el.getPrice() && persons == el.getPersons() && city == el.getCityName() && hotel == el.getHotelName()) {
                i++;
            }
        }
        Room[] appropriateRooms = new Room[i];
        i = 0;
        for (Room el : rooms) {
            if (price == el.getPrice() && persons == el.getPersons() && city == el.getCityName() && hotel == el.getHotelName()) {
                appropriateRooms[i] = el;
                i++;
            }
        }
        return appropriateRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
