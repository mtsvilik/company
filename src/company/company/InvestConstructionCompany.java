package company.company;

import company.human.Customer;
import company.investment.Investment;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;

public class InvestConstructionCompany extends ConstructionCompany {

    private Investment[] investments;

    public InvestConstructionCompany(String name, LocalDate foundationDate) {
        super(name, foundationDate);
    }

    public int countInvestments(Investment[] investments) {
        return investments.length;
    }

    @Override
    public BigDecimal countAllBudgets(Customer[] customers) {
        BigDecimal allBudget = new BigDecimal(BigInteger.ZERO);
        for (int j = 0; j < customers.length; j++) {
            BigDecimal budget = customers[j].getBudget();
            allBudget = allBudget.add(budget);
        }
        return allBudget;
    }

    public Investment[] getInvestments() {
        return investments;
    }

    public void setInvestments(Investment[] investments) {
        this.investments = investments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvestConstructionCompany that = (InvestConstructionCompany) o;
        return Arrays.equals(investments, that.investments);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(investments);
    }

    @Override
    public String toString() {
        return "InvestConstructionCompany{" +
                "investments=" + Arrays.toString(investments) +
                '}';
    }
}
