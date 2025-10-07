package day5;

public class IfElseIfStatement
{
    public static void main(String[] args) {
        //We want to check, what grade should be assigned to the student depending upon the marks scored

        int marks = 67;
        if(marks>90)
        {
            System.out.println("Student has scored A++ grade ");
        }
        else if(marks>80 && marks <=90)
        {
            System.out.println("Student has scored A+ grade");
        }
        else if(marks>70 && marks <=80)
        {
            System.out.println("Student has scored A grade");
        }
        else if(marks>60 && marks <=70)
        {
            System.out.println("Student has scored B++ grade");
        }
        else if(marks>50 && marks <=60)
        {
            System.out.println("Student has scored B+ grade");
        }
        else if(marks>40 && marks <=50)
        {
            System.out.println("Student has scored B grade");
        }
        else
        {
            System.out.println("Sorry, better luck next time....");
        }
    }
}
