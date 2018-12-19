package lesson12;

public class EUBank extends Bank {
//    limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
//    limit of funding - 20000 if EUR and 10000 if USD
//    monthly rate - 0% with USD and 1% with EUR
//    commision - 5% if USD and up to 1000, 7% if USD and more than 1000
//            2% if EUR and up to 1000 and 4% if EUR and more than 1000

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.USD)
            return 2000;
        return 2200;
    }

    @Override
    public int getLimitOfFunding() {
        if(getCurrency() == Currency.USD)
            return 10000;
        return 20000;
    }

    @Override
    public double getMonthlyRate() {
        if(getCurrency() == Currency.EUR)
            return 0.01;
        else
            return 0;
    }

    @Override
    public double getCommission(int amount) {
        if(getCurrency() == Currency.EUR){
            if(amount <= 1000)
                return 0.02;
            else
                return 0.04;
        } else {
            if (amount <= 1000)
                return 0.05;
            else
                return 0.07;
        }
    }
}
