package lesson11.HW;

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
    public String toString() {
        return "BookingComAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
