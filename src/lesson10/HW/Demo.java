package lesson10.HW;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        ElectronicsOrder elektronicsOrder1 = new ElectronicsOrder("Ноутбук", new Date(), "Киев", "Днепр", 1100, new Customer("Лидия Иваненко", "Житомир", "Женский"), 12);
        ElectronicsOrder elektronicsOrder2 = new ElectronicsOrder("Ноутбук", new Date(), "Винница", "Одесса", 22000, new Customer("Лидия Иваненко", "Одесса", "Женский"), 12);

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Wi-Fi розетка", new Date(), "Киев", "Херсон", 500, new Customer("Петр Петренко", "Херсон", "Мужской"), "1111");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Стол для компьютера", new Date(), "Чернигов", "Херсон", 1000, new Customer("Василий  Васильченко", "Херсон", "Мужской"), "2222");

        outputInfoAboutOrder((Order) elektronicsOrder1);
        outputInfoAboutOrder((Order) elektronicsOrder2);
        outputInfoAboutOrder((Order) furnitureOrder1);
        outputInfoAboutOrder((Order) furnitureOrder2);


    }

    private static void outputInfoAboutOrder(Order order) {
        order.validateOrder();
        if (order.getDateConfirmed() != null) {
            System.out.println("Order is validated");
            order.calculatePrice();
            System.out.println("Total price is " + String.format("%.2f", order.getTotalPrice()));
            order.confirmShipping();
        } else System.out.println("Order is no validated");
        System.out.println("-------------------");
    }


}