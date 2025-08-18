package in.mahind.bootcamp.java17.two;

final class Square extends Rectangle {}

public class Application {
        /*
         Sealed types

         - Representing hierarchy of classes
         - Abstract class
         - Final class
         - How to create a closed hierarchy?
            - Define a package-protected constructor
            - Define Enum constants

        - "Sealed" to the rescue
            - Reveals intention
            - Creates a closed hierarchy
         */

        /*

        Hierarchy in the same file
        Case 1
        Case 2

        sealed class example

        sealed, final or non-sealed

         */


        /*

        Benefits of sealed

            - Better modelling
                - "Sealed" does not stop you from accessing/using
                  a type but it blocks you from making undesirable changes
            - Better compiler checks
                - First line of defense
            - Enhanced pattern matching

         */

    public static void main(String[] args) {
        System.out.println("OK");

        Shape shape = new Square();

        switch (shape) {
            case Square square -> System.out.println("Square");
            case Circle circle -> System.out.println("Circle");
            case Triangle triangle -> System.out.println("Triangle");
            case Rectangle rectangle -> System.out.println("Rectangle");
        }

    }
}
