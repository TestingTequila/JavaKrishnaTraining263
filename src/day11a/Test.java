package day11a;

public class Test
{
    public static void main(String[] args) {

        System.out.println("=================Class A Object===============");
        A a = new A();
        a.addition(12,4); //16
        a.subtraction(12,4);
        a.multiplication(12,4);
        a.division(12,4);

        System.out.println("=================Class B Object===============");

        B b = new B();
        b.addition(12,4); //32
        b.subtraction(12,4);
        b.multiplication(12,4);
        b.division(12,4);

        System.out.println("=================Class C Object===============");

        C c = new C();
        c.addition(12,4); //
        c.subtraction(12,4);
        c.multiplication(12,4);
        c.division(12,4);
        System.out.println("=================Class D Object===============");

        D d = new D();
        d.addition(12,4); //
        d.subtraction(12,4);
        d.multiplication(12,4);
        d.division(12,4);

        System.out.println("=================Abstract Class Base  Object===============");

        // Base b1 = new Base(); We cannot create object of an abstract class

        System.out.println("=====Top Casting================");
        Base b1 = new A(); //Top Casting
        Base b2 = new B(); //Top Casting
        Base b3 = new C(); //Top Casting
        Base b4 = new D(); //Top Casting

    }
}
