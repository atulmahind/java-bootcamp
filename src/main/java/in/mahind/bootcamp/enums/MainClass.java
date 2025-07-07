package in.mahind.bootcamp.enums;

public class MainClass {

    public static void main(String[] args) {
        EnumDemo[] values = EnumDemo.values();
//        for (EnumDemo value : values) {
//            System.out.println(value);
//        }

        EnumDemo enumDemo = EnumDemo.C1;
        System.out.println(enumDemo.getN());

        EnumDemo.C3.taste();
    }
}
