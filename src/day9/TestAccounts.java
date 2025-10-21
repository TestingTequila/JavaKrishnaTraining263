package day9;

public class TestAccounts {
    public static void main(String[] args) {
        Accounts emp1 = new Accounts();
        double finalSalary =emp1.calculateSalary(1234.45, 3456.76);
        double mySalary =finalSalary + 1000;
        System.out.println("Final Salary After Bonus: " + mySalary);
    }
}
