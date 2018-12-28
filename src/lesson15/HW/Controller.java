package lesson15.HW;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room el : api.getAll()) {
                    if (el != null && price == el.getPrice() && persons == el.getPersons() && city == el.getCityName() && hotel == el.getHotelName())
                        i++;
                }
            }
        }
        Room[] appropriateRooms = new Room[i];
        int b = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room el : api.getAll()) {
                    if (el != null && price == el.getPrice() && persons == el.getPersons() && city == el.getCityName() && hotel == el.getHotelName()) {
                        appropriateRooms[b] = el;
                        b++;
                    }
                }
            }
        }

        return appropriateRooms;
    }

    Room[] check(API api1, API api2) {
        int i = 0;

        for (Room el1 : api1.getAll()) {
            for (Room el2 : api2.getAll()) {
                if (el1 != null && el2 != null && el1.equals(el2)) {
                    i++;
                }
            }
        }
        Room[] identicalRooms = new Room[i];
        int b = 0;
        for (Room el1 : api1.getAll()) {
            for (Room el2 : api2.getAll()) {
                if (el1 != null && el2 != null && el1.equals(el2)) {
                    identicalRooms[b] = el1;
                    b++;
                }
            }
        }
        return identicalRooms;
    }
}
