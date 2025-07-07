package in.mahind.bootcamp.generics;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        printValues(integers);

//       List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
//       printValues(doubles);

//       List<String> strings = Arrays.asList("a", "b", "c");
//       printValues(strings);
    }

    // ? -> wildcard => accepts everything!!
    // let's restrict the list usage type

    // how to add into my list

    private static void printValues(List list) {    // lower-bound
        // modifiable
        for (Object o : list) {
            System.out.println(o);
        }

        list.add(100);
    }
}
