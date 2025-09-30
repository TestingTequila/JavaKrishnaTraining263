package day3;

public class PostDecrementOperator
{
    public static void main(String[] args) {
        //post Decrement Operator
        int a =1;
        int b =a--;
        System.out.println(a);//0
        System.out.println(b);//1

        int j = 99;
        int k = j--;
        System.out.println(j);//98
        System.out.println(k);//99

        int l = -99;
        int m = l--;
        System.out.println(l);//-100
        System.out.println(m);//-99

        double d = 12.3;
        double e = d--;
        System.out.println(d);//11.3
        System.out.println(e);//12.3



    }
}
