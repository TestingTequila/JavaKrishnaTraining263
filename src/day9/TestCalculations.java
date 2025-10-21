package day9;

public class TestCalculations {
    public static void main(String[] args) {
        Calculations calc = new Calculations();
        //int total1=calc.addition1(12, 4); //void not possible as the method is returning void

        int total2 = calc.addition2(12, 4); //int sum
        System.out.println("total2: " + total2*5);

//        int total3 = calc.addition3(12, 4); //int a
//        System.out.println("total3: " + total3);
//
//        int total4 = calc.addition4(12, 4);// int b
//        System.out.println("total4: " + total4);
    }
}
