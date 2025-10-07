package day5;

public class Switch
{
    public static void main(String[] args) {
        String dayOfTheWeek = "Monday";
        switch (dayOfTheWeek)
        {
            case "Monday":
                System.out.println("Its Monday...");
                break;
            case "Tuesday":
                System.out.println("Its Tuesday...");
                break;
            case "Wednesday":
                System.out.println("Its Wednesday...");
                break;
            case "Thursday":
                System.out.println("Its Thursday...");
                break;
            case "Friday":
                System.out.println("Its Friday...");
                break;
            default:
                System.out.println("Its Weekend...");

        }
    }
}
