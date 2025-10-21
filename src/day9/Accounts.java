package day9;

public class Accounts
{
    // whatever be the salary of an employee, the company will pay Christmas bonus of $1000
    //1. calculateSalary [basicSalary, travelAllowance]

    public double calculateSalary(double basicSalary, double travelAllowance)
    {
        double totalSalary =basicSalary + travelAllowance;
        System.out.println("Total Salary before Bonus: " + totalSalary);
        return totalSalary;
    }
}
