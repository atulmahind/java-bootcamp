package in.mahind.bootcamp.staticfields;

public class Test {

    static int counter = 0;

    static void accessStaticField() {
        counter++;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.accessStaticField();
        test.accessStaticField();
        test.accessStaticField();
        System.out.println(counter);
    }

}
