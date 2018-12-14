package Lesson1;

import Lesson9.Company;

public class FinancialCompany extends Company {

    public FinancialCompany(String name, String countryFounded) {
        super(name, countryFounded);
    }

    void demonstrateProtectedModifier(){
        System.out.println(this.code);
    }
}
