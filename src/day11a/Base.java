package day11a;

public abstract class Base {

    public abstract void addition(int a, int b);

    public void subtraction(int a, int b) {
        int subtract = a - b;
        System.out.println("SUBTRACTION: " + subtract);
    }

    public void multiplication(int a, int b) {
        int product = a * b;
        System.out.println("MULTIPLICATION: " + product);
    }

    public void division(int a, int b) {
        int divide = a / b;
        System.out.println("DIVISION: " + divide);
    }
}
