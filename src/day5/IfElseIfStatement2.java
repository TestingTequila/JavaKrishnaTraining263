package day5;

public class IfElseIfStatement2
{
    public static void main(String[] args) {
        //Depending upon the day of the week, tasks needs to be performed

        String dayOfTheWeek = "Friday";
        if(dayOfTheWeek.equals("Monday"))
        {
            System.out.println("Its Monday, I will practice Data types concept");
        }
        else if (dayOfTheWeek.equals("Tuesday"))
        {
            System.out.println("Its Tuesday, I will practice variables concept");
        }
        else if (dayOfTheWeek.equals("Wednesday"))
        {
            System.out.println("Its Wednesday, I will practice String Concatenation concept");
        }
        else if (dayOfTheWeek.equals("Thursday"))
        {
            System.out.println("Its Thursday, I will practice Math operators concept");
        }
        else if (dayOfTheWeek.equals("Friday"))
        {
            System.out.println("Its Friday, I will practice I/D operators concept");
        }
        else
        {
            System.out.println("Its Weekend...i will take rest and party...");
        }
    }
}
