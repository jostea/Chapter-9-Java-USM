package HomeWork9_14;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Jostea", "Shneider", "148818091996",
                        400, 0.5, 2000);
        System.out.println(basePlusCommissionEmployee.toString());
    }
}
