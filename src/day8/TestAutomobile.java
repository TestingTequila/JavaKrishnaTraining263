package day8;

public class TestAutomobile {
    public static void main(String[] args) {
        System.out.println("=======================Object1===========================");
        Automobile car = new Automobile();
        System.out.println(car.brandName); //null
        System.out.println(car.nameOfAutomobile);//null
        System.out.println(car.madeYear);//0
        System.out.println(car.IsAutomatic);//false

        car.nameOfAutomobile = "Car";
        car.brandName = "Alpha Romeo";
        car.madeYear = 2021;
        car.IsAutomatic = true;

        System.out.println(car.brandName); //Alpha Romeo
        System.out.println(car.nameOfAutomobile);//Car
        System.out.println(car.madeYear);//2021
        System.out.println(car.IsAutomatic);//true

        System.out.println("================Object 2==================");
        Automobile truck = new Automobile();
        truck.nameOfAutomobile = "ZenithX340";
        truck.brandName = "Tata";
        truck.madeYear = 2024;
        truck.IsAutomatic = false;

        System.out.println(truck.nameOfAutomobile + ", " + truck.brandName + ", " + truck.madeYear + ", " + truck.madeYear);


    }
}
