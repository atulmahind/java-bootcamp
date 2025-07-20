package in.mahind.bootcamp.collection.map;

import java.util.Objects;

public class ValueObjectDemo {
    private final String street;
    private final String city;

    public ValueObjectDemo(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ValueObjectDemo that = (ValueObjectDemo) o;
        return Objects.equals(street, that.street) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city);
    }
}
