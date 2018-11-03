package HomeWork9_14;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        setCommissionRate(commissionRate);
        setGrossSales(grossSales);

    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }


    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.grossSales = grossSales;
    }


    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nGross Sales=" + grossSales +
                "\nCommission Rate=" + commissionRate +
                "\nEarnings=" + earnings();
    }
}
