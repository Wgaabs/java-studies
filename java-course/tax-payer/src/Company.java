public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return getAnnualIncome() * 0.14;
        } else {
            return getAnnualIncome() * 0.16;
        }
    }
}
