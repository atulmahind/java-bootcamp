package in.mahind.bootcamp.var;

import java.util.ArrayList;

public class VarDemo {
    public static void main(String[] args) {

        /*
        Introduced in: Java 10 (JEP 286)
        Reserved type name: 'var'
            'var' is not a keyword in Java
        Purpose: To allow the Java compiler to infer the type of local variable at compile time,
                 improving readability and reducing redundancy.
         */

        /*

        1. What is 'var'?

            * 'var' is not a datatype
            * it is a reserved type name that tells the compiler to infer the type from the initializer.
            * you still write strongly-typed Java; type inference happens at compile time, not runtime.

         */

        // Traditional
//        String name = "Ford";
//        int count = 5;
//        List<String> names = new ArrayList<>();

        // With 'var':
        var name = "Ford";                     // Inferred as String
        var count = 5;                         // Inferred as int
        var names = new ArrayList<String>();   // Inferred as ArrayList<String>

        // Note: You must initialize the variable when declaring with var
        // No initialization = compiler error

        /*

        2. Invalid usages

         */

//        var a;                 //  Error: Cannot use 'var' without initializer
//        var list = null;       //  Error: Cannot infer type from null
//        var[] arr = new int[5]; //  Error: 'var' is not allowed in array declarations
//        var arr = new int[5];   //  Works: 'var' is inferred as integer array

        var names2 = new int[4];
        names2[0] = 1;
        names2[1] = 2;
        names2[2] = 3;
        names2[3] = 4;

        for (var i : names2) {
            System.out.println(i);
        }

        /*

        3. Where can you use 'var'

        | Use Case                       | Allowed |
        | ------------------------------ | ------- |
        | Local variables                |    ✅   |
        | Enhanced `for` loops           |    ✅   |
        | Index-based `for` loops        |    ✅   |
        | `try-with-resources` blocks    |    ✅   |
        | Method parameters              |    ❌   |
        | Constructor parameters         |    ❌   |
        | Class fields (instance/static) |    ❌   |
        | Return types                   |    ❌   |

         */

        /*

        4. Valid examples

         */

//        var numbers = List.of(1, 2, 3);             // List<Integer>
//        for (var number : numbers) {
//            System.out.println(number);
//        }
//
//        try (var outputStream = new FileOutputStream("file.txt")) {
//            // use outputStream
//        }

        /*

        5. Behind the Scenes

        The Java compiler infers the type and replaces var with actual type during compilation
        Example:

            var list = new ArrayList<String>();

            is compiled as:

            ArrayList<String> list = new ArrayList<String>();

         */

        /*

        6. Summary

        6a. Why use 'var'?

            ✅ Pros:
            Reduces verbosity, especially with generics
            Improves readability in simple assignments
            Helps you focus on what is done, not how

            ❌ Cons:
            Can reduce readability when overused or misused
            Might hide complex types, making code harder to understand
            Doesn't work without immediate initialization

        6b. Summary

        | Feature       | Description                          |
        | ------------- | ------------------------------------ |
        | `var` keyword | Type inference for local variables   |
        | Introduced in | Java 10                              |
        | Inferred when | Variable is declared and initialized |
        | Limitations   | Not allowed in fields, method params |
        | Benefits      | Less verbose, cleaner code           |


        Final Tip       =>        Use 'var' to reduce clutter, not to create ambiguity

         */

        /*

        Text Blocks

        introduced in JDK 15

         */

        String something = "something";
        String somethingElse = "something else";
        String string = "I want here "
                + something
                + " and after that I want "
                + somethingElse;

        String textBlock = """
                I want here %s and after that I want %s
                """.formatted(something, somethingElse);

    }

}
