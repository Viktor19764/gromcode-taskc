package lesson10.HW;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        ElectronicsOrder elektronicsOrder1 = new ElectronicsOrder("Ноутбук", new Date(), "Киев", "Днепр", 1100, new Customer("Лидия Иваненко", "Житомир", "Женский"), 12);
        ElectronicsOrder elektronicsOrder2 = new ElectronicsOrder("Системний блок", new Date(), "Винница", "Одесса", 22000, new Customer("Лидия Иваненко", "Одесса", "Женский"), 12);

        ElectronicsOrder elektronicsOrder3 = new ElectronicsOrder("Планшет", new Date(), "Винница", "Одесса", 22000, new Customer("Лидия Иваненко", "Одесса", null), 12);

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Wi-Fi розетка", new Date(), "Киев", "Херсон", 500, new Customer("Петр Петренко", "Херсон", "Мужской"), "1111");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Стол для компьютера", new Date(), "Чернигов", "Херсон", 1000, new Customer("Василий  Васильченко", "Херсон", "Мужской"), "2222");


        System.out.println("Start testing 1:");
        outputInfoAboutOrder((Order) elektronicsOrder1);//1 - всі поля виконуються для electronicsOrder
        System.out.println("Start testing 2:");
        outputInfoAboutOrder((Order) elektronicsOrder2);//2 - поле shipFromCity не знаходиться серед допустимих значень
        System.out.println("Start testing 3:");
        outputInfoAboutOrder((Order) elektronicsOrder3);//3 - поле gender == null
        System.out.println("Start testing 4:");
        outputInfoAboutOrder((Order) furnitureOrder1);//4 - всі поля виконуються для furnitureOrder
        System.out.println("Start testing 5:");
        outputInfoAboutOrder((Order) furnitureOrder2);//5 - поле shipFromCity не знаходиться серед допустимих значень для furnitureOrder


    }

    private static void outputInfoAboutOrder(Order order) {
        //test validateOrder()
        //if validated
        //if no validated

        System.out.println("validate order: ");
        //System.out.println(order);
        order.validateOrder();
        System.out.println(order);
        System.out.println("//---//---//");
        //test calculatePrice()
        //if validated
        //if no validated
        System.out.println("calculate price: ");
        order.calculatePrice();
        System.out.println(order);
        System.out.println("//---//---//");
        //test confirmShipping()
        //if validated
        //if no validated
        System.out.println("confirm shipping:");
        if (order.getDateConfirmed() != null)
            order.confirmShipping();
        System.out.println(order);
        System.out.println("//---//---//");
        System.out.println("//---//---//");

    }


}