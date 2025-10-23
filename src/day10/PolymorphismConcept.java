package day10;

public class PolymorphismConcept
{
    public void addition(int a, int b)
    {

    }

    public void addition(double a, int b)
    {

    }
    public void addition(int a, double b)
    {

    }

    public void addition(double a, double b)
    {

    }


    public void addition(char a, double b)
    {

    }

    public void addition(double a, char b)
    {

    }

    public void addition(char a, char b)
    {

    }

    public void addition(int a, int b, int c)
    {

    }
}


// In a class two or more methods with same name can exist PROVIDED THAT their signatures are different
// How to make signature different
   //1. By changing the data type of parameters
   //2. By changing the order of parameters
   //3. By changing the count of parameters

// Method overloading happens within the same class
// Method overloading is also known by the name 'Compile Time Polymorphism'