package lesson15.HW;

import java.util.Arrays;

public class TripAdvisorAPI implements API {
    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
//        int a = 0;
//        if (persons > 0)
//            a = persons - 1;
        int i = 0;
        for (Room el : rooms) {

            if (el != null && price == el.getPrice() && el.getPersons() >= (persons - 1) && el.getPersons() <= (persons + 1) && city == el.getCityName() && hotel == el.getHotelName()) {
                i++;
            }
        }
        Room[] appropriateRooms = new Room[i];
        i = 0;
        for (Room el : rooms) {
            if (el != null && price == el.getPrice() && el.getPersons() >= (persons - 1) && el.getPersons() <= (persons + 1) && city == el.getCityName() && hotel == el.getHotelName()) {
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
        return "TripAdvisorAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
