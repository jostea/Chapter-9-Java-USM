package HomeWork9_10;

public class Employee {
    private String firstName;
    private String secondName;
    private String socialSecurityNumber;


    public Employee(String firstName, String secondName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName() + "\nSecond name: " + getSecondName() + "\nSocial security number:" + getSocialSecurityNumber();
    }
}
