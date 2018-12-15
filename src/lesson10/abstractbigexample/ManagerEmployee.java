package lesson10.abstractbigexample;

public class ManagerEmployee extends Employee {

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
        new  += newBalance * 0.25;
        getBankAccount().setBalance(newBalance);
    }
}
