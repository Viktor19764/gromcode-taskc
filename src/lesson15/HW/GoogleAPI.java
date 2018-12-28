package lesson15.HW;

import java.util.Arrays;
import java.util.Date;

public class GoogleAPI implements API {
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        Room room=new Room(0,price,persons,new Date(), hotel,city);
        for (Room el : rooms) {
            //if (el != null && price == el.getPrice() && persons == el.getPersons() && city == el.getCityName() && hotel == el.getHotelName()) {
            if (el != null && el.equals(room)) {
                i++;
            }
        }
        Room[] appropriateRooms = new Room[i];
        i = 0;
        for (Room el : rooms) {
            //if (el != null && price == el.getPrice() && persons == el.getPersons() && city == el.getCityName() && hotel == el.getHotelName()) {
            if (el != null && el.equals(room)) {
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
        return "GoogleAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
