package Lesson6;

public class Car {
    //fields
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;


    //constructor



    public Car(int price, int yearOfManufacting, String ownerName) {
        this.price = price;
        this.yearOfManufacturing = yearOfManufacting;
        this.ownerName = ownerName;
    }

    //methods
    void startRun() {
        System.out.println("I am running...");
    }

    void stopRun() {
        System.out.println("I am stopping....");
    }

    void changeOwner(String newOwnerName) {
        ownerName = newOwnerName;
    }

    //inner class
    private class Test {

    }

}
