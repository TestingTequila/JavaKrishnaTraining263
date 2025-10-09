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
        System.out.println(students[0]);//Krishna
        System.out.println(students[2]);//Hema
        System.out.println(students[4]);//Vijaya
        System.out.println(students[1]);//Aftab
        System.out.println(students[3]);//John
        System.out.println(students.length);//5


        //12.34, 34.56, 78.90, 43.67, 99.93, 100.45, 77.78
        double[] temperatures = {12.34, 34.56, 78.90, 43.67, 99.93, 100.45, 77.78};
        System.out.println(temperatures[3]);//43.67
        System.out.println(temperatures[5]);//100.45
        System.out.println(temperatures[0]);//12.34
        System.out.println(temperatures[4]);//99.93
        System.out.println(temperatures[1]);//32.56
        System.out.println(temperatures[2]);//78.90
        System.out.println(temperatures[6]);//77.78
        System.out.println(temperatures.length);//7

        //a, e, i, o, u
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(vowels[3]);//o
        System.out.println(vowels[1]);//e
        System.out.println(vowels[4]);//u
        System.out.println(vowels[0]);//a
        System.out.println(vowels[2]);//i
        System.out.println("vowels.length: " + vowels.length); //vowels.length: 7

        //HOME, GIFT CERTIFICATES, BRANDS, BLOGS, CONTACT US

        String[] tabs = {"HOME", "GIFT CERTIFICATES", "BRANDS", "BLOGS", "CONTACT US"};
        System.out.println(tabs[0]);//HOME
        System.out.println(tabs[1]);//GIFT CERTIFICATES
        System.out.println(tabs[2]);//BRANDS
        System.out.println(tabs[3]);//BLOGS
        System.out.println(tabs[4]);//CONTACT US
        System.out.println("Length Of Tabs Arrays is: " + tabs.length);

        //Ashish, 33, m, false, 5000.0
    }
}
