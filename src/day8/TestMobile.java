package day8;

public class TestMobile {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brands = "Apple";
        mobile1.price = 3456;
        mobile1.storageCapacity = 128;
        mobile1.displayType = "LCD";
        mobile1.oldOrNewItem = true;


        System.out.println(mobile1.brands); //Apple
        System.out.println(mobile1.price); //0.0
        System.out.println(mobile1.storageCapacity);//0
        System.out.println(mobile1.displayType);//null
        System.out.println(mobile1.oldOrNewItem);//false


        System.out.println("================================================");

        Mobile mobile2 = new Mobile();
        mobile2.brands = "Samsung";
        mobile2.oldOrNewItem = false;
        mobile2.displayType = "AMOLED";
        mobile2.storageCapacity = 356;
        mobile2.price = 3456.78;

        System.out.println(mobile2.price);
        System.out.println(mobile2.brands);
        System.out.println(mobile2.oldOrNewItem);
        System.out.println(mobile2.displayType);
        System.out.println(mobile2.storageCapacity);

        Automobile auto1= new Automobile();

    }
}
