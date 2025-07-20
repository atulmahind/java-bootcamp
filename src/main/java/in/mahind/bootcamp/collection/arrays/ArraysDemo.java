package in.mahind.bootcamp.collection.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo {

    /*

    Arrays class is a utility class to define several utility methods for arrays

     */

    public static void main(String[] args) {

        /*

        1. Sorting elements of an array

        Arrays class defines the following sort methods to sort elements of primitive and object type arrays

        public static void sort(primitive[] p)              =>      Natural Sorting Order
        public static void sort(Object[] o)                 =>      Natural Sorting Order
        public static void sort(Object[] o, Comparator c)   =>      Customized Sorting Order

         */

//        int[] a = { 10, 5, 20, 11, 6 };
//        System.out.print("Before sorting: ");
//        for (int i : a ) {
//            System.out.print(i + " ");
//        }
//        Arrays.sort(a);
//        System.out.print("\nAfter sorting: ");
//        for (int i : a ) {
//            System.out.print(i + " ");
//        }

//        String[] s = {"A", "Z", "B"};
//        System.out.print("\n\nBefore sorting: ");
//        for (String str : s ) {
//            System.out.print(str + " ");
//        }
//        Arrays.sort(s);
//        System.out.print("\nAfter sorting: ");
//        for (String str : s ) {
//            System.out.print(str + " ");
//        }
//        Arrays.sort(s, new DescendingStringComparator());
//        System.out.print("\nAfter desc sorting: ");
//        for (String str : s ) {
//            System.out.print(str + " ");
//        }

        /*

        Primitive data types are sorted only based on default natural sorting order
        whereas object arrays are sorted by default natural sorting order or by customized sorting order

         */

        /*

        2. Searching elements of array

        Arrays class defines the following binary search methods

        public static int binarySearch(primitive[] p, primitive target)
        public static int binarySearch(Object[] p, Object target)
        public static int binarySearch(Object[] p, Object target, Comparator c)

        All rules are exactly same as Collections class' binary search methods

         */

//        int[] a = { 10, 5, 20, 11, 6 };
//        Arrays.sort(a);
//        System.out.println(Arrays.binarySearch(a, 6));
//        System.out.println(Arrays.binarySearch(a, 14));
//
//        String[] s = { "A", "Z", "B" };
//        Arrays.sort(s);
//        System.out.println(Arrays.binarySearch(s, "Z"));
//        System.out.println(Arrays.binarySearch(s, "S"));

//        Arrays.sort(s, new DescendingStringComparator());   // [ ?? ]
//        System.out.println(Arrays.binarySearch(s, "Z", new DescendingStringComparator()));
//        System.out.println(Arrays.binarySearch(s, "S", new DescendingStringComparator()));
//        System.out.println(Arrays.binarySearch(s, "N", new DescendingStringComparator()));

        /*

        3. Conversion of array to List

        From Collection (I)    =>    toArray()

         */

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String[] s = { "A", "Z", "B" };
        List l = Arrays.asList(s);

        /*

         Strictly speaking this method won't create an independant list object
         for the existing array we are getting a list view

         if list reference performs any change then that change will be reflected in the array
         and vice versa

         */

        s[0] = "K";
        System.out.println(l);

        /*

         Be careful: add an element in the list
                     => changing the size of the array

         */

//         l.add("M");     // RE: UnsupportedOpratetionException
//         l.remove(1);    // RE: UnsupportedOpratetionException

//        l.set(0, "D");
//        System.out.println(l);

        /*

        Heterogeneous objects are not allowed

        List reference does not allow elemnt replacement with heterogeneous objects
        otherwise JVM throws runtime exception (ASE)

         */

//        l.set(1, new Integer(10));      // RE: ArrayStoreException
//        System.out.println(l);

    }
}

class DescendingStringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
