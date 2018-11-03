package HomeWork9_14;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(
            String firstName, String lastName, String socialSecurityNumber,
            double grossSales, double commissionRate, double baseSalary) {

        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);

    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }


    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBase Salary=" + baseSalary;
    }
}
