package lesson10.HW;

import java.util.Arrays;
import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        String[] cities = {"Киев", "Одесса", "Днепр", "Харьков"};
        int minPrice = 100;
        String gender = "Женский";
        if (Arrays.asList(cities).contains(getShipToCity()) && Arrays.asList(cities).contains(getShipFromCity()) && getBasePrice() >= minPrice && getCustomerOwned().getGender() == gender) {
            System.out.println("Order is validated");
            confirmShipping();

        } else
            System.out.println("Order is no validated");
    }

    @Override
    public void calculatePrice() {
        if (getDateShipped() != null) {
            if (getShipToCity() == "Киев" || getShipToCity() == "Одесса") {
                setTotalPrice(getBasePrice() * 1.1);
            } else
                setTotalPrice(getBasePrice() * 1.15);
            if (getBasePrice() > 1000)
                setTotalPrice(getTotalPrice() * 0.95);

            System.out.println("Total price is " + (int) getTotalPrice());
        }
    }
}

