package in.mahind.bootcamp.collection.set;

public class MyString implements Comparable<MyString> {
    private final String string;

    public MyString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "MyString{" +
                "string='" + string + '\'' +
                '}';
    }
}
