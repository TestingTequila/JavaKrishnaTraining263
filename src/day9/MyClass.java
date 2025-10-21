package day9;

public class MyClass {

    private int c; // global variable

    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("SUM: " + sum);
    }

    public void subtraction(int a, int b) {
        int diff = a - b;
        System.out.println("SUBTRACTION: " + diff);
    }

    public void multiplication(int a, int b) {
        int product = a * b;
        System.out.println("MULTIPLICATION: " + product);
    }

    protected void division(int a, int b) {
        int divide = a / b;
        System.out.println("DIVISION: " + divide);
    }
}
