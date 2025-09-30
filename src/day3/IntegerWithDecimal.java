package day3;

public class IntegerWithDecimal
{
    public static void main(String[] args) {
        //1. I/I = I part only
        System.out.println("************I/D or D/I or D/D = I+D part both =************I");
        System.out.println(10/2); //5
        System.out.println(10.0/2);//5.0
        System.out.println(10/2.0);//5.0
        System.out.println(10.0/2.0);//5.0

        System.out.println("======================");
        System.out.println(9/2); //4
        System.out.println(9.0/2);//4.5
        System.out.println(9/2.0); //4.5
        System.out.println(9.0/2.0);//4.5
        System.out.println(10/3); //3
        System.out.println(10/3.0);//3.333333

        System.out.println("======================");
        int i = 10;
        int j = 3;
        int divide1 =i/j;//3
        double divide2 =i/j;//3.0
        System.out.println(divide1);//3
        System.out.println(divide2);//3.0
    }
}
