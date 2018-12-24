package lesson11.HW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Demo {

    /////// не посилати на перевірку на сайт, тільки для перевірки на комп'ютері

    public static void main(String[] args) {
        Room[] rooms1 = new Room[10];
        try {
            rooms1[0] = new Room(3, 200, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"), "SomeHotel1", "SomeCity1");
            rooms1[1] = new Room(7, 100, 3, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-07"), "SomeHotel2", "SomeCity2");
            rooms1[2] = new Room(11, 250, 1, new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-09"), "SomeHotel3", "SomeCity3");
            rooms1[3] = new Room(198, 240, 4, new SimpleDateFormat("yyyy-MM-dd").parse("2019-04-09"), "SomeHotel4", "SomeCity2");
            rooms1[4] = new Room(54, 107, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-17"), "SomeHotel2", "SomeCity4");
            rooms1[5] = new Room(91, 211, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-11"), "SomeHotel3", "SomeCity1");
            rooms1[6] = new Room(18, 90, 3, new SimpleDateFormat("yyyy-MM-dd").parse("2019-05-09"), "SomeHotel2", "SomeCity2");
            rooms1[7] = new Room(38, 95, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-02-09"), "SomeHotel1", "SomeCity4");
            rooms1[8] = new Room(92, 100, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-11"), "SomeHotel3", "SomeCity1");
            rooms1[9] = new Room(93, 160, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-11"), "SomeHotel3", "SomeCity1");
        } catch (ParseException e) {
            System.out.println("Error date");
        }

        Room[] rooms2 = new Room[9];
        try {
            rooms2[0] = new Room(13, 220, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"), "SomeHotel1", "SomeCity1");
            rooms2[1] = new Room(17, 140, 3, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-07"), "SomeHotel2", "SomeCity2");
            rooms2[2] = new Room(111, 200, 1, new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-09"), "SomeHotel3", "SomeCity3");
            rooms2[3] = new Room(1198, 140, 4, new SimpleDateFormat("yyyy-MM-dd").parse("2019-04-09"), "SomeHotel4", "SomeCity2");
            rooms2[4] = new Room(31, 211, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-11"), "SomeHotel3", "SomeCity1");
            rooms2[5] = new Room(191, 41, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2019-09-11"), "SomeHotel4", "SomeCity1");
            rooms2[6] = new Room(37, 100, 3, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-07"), "SomeHotel2", "SomeCity2");
            rooms2[7] = new Room(75, 90, 3, new SimpleDateFormat("yyyy-MM-dd").parse("2019-05-09"), "SomeHotel2", "SomeCity2");
        } catch (ParseException e) {
            System.out.println("Error date");
        }

        BookingComAPI bookingComAPI1 = new BookingComAPI(rooms1);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms2);
        GoogleAPI googleAPI = new GoogleAPI(rooms2);


        API[] apis = new API[10];
        apis[0] = googleAPI;
        apis[1] = tripAdvisorAPI;
        apis[2] = bookingComAPI1;
        API[] apis2 = new API[10];
        apis2[0] = googleAPI;
        apis2[1] = tripAdvisorAPI;
        apis2[2] = bookingComAPI1;


        Controller controller = new Controller(apis);

        System.out.println(Arrays.deepToString(controller.requestRooms(211, 2, "SomeCity1", "SomeHotel3")));
        for (Room el : bookingComAPI1.getAll()) {
            if (el != null)
                System.out.println("getAll   " + el.hotelName + "  id  " + el.getId());
        }
        System.out.println("1------------1");
        for (Room el : bookingComAPI1.findRooms(211, 2, "SomeCity1", "SomeHotel3")) {
            if (el != null)
                System.out.println("findRooms   " + el.hotelName + "  id  " + el.getId());
        }

        System.out.println("2------------2");
        for (Room el : controller.requestRooms(211, 2, "SomeCity1", "SomeHotel3")) {
            if (el != null)
                System.out.println("reqyestRooms   " + el.hotelName + "  id  " + el.getId());
        }

        System.out.println("3------------3");
        for (Room el : controller.check(bookingComAPI1, tripAdvisorAPI)) {
            if (el != null) {
                System.out.println("check API   " + el.hotelName + "  id  " + el.getId());
            }
        }


        API[] apisTest = new API[10];
        apisTest[1] = googleAPI;
        apisTest[2] = bookingComAPI1;
        Controller controllerTest = new Controller(apisTest);
        System.out.println("Test started");
        System.out.println("-------------------");
        System.out.println(Arrays.deepToString(googleAPI.getAll()) + " Google API");
        System.out.println(Arrays.deepToString(bookingComAPI1.getAll()) + " Booking API");
        System.out.println(Arrays.deepToString(bookingComAPI1.findRooms(222, 2, "22222", "22222")));
        System.out.println(Arrays.deepToString(googleAPI.findRooms(222, 2, "22222", "22222")));

        System.out.println();
        System.out.println(Arrays.deepToString(controller.check(googleAPI, bookingComAPI1)));

    }
}
