package day9;

public class TestIDCard {
    public static void main(String[] args) {
        IDCard emp1 = new IDCard();
        String name =emp1.printFullName("Tom", ":Cruise");
        System.out.println("Name on ID Card: " + name  + " MEDMA");
    }
}


