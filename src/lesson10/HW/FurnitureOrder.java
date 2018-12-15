package lesson10.HW;

import java.util.Arrays;
import java.util.Date;

public class FurnitureOrder extends Order{
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        String[] cities = {"Киев", "Львов"};
        int minPrice = 500;
        String name = "Тест";
        if (Arrays.asList(cities).contains(getShipFromCity()) && getBasePrice() >= minPrice && getCustomerOwned().getName() != name) {
            System.out.println("Order is validated");
            confirmShipping();

        } else
            System.out.println("Order is no validated");

    }

    @Override
    public void calculatePrice() {
        if (getDateShipped() != null) {
            if (getBasePrice() < 5000)
                setTotalPrice(getBasePrice() * 1.05);
            else
                setTotalPrice(getBasePrice() * 1.05);

            System.out.println("Total price is " + (int) getTotalPrice());
        }
    }
}
