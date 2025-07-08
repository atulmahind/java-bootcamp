package in.mahind.bootcamp.staticfields;

public class BicycleDemo {

    public static void main(String[] args) {
        // System.out.println("Hello " + args[0] + " " + args[1]);
        // System.out.println(Whatever.myVar);

        //String[] myArray = {"Hello", "World", "UK", "India", "Germany", "China"};
        //  arrayPrint(myArray);

        // varargsPrint("Hello", "World", "UK", "India", "Germany", "China");
        //varargsPrint(myArray);

        Bicycle mountainBike = new Bicycle(5, 2, 3);
        Bicycle tandemBike = new Bicycle(5, 3, 3);
        Bicycle fixedGearBike = new Bicycle(2, 5, 5);

        System.out.println(mountainBike.numberOfBicycles);
        System.out.println(mountainBike.getNumberOfBicycles());
    }

    public static void arrayPrint(String[] arr) {

        for (String s : arr) {
            System.out.println("Item: " + s);
        }
    }

    // Varargs
    public static void varargsPrint(String... arr) {
        for (String s : arr) {
            System.out.println("Item: " + s);
        }
    }
}
