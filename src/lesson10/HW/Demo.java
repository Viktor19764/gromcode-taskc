package lesson10.HW;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        ElectronicsOrder elektronicsOrder1 = new ElectronicsOrder("Ноутбук",new Date(), "Киев", "Одесса", 22000, new Customer("Лидия Иваненко", "Одесса", "Женский"), 12);
        ElectronicsOrder elektronicsOrder2 = new ElectronicsOrder("Ноутбук",new Date(), "Винница", "Одесса", 22000, new Customer("Лидия Иваненко", "Одесса", "Женский"), 12);

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Wi-Fi розетка", new  Date(), "Киев", "Херсон", 500, new Customer("Петр Петренко", "Херсон", "Мужской"), "1111");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Стол для компьютера", new  Date(), "Чернигов", "Херсон", 1000, new Customer("Василий  Васильченко", "Херсон", "Мужской"), "2222");

        elektronicsOrder1.validateOrder();
        elektronicsOrder1.calculatePrice();
        //elektronicsOrder1.confirmShipping();

        System.out.println();

        elektronicsOrder2.validateOrder();
        elektronicsOrder2.calculatePrice();
       // elektronicsOrder2.confirmShipping();
        System.out.println("-------------------");

        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        //furnitureOrder1.confirmShipping();

        System.out.println();

        furnitureOrder2.validateOrder();
        furnitureOrder2.calculatePrice();
        //furnitureOrder2.confirmShipping();

    }
}
