package day11;

public class Test {
    public static void main(String[] args) {
        System.out.println("==================Class A object===========");
        A a = new A();
        a.addition(12, 8);
        a.permutation(12, 4);
        a.combination(12, 4);
        M m = new A();// Top Casting

        System.out.println("==================Class B object===========");
        B b = new B();
        b.addition(12, 4);
        b.subtraction(12, 4);
        A a1 = new B();
        M m1 = new B();

        System.out.println("==================Class C object===========");
        C c = new C();
        c.addition(12, 4);
        c.subtraction(12, 4);
        c.multiplication(12, 4);
        B b1 = new C();
        M m2 = new C();

        System.out.println("==================Class D object===========");
        D d = new D();
        d.addition(12, 4);
        d.subtraction(12, 4);
        d.multiplication(12, 4);
        d.division(12, 4);

        C d1 = new D();
        M m3 = new D();


    }
}
