package in.mahind.bootcamp.java17.one;

public class RecordDemo {

    // Records
    // https://www.youtube.com/watch?v=gJ9DYC-jswo

    record Range(int start, int end) {

        Range {
            if (start > end) {
                throw new IllegalArgumentException("start should be less than end");
            }
        }
    }

    public static void main(String[] args) {
        Range range = new Range(1, 10);
        System.out.println(range.start);
    }
}
