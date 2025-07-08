package in.mahind.bootcamp.inner;

public class MethodLocalInnerClass {

    int x = 10;
    static int y = 20;

    public void m1() {

        int a = 30;
        final int b = 40;

        class InnerClass {

            void accessMembers() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(x);
                System.out.println(y);
            }

        }

        InnerClass innerClass = new InnerClass();
        innerClass.accessMembers();

    }

    public static void main(String[] args) {
        MethodLocalInnerClass m = new MethodLocalInnerClass();
        m.m1();
    }
}
