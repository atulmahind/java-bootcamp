package in.mahind.bootcamp.stream;

import javax.naming.InitialContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

| Difference                   | Anonymous Inner Class                                           | Lambda Expression                                               |
| ---------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| Definition                   | A class without a name that can extend classes or               | An anonymous method ("function") implementing a functional      |
|                              | implement interfaces with any number of abstract methods        | interface (exactly one abstract method)                         |
| Extends Classes?             | Can extend abstract or concrete classes                         | Cannot extend classes — only implement single-method interfaces |
| Implements Multiple Methods? | Yes, can implement interfaces with multiple abstract methods    | Only supports functional interfaces                             |
| Instance Variables           | Allowed — can maintain state                                    | Not allowed — any variables are local                           |
| Instantiation                | Creates a new class instance                                    | Not instantiable — represents a function not an object          |
| 'this' reference             | Refers to the anonymous inner-class instance                    | Refers to the enclosing outer class object                      |
| Compilation Output           | Generates a separate `.class` file                              | No extra class file — compiled via `invokedynamic` to a private |
|                              |                                                                 | method in the enclosing class                                   |
| Memory Allocation            | Allocated on-demand, class and object loaded at runtime         | Lives in Metaspace; uses `invokedynamic`, minimal runtime overhead  |
| Performance                  | Slightly slower due to class loading and instantiation          | Faster; runtime optimizations kick in after first invocation    |


Advantages of Lambda expression
--------------------------------
1. To enable functional programming in Java
2. To reduce the length of the code so that readability is increased
3. To resolve the complexity of Anonymous Inner Class upto certain extent
4. To handle certain procedures/functions just like variables
5. To pass procedures/functions as arguments
6. Easier to use updated APIs and the libraries -> e.g. Stream API
7. To enable support for parallel processing

*/

public class StreamDemo {

    /*

    Get a Taste of Lambdas and Get Addicted to Streams by Venkat Subramaniam
    https://www.youtube.com/watch?v=1OpAgZvYXLQ

     */

    public static void main(String[] args) {

        // 1. What's a Lambda Expression

        // 3. How it fits into the Java philosophy
            // - Backwards Compatible
            // - Transitioning into 1.8

        // 5. Transforming iterations
        // from imperative
        // to funtional

        // 6. A peek at method references
            // - parameter as an argument
            // - parameter as an argument to a static method
            // - parameter as a target
            // - two parameters as arguments
            // - two parameters, one as target and one as an argument

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .map(String::valueOf)
                //.map(String::toString)
                .map(e -> e.toString())
                .forEach(e -> System.out.println(e));


        /*
            Practice Examples

            1. Calculate average of integers using streams
                List <Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);

            2. Convert strings to upper/lowercase using streams
                List <String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

            3. Sum even and odd numbers in list using streams
                List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            4. Remove duplicates from list using streams
                List <Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);

            5. Count strings starting with letter using streams
                List <String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
                    1. char startingLetter = 'B';
                    2. char startingLetter = 'Y';

            6. Sort strings A-Z and Z-A using streams
                List <String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

            7. Find max and min in list using streams
                List <Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);

            8. Find 2nd smallest and largest using streams
                List <Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);

         */

        List<IntialType> l1 = new ArrayList<>();
        l1.add(new IntialType("name1", "type1"));
        l1.add(new IntialType("name2", "type2"));
        l1.add(new IntialType("name3", "type3"));

        ConversionClass conversionClass = new ConversionClass();
        conversionClass.convert(l1);

    }
}

class IntialType {
    String name;
    String type;

    IntialType(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class TargetType {
    String newName;
    String newType;

    TargetType(String newName, String newType) {
        this.newName = newName;
        this.newType = newType;
    }

}

class ConversionClass {
    public List<TargetType> convert(List<IntialType> intialTypes) {
        return intialTypes.stream()
                .map(this::convert)
                .toList();
    }

    public TargetType convert(IntialType intialType) {
        return new TargetType(intialType.name, intialType.type);
    }
}
