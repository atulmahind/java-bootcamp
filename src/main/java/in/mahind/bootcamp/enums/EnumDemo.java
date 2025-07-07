package in.mahind.bootcamp.enums;

public enum EnumDemo {
    C1(5), C2(10), C3(15) {
        @Override
        public void taste() {
            System.out.println("Taste");
        }
    }, C4(20), C5;

    final int n;

    EnumDemo(int n) {
        this.n = n;
    }

    EnumDemo() {
        this.n = 0;
    }

    public void taste() {
        System.out.println("YOLO");
    }

    public int getN() {
        return this.n;
    }
}
