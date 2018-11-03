package HomeWork9_14;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    @Override
    public String toString() {
        return String.format("%s%n%s%n%s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
