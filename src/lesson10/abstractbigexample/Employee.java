package lesson10.abstractbigexample;

public abstract class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;

    private String curPosition;

    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked;
    private String[] positionWorked;

    abstract void paySalary();

    void changePosition(String newPosition) {
        //save current position to history
        //change position
        saveCurPositionToHistory();
        curPosition = newPosition;
    }

    private void saveCurPositionToHistory() {
        int index = 0;
        for(String pos : positionWorked) {
            if (pos == null) {
                positionWorked[index] = curPosition;
                break;
            }
            index++;
        }
    }

    int getBalance() {
        return bankAccount.getBalance();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }
}
