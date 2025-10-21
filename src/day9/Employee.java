package day9;

public class Employee
{
    String fName;
    String lName;

    public void empName(String fName,String lName )
    {
        String completeName =fName + " " + lName;
        System.out.println("Employee Name is: " + completeName);
    }
}
