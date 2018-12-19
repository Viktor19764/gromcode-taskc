package lesson7.HW;

import lesson6.HW.Order;

import java.util.Date;

public class DemoHomeWork {

    Order createOrder(){

        return new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
    }

    Order createOrderAndCallMethods(){

        Order orderObject =  new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");

        orderObject.confirmOrder();
        orderObject.checkPrice();
        orderObject.isValidType();

        return orderObject;
    }
}
