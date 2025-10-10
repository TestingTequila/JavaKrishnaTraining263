package day6;

import java.util.Arrays;

public class ArraysWithLoops {
    public static void main(String[] args) {
        // 12, 34, 65, 78, 54 - int
        //Variables =>  dataType variableName= value;
        //              dataType  variableName;
        //Array     =>  dataType[] arrayName   = {value1, value2, value3, value4......};
        //              dataType[] arrayName = new dataType[countOfValuesThatIWantToStore];

        double x = 55.50;
        System.out.println(x);//55.50

        System.out.println("=======1. Numbers Array With While Loop=============");

        int[] numbers = {12, 34, 65, 78, 54};
        int i =0;
        while (i<numbers.length)
        {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("=======1. Numbers Array With for Loop=============");

        for (int i1 =0;i1<numbers.length;i1++)
        {
            System.out.println(numbers[i1]);

        }

        System.out.println("=======1. Numbers Array With advanced for Loop=============");

        for(int i3 : numbers)
        {
            if(i3!=65)
            {
            System.out.println(i3);
            }
        }

        System.out.println("====Direct Printing the Values in an Array==================");
        System.out.println(Arrays.toString(numbers));

        //Krishna, Aftab, Hema, John, Vijaya

        String[] students = {"Krishna", "Aftab", "Hema", "John", "Vijaya"};
        System.out.println("=======1. Numbers Array With While Loop=============");
        int j =0;
        while (j<students.length)
        {
            if(!(students[j].equals("Krishna"))) {
                System.out.println(students[j]); //Krishna, Aftab, Hema, John, Vijaya
            }
            j++;
        }

        System.out.println("=======1. Numbers Array With For Loop=============");

        for (int j1 =0;j1<students.length;j1++)
        {
            System.out.println(students[j1]); //Krishna, Aftab, Hema, John, Vijaya
        }

        System.out.println("=======1. Numbers Array With Advanced For Loop=============");
        for(String s: students)
        {
            System.out.println(s);
        }

        System.out.println("====Direct Printing the Values in an Array==================");
        System.out.println(Arrays.toString(students));


        //12.34, 34.56, 78.90, 43.67, 99.93, 100.45, 77.78
        double[] temperatures = {12.34, 34.56, 78.90, 43.67, 99.93, 100.45, 77.78};
        System.out.println("=======1. Numbers Array With While Loop=============");
        int k=0;
        while (k<temperatures.length)
        {
            System.out.println(temperatures[k]);//12.34, 34.56, 78.90, 43.67, 99.93, 100.45, 77.78
            k++;//7
        }

        System.out.println("=======1. Numbers Array With for Loop=============");
        for (int k1=0;k1<temperatures.length;k1++)
        {
            System.out.println(temperatures[k1]);
        }

        System.out.println("=======1. Numbers Array With Advanced For Loop=============");
        for(double d: temperatures)
        {
            System.out.println(d);
        }

        System.out.println("====Direct Printing the Values in an Array==================");
        System.out.println(Arrays.toString(temperatures));

        //a, e, i, o, u
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("=======1. Numbers Array With While Loop=============");
        int l=0;
        while (l<vowels.length)
        {
            System.out.println(vowels[l]);//a, e, i, o, u
            l++;//5
        }

        System.out.println("=======1. Numbers Array With While Loop=============");
        for (int l1=0;l1<vowels.length;l1++)
        {
            System.out.println(vowels[l1]);
        }

        System.out.println("=======1. Numbers Array With Advanced For Loop=============");
        for(char v: vowels)
        {
            System.out.println(v);//a, e, i, o, u
        }

        System.out.println("====Direct Printing the Values in an Array==================");
        System.out.println(Arrays.toString(vowels));


        //AIOBE

        //HOME, GIFT CERTIFICATES, BRANDS, BLOGS, CONTACT US

        String[] tabs = {"HOME", "GIFT CERTIFICATES", "BRANDS", "BLOGS", "CONTACT US"};
        System.out.println("=======1. Numbers Array With While Loop=============");
        int m=0;
        while (m<tabs.length)
        {
            System.out.println(tabs[m]);
            m++;
        }

        System.out.println("=======1. Numbers Array With for Loop=============");
        for (int m1=0;m1<tabs.length;m1++)
        {
            System.out.println(tabs[m1]);
        }

        System.out.println("=======1. Numbers Array With Advanced For Loop=============");
        for(String t:tabs)
        {
            System.out.println(t);
        }

        System.out.println("====Direct Printing the Values in an Array==================");
        System.out.println(Arrays.toString(tabs));

        //Ashish, 33, m, false, 5000.0

        System.out.println("=====================================================");
        int[] data = new int[10];
        System.out.println(Arrays.toString(data));
        System.out.println("======================================================");
        int n =0;
        while (n<data.length)
        {
            System.out.println(data[n]);
            n++;
        }

        System.out.println("====================While Loop===========================");
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        int p=0;
        while (p<letters.length)
        {
            System.out.println(letters[p]);//a, c, e, g, i, k
            p=p+2; //10
        }

        System.out.println("====================for Loop===========================");
        for (int p1=0;p1<letters.length;p1=p1+2)
        {
            System.out.println(letters[p1]);//a, c, e, g, i, k
             //10
        }
    }

    int[] products = new int[100000];
}
