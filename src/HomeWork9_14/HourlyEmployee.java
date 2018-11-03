package HomeWork9_14;

public class HourlyEmployee extends Employee {

    private double hours;
    private double wage;
    private double SalariedEmployees;


    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
        setWage(wage);

    }

    public double earnings() {
        if (hours > 40) {
            return SalariedEmployees = (getWage() * 1.5) * getHours();
        } else return SalariedEmployees = getHours() * getWage();
    }


    public void setHours(double hours) {

        if (hours < 0 || hours >= 168) {
            throw new IllegalArgumentException("Hours must be between 0 and 168 !");
        }
        this.hours = hours;
    }

    public void setWage(double wage) {

        if (wage < 0) {
            throw new IllegalArgumentException("Wage must be higher 0!");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return "Salaried Employees=" + SalariedEmployees;
    }

    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee
                ("Jostea", "Shneider", "148818091996",
                        50, 12);

        hourlyEmployee.earnings();
        System.out.println(hourlyEmployee.toString());
    }
}
