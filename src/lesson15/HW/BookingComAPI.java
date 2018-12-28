package lesson15.HW;

import java.util.Arrays;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int a = 0;
        if (price > 100)
            a = price - 100;
        int i = 0;
        for (Room el : rooms) {

            if (el != null && el.getPrice() >= a && el.getPrice() <= (price + 100) && persons == el.getPersons() && city == el.getCityName() && hotel == el.getHotelName()) {
                i++;
            }
        }
        Room[] appropriateRooms = new Room[i];
        i = 0;
        for (Room el : rooms) {
            if (el != null && el.getPrice() >= a && el.getPrice() <= (price + 100) && persons == el.getPersons() && city == el.getCityName() && hotel == el.getHotelName()) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookingComAPI that = (BookingComAPI) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(rooms, that.rooms);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(rooms);
    }


    @Override
    public String toString() {
        return "BookingComAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
