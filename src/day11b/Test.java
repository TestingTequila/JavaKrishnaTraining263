package day11b;

public class Test {
    public static void main(String[] args) {
        System.out.println("============================A======================");
        A a = new A();
        a.addition(12, 4);
        a.subtraction(12, 4);
        a.multiplication(12, 4);
        a.division(12, 4);

        System.out.println("============================B======================");
        B b = new B();
        b.addition(12,4);
        b.subtraction(12,4);
        b.multiplication(12,4);
        b.division(12,4);
        System.out.println("============================C======================");
        C c = new C();
        c.addition(12,4);
        c.subtraction(12,4);
        c.multiplication(12,4);
        c.division(12,4);
        System.out.println("============================D======================");
        D d = new D();
        d.addition(12,4);
        d.subtraction(12,4);
        d.multiplication(12,4);
        d.division(12,4);

        System.out.println("============================Base Interface object======================");

        //Base b1 = new Base(); // Cannot crete object of an interface

       Base b1 = new A(); //Top Casting
       Base b2 = new B();
       Base b3 = new C();
       Base b4 = new D();


    }
}
