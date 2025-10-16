package day8;

public class MyClass {
    int a;
    int b;
    private int c;

    public void addition() {
        int sum = a + b;
        System.out.println("SUM: " + sum);
    }

    public void subtraction() {
        int diff = a - b;
        System.out.println("SUBTRACTION: " + diff);
    }

    private void multiplication()
    {
        int product =a*b;
        System.out.println("MULTIPLICATION: " + product);
    }

    protected void division()
    {
        int divide =a/b;
        System.out.println("DIVISION: " + divide);
    }
}
