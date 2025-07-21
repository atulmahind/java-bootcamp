package in.mahind.bootcamp.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class CollectionsDemo {

    /*

    Problem of sorting
                            C (I)
                    _________|______________
                   |             |         |
                  L (I)          |         Q (I)
                  |             S (I)      |
                 ??              |        TM
                                 TS
     */

    public static void main(String[] args) {

        /*

        Collections

        - Defines several utility methods for collection objects
          e.g. sorting, searching, reversing etc.

         */

        /*

        Sorting elements of list

           1. public static void sort(List l)
                * DNSO
                * Homogenous and Comparable, otherwise RE: CCE
                * 'null'    =>  RE:NPE

           2. public static void sort(List l, Comparator c)

         */

//        ArrayList list = new ArrayList();
//        list.add("Z");
//        list.add("A");
//        list.add("K");
//        list.add("N");
//
//        // list.add(10);        // RE: CCE
//        // list.add(null);      // RE: NPE
//
//        System.out.println("Before sorting: "+list);
//        Collections.sort(list);                                 // DNSO => Alphabetical
//        Collections.sort(list, new DescendingStringComparator());     //  CSO => Descending alphabetical
//        System.out.println("After sorting:  "+list);

        /*

        Binary Search

        1. public static int binarySearch(List l, Object target)
            - if the list is sorted according to DNSO
        2. public static int binarySearch(List l, Object target, Comparator C)
            - if the list is sorted according to CSO

        * List is expected to be sorted otherwise, the method will give unpredictable result
        * Searching alogorithm used is binary search
        * Successful search returns index
        * Unsuccessful search returns insertion point
        * Insertion point is a location where target element can be placed in the sorted list
        * If the list is sorted according to comparator then, the same comparator object needs to passed to
          the binarySearch() otherwise, unpredictable result

         */

//        ArrayList list = new ArrayList();
//        list.add("a");
//        list.add("Z");
//        list.add("A");
//        list.add("K");
//        list.add("N");
//
//        System.out.println(list);
//        // Collections.sort(list);     // is it optional ??
//        System.out.println(list);
//
//        // System.out.println(Collections.binarySearch(list, "a"));
//        System.out.println(Collections.binarySearch(list, "a"));

//
//        ArrayList l = new ArrayList();
//        l.add(15);
//        l.add(0);
//        l.add(20);
//        l.add(10);
//        l.add(5);
//        System.out.println(l);
//
//        Comparator c = new DescendingComparator();
//
//        Collections.sort(l, c);
//        System.out.println(l);
//        System.out.println(Collections.binarySearch(l, 10, c));
//        System.out.println(Collections.binarySearch(l, 13, c));
//        System.out.println(Collections.binarySearch(l, 17));

        /*

        For list of n elements in case of binarySearch method
            - successful search result range: 0 to n-1
            - unsuccessful search result range: -(n+1) to -1
            - total result range: -(n+1) to n-1
         */

        /*

        Reversing elements of list

            public static void reverse(List l)

         */
//
//        ArrayList l = new ArrayList();
//        l.add(15);
//        l.add(0);
//        l.add(20);
//        l.add(10);
//        l.add(5);
//        System.out.println(l);  // [ ?? ]
//        Collections.reverse(l);
//        System.out.println(l);  // [ 5, 10, 20, 0, 15 ]

        /*

        reverseOrder()

            - to get the reverse order comparator

        Comparator c1 = Collections.reverseOrder();

        Comparator c1 = Collections.reverseOrder(Comparator c);

         */
    }
}

class DescendingComparator implements Comparator<Comparable<Object>> {
    public int compare(Comparable<Object> str1, Comparable<Object> str2) {
        return str2.compareTo(str1);
    }
}


