package lesson10.HW;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        ElectronicsOrder elektronicsOrder1 = new ElectronicsOrder("Ноутбук", new Date(), "Киев", "Днепр", 1100, new Customer("Лидия Иваненко", "Житомир", "Женский"), 12);
        ElectronicsOrder elektronicsOrder2 = new ElectronicsOrder("Ноутбук", new Date(), "Винница", "Одесса", 22000, new Customer("Лидия Иваненко", "Одесса", "Женский"), 12);

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Wi-Fi розетка", new Date(), "Киев", "Херсон", 500, new Customer("Петр Петренко", "Херсон", "Мужской"), "1111");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Стол для компьютера", new Date(), "Чернигов", "Херсон", 1000, new Customer("Василий  Васильченко", "Херсон", "Мужской"), "2222");

        elektronicsOrder1.validateOrder();
        if (elektronicsOrder1.getDateConfirmed() != null) {
            System.out.println("Order is validated");
            elektronicsOrder1.calculatePrice();
            System.out.println("Total price is " +  String.format("%.2f", elektronicsOrder1.getTotalPrice()));
            elektronicsOrder1.confirmShipping();
        }
        else System.out.println("Order is no validated");

        System.out.println("-------------------");

        elektronicsOrder2.validateOrder();
        if (elektronicsOrder2.getDateConfirmed() != null) {
            System.out.println("Order is validated");
            elektronicsOrder2.calculatePrice();
            System.out.println("Total price is " +  String.format("%.2f", elektronicsOrder1.getTotalPrice()));
            elektronicsOrder2.confirmShipping();
        }
        else System.out.println("Order is no validated");
        System.out.println("-------------------");

        furnitureOrder1.validateOrder();
        if (furnitureOrder1.getDateConfirmed() != null) {
            System.out.println("Order is validated");
            furnitureOrder1.calculatePrice();
            System.out.println("Total price is " +  String.format("%.2f", furnitureOrder1.getTotalPrice()));
            furnitureOrder1.confirmShipping();
        }
        else System.out.println("Order is no validated");

        System.out.println("-------------------");

        furnitureOrder2.validateOrder();
        if (furnitureOrder2.getDateConfirmed() != null) {
            System.out.println("Order is validated");
            furnitureOrder2.calculatePrice();
            System.out.println("Total price is " +  String.format("%.2f", furnitureOrder2.getTotalPrice()));
            furnitureOrder2.confirmShipping();
        }
        else System.out.println("Order is no validated");

    }
}
