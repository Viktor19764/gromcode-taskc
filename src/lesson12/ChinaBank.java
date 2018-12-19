package lesson12;

public class ChinaBank extends Bank{
//    ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
//    limit of funding - 5000 if EUR and 10000 if USD
//    monthly rate - 1% with USD and 0% with EUR
//    commision - 3% if USD and up to 1000, 5% if USD and more than 1000
//            10% if EUR and up to 1000 and 11% if EUR and more than 1000

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.USD)
            return 100;
        return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if(getCurrency() == Currency.EUR)
            return 5000;
        else
            return 10000;
    }

    @Override
    public double getMonthlyRate() {
        if(getCurrency() == Currency.EUR)
            return 0;
        else
            return 0.01;
    }

    @Override
    public double getCommission(int amount) {
        if(getCurrency() == Currency.USD){
            if(amount <= 1000)
                return 0.03;
            else
                return 0.05;
        } else {
            if (amount <= 1000)
                return 0.1;
            else
                return 0.11;
        }
    }
}
