package day2;

public class StringConcatenation {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        String x= "Hello";
        String y= "World";

        System.out.println(a);//100
        System.out.println(b);//200
        System.out.println(x);//hello
        System.out.println(y);//world

        System.out.println("=====================================");

        System.out.println(a+b);//300
        System.out.println(x+y); //HelloWorld
        System.out.println(x+a); // Hello100
        System.out.println(a+b+x+y);// 300HelloWorld
        System.out.println(x+y+a+b);//HelloWorld100200
        System.out.println(a+b+x+y+a+b); // 300HelloWorld100200


    }
}
