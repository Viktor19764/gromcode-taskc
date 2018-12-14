package Lesson8.phones;

public class IPhone extends Phone{

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced);
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }

    //    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
//        this.price = price;
//        this.weight = weight;
//        this.countryProduced = countryProduced;
//        this.fingerPrint = fingerPrint;
//    }


    void deleteIPhoneFromDb(){
        System.out.println("deleteIPhoneFromBd invoked...");

    }
}
