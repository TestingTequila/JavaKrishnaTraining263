package day8;

public class TestMyClass {
    public static void main(String[] args) {

        System.out.println("==================Object 1==================");
        MyClass c1 = new MyClass();
        c1.a = 12;
        c1.b = 8;

        System.out.println(c1.a); //12
        System.out.println(c1.b);//8
        c1.addition();// SUM: 20
        c1.subtraction();// SUBTRACTION: 4

        System.out.println("==================Object 2==================");
        MyClass c2 = new MyClass();
        c2.a = 100;
        c2.b = 200;
        System.out.println(c2.a);//0
        System.out.println(c2.b);//0
        c2.addition();//SUM: 300
        c2.subtraction(); // SUBTRACTION: -100




    }
}
