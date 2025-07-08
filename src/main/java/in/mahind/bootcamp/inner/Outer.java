package in.mahind.bootcamp.inner;

public class Outer {
    class Inner {
        void method1() {
            System.out.println("Inner class method");
        }
    }
    void method2() {

        // case II

        Inner inner = new Inner();
        inner.method1();
    }
    public static void main(String[] args) {

        // Case I & III

        // Outer outer = new Outer();
        // Outer.Inner inner = outer.new Inner();
        // Outer.Inner inner = new Outer().new Inner();
        // inner.method();
        // new Outer().new Inner().method1();

        Outer outer = new Outer();
        outer.method2();
    }
}
