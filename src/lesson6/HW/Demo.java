package lesson6.HW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        try {
            //isConfirmed()
            //was false
            //was true
            Order order1 = new Order(1100, new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-03"), false, null, "Kyiv", "Ukraine", "Buy");
            Order order2 = new Order(1100, new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-03"), true, null, "Kyiv", "Ukraine", "Buy");
            order1.confirmOrder();
            System.out.println(order1);
            order2.confirmOrder();
            System.out.println(order2);

            //checkPrice()
            //price > 1000
            //price < 1000
            //price == 1000
            System.out.println(order1.checkPrice());
            order1 = new Order(100, new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-03"), false, null, "Kyiv", "Ukraine", "Buy");
            System.out.println(order1.checkPrice());
            order1 = new Order(1000, new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-03"), false, null, "Kyiv", "Ukraine", "Buy");
            System.out.println(order1.checkPrice());

            //isValidType()
            //type == Buy
            //type == Sale
            System.out.println("is valid: " + order1.isValidType());
            order1 = new Order(1000, new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-03"), false, null, "Kyiv", "Ukraine", "Saled");
            System.out.println("is valid: " + order1.isValidType());




        } catch (
                ParseException e) {
            System.out.println("Error date");
        }


    }
}
