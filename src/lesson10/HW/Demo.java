package lesson10.HW;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        ElectronicsOrder elektronicsOrder1 = new ElectronicsOrder("Ноутбук", new Date(), "Киев", "Днепр", 1100, new Customer("Лидия Иваненко", "Житомир", "Женский"), 12);
        ElectronicsOrder elektronicsOrder2 = new ElectronicsOrder("Системний блок", new Date(), "Винница", "Одесса", 22000, new Customer("Лидия Иваненко", "Одесса", "Женский"), 12);

        ElectronicsOrder elektronicsOrder3 = new ElectronicsOrder("Планшет", new Date(), "Винница", "Одесса", 22000, new Customer("Лидия Иваненко", "Одесса", null), 12);

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Wi-Fi розетка", new Date(), "Киев", "Херсон", 500, new Customer("Петр Петренко", "Херсон", "Мужской"), "1111");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Стол для компьютера", new Date(), "Чернигов", "Херсон", 1000, new Customer("Василий  Васильченко", "Херсон", "Мужской"), "2222");

        Customer customerTest1 = new Customer(null,null,null);
        ElectronicsOrder electronicsOrderTest1 = new ElectronicsOrder(null,null,null,null, 0, customerTest1,0);
        ElectronicsOrder elektronicsOrderTest2 = new ElectronicsOrder("Ноутбук", new Date(), "Киев", "Днепр", 1100, customerTest1, 12);
        ElectronicsOrder elektronicsOrderTest3 = new ElectronicsOrder(null,null,null,null,2000,customerTest1,0);
        ElectronicsOrder elektronicsOrderTest4 = new ElectronicsOrder("Ноутбук", new Date(), "Киев", "Днепр", Integer.MAX_VALUE, new Customer("Лидия Иваненко", "Житомир", "Женский"), 12);

        System.out.println("Start testing 1:");
        outputInfoAboutOrder((Order) electronicsOrderTest1);//1 - всі поля нульові
        System.out.println("Start testing 2:");
        outputInfoAboutOrder((Order) elektronicsOrderTest2);//2 - замовника немає
        System.out.println("Start testing 3:");
        outputInfoAboutOrder((Order) elektronicsOrderTest3);//3 - є лише замовник
        System.out.println("Start testing 4:");
        outputInfoAboutOrder((Order) elektronicsOrderTest4);//4 - тест на переповнення ціни
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