package in.mahind.bootcamp.initializer_block;

public class Whatever {

    public static String myVar;

    private static String initializeClassVariable() {
        // initialization code goes here
        System.out.println("myVar = " + Whatever.myVar);
        myVar = "currentTimeMillis: " + System.currentTimeMillis();
        return myVar;
    }

//    static {
//        System.out.println("myVar = " + Whatever.myVar);
//        myVar = "currentTimeMillis: " + System.currentTimeMillis();
//    }

    {
        System.out.println("Instance initialization...");
    }

    public static void main(String[] args) {
        System.out.println(initializeClassVariable());
//        System.out.println("myVar = " + Whatever.myVar);
//        System.out.println("-----------------------------------------");
//        Whatever whatever = new Whatever();
    }

}
