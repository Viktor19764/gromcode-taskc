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
        if (getCustomerOwned() != null && Arrays.asList(cities).contains(getShipFromCity()) && Arrays.asList(cities).contains(getShipToCity()) && getBasePrice() >= minPrice && getCustomerOwned().getGender() == gender) {
            setDateConfirmed(new Date());

        }
    }

    @Override
    public void calculatePrice() {
        if (getCustomerOwned() != null) {
            double shipmentPrice = 0;
            if (getShipToCity() == "Киев" || getShipToCity() == "Одесса")
                shipmentPrice = getBasePrice() * 0.1;
            if (getShipToCity() == "Днепр" || getShipToCity() == "Харьков")
                shipmentPrice = getBasePrice() * 0.15;
            double totalPrice = getBasePrice() + shipmentPrice;
            if (totalPrice > 1000)
                setTotalPrice(totalPrice * 0.95);
            else setTotalPrice(totalPrice);
        } else
            System.out.println("Incorrect orderdata");
    }


}