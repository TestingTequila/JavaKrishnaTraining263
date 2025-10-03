package day4;

public class ArrayConcepts2 {
    public static void main(String[] args) {
        int x;
        x = 99;

        int[] marks = new int[10];
        marks[1] = 78;
        marks[2] = 98;
        marks[5] = 85;
        marks[0] = 65;
        marks[3] = 99;
        marks[7] = 54;
        marks[4] = 52;
        marks[6] = 87;
        marks[8] = 97;
        marks[9] = 99;
        System.out.println(marks[0]);//65
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);//99
        System.out.println(marks[4]);
        System.out.println(marks[5]);//85
        System.out.println(marks[6]);
        System.out.println(marks[7]);//54
        System.out.println(marks[8]);
        System.out.println(marks[9]);

        // 6 fruits

        String[] fruits = new String[6];
        fruits[0]="Apple";
        System.out.println(fruits[0]);


    }
}
