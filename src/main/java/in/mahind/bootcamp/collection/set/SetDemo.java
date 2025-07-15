package in.mahind.bootcamp.collection.set;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {

         /*
                    Collection (I)
                        \
                         \
                         Set (I)
                          /\
                         /  \
                        /    \
                 HashSet      SortedSet (I)
                   |              |
                   |              |
           LinkedHashSet      NavigableSet (I)
                                  |
                                  |
                               TreeSet

        2 Set (I)
        - It is an implemetation of the mathematical Set theory
        - No special/new methods -> it uses the methods defined in the Collection intrface only

        2a. HashSet
        - Underlying data structure is hash table
        - No Duplicates
        - No insertion order
            - based on the hash code
        - Null insertion is allowed
        - Heterogeneous objects are allowed
        - Implements: Serializable, Cloneable (but not RandomAccess)
        - Best use case: search (because hashing!!)

          */

        HashSet h = new HashSet();
        h.add(1);
        h.add(1); // will it compile?
        h.add(2);
        h.add("Ford");
        h.add(3);
        h.add(null);
        //System.out.println(h.add("Ford"));
        System.out.println(h);

        /*
        2b. LinkedHashSet
        - Child class of HashSet
        - Exactly same as HashSet (including constructors and methods) except the following differences

                      HashSet                   |           LinkedHashSet
        1. Hash table                           |       LinkedList + Hash table
        2. Insertion order is not preserved     |       Insertion order is preserved
        3. Introduced in 1.2v                   |       1.4v
         */

        /* Replace HashSet with a LinkedHasSet */

//        LinkedHashSet l = new LinkedHashSet();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(3);
//        l.add("Ford");
//        l.add(null);
//        System.out.println(l);

        /*
        2c. SortedSet (I)
        - child interface of Set, so no duplicates
        - Used to group individual objects according to some sorting algorithm

        { 100, 101, 104, 106, 110, 115, 120 }

        Methods
            first()                             => 100
            last()                              => 120
            headSet(106)                        => { 100, 101, 104 }
            tailSet(106)                        => { 106, 110, 115, 120 }
            subSet(101, 115)                    => { 101, 104, 106, 110 }
            comparator()                        => null

        Default Natural Sorting Order
            Numbers -> Ascending order
            Strings -> Alphabetical order

        2d. SortedSet Example -> TreeSet
        - Underlying data structures is a Balanced Tree
        - Duplicates are NOT allowed
        - Insertion order is NOT preserved
        - Heterogeneous objects are NOT allowed (otherwise RE: ClassCastException)
        - 'null' insertion is allowed*
        - All elements are inserted based on some sorting order
            - DNSO
            - Customized sorting order

        Constructors
         */

//        TreeSet ts = new TreeSet(); // DNSO
//        ts.add("A");
//        ts.add("B");
//        ts.add("Z");
//        ts.add("a");
//        ts.add("L");
//        ts.add("1");
//
//        // ts.add(100);
//        // ts.add(null);
//        System.out.println(ts);

        /*
        -- Null Acceptance --

        ts.add(null);
                            A       B       C
        - For non-empty tree set null insertion will throw RE: NPE
        - For empty tree set null insertion is allowed
            - Second element insertion will throw RE: NPE

        Until v1.6 'null' is allowed as a first element in an empty tree set
        From v1.7 'null' is not allowed even as a first element
         */

//        TreeSet t = new TreeSet();
//        t.add(new MyString("C"));
//        t.add(new MyString("B"));
//        t.add(new MyString("A"));
//        t.add(new MyString("D"));
//        System.out.println(t);

        /*
        If we using DNSO -> the object must be:
        - Homogeneous
        - Comparable
        Otherwise RE: ClassCastException

        * An object is said to be comparable iff the corresponding class implements Comparable interface
        * String and all wrapper classes already implement Comparable interface
         */

        /*
        2e. Comparable (I)
        - for default natural sorting order
        - present in java.lang package
        - contains only one method
            public int compareTo(T o)

          obj1.compareTo(obj2)
                |
                |-- returns -ve iff obj1 is before obj2
                |
                |-- returns +ve iff obj1 is after obj2
                |
                |-- returns 0 iff obj1 and obj2 are equal

         */

//        System.out.println("A".compareTo("Z"));     // -ve
//        System.out.println("Z".compareTo("K"));     // +ve
//        System.out.println("A".compareTo("A"));     // 0
//        System.out.println("A".compareTo(null));    // RE: NPE

//        TreeSet set = new TreeSet();
//        set.add("K");   //  no comparison           =>              =>      root
//        set.add("Z");   //  "Z".compareTo("K")      =>      +ve     =>      right child of root
//        set.add("A");   //  "A".compareTo("K")      =>      -ve     =>      left child of root
//        set.add("A");   //  "A".compareTo("K")      =>      -ve     =>      Left child exists, another check is needed
//                        //  "A".compareTo("A")      =>      0       =>      insertion not needed
//        System.out.println(set);

        /*
        2f. Comparator
        - for customized sorting order
        - present in java.util
        - contains 2 methods
            1. compare
            2. equals

            1. public int compare(T o1, T o2)
                        |
                        |-- returns -ve iff o1 is before o2
                        |
                        |-- returns +ve iff o1 is after o2
                        |
                        |-- returns 0 iff o1 and o2 are equal

            2. public boolean equals(Object obj)

        Whenever we are implementing compartor interface we must provide implementation ONLY for compare() method
            We are not required to provide implementation for equals() method ->
            because, it is already available from java.lang.Object through inheritance
         */

        /*
        Exercise: Write a program to add numbers into a tree set with a descending order

        Add -> 10, 0, 15, 5, 20, 20

         */

//        TreeSet integerSet = new TreeSet();
//        integerSet.add(10);
//        integerSet.add(0);
//        integerSet.add(15);
//        integerSet.add(5);
//        integerSet.add(20);
//        integerSet.add(20);
//        System.out.println(integerSet);

        /*

        When to use Comparable and Comparator ?

        There are three categories of classes:
            1. Predefined Comparable classes            =>      DNSO        =>      Comparator (for customized sorting)
               e.g. String, Float, etc.
            2. Predefined non-Comparable classes        =>      -NA-        =>      Comparator (for customized sorting)
            3. For custom classes, the author may
               define DNSO by using Comparable (I)      =>      DNSO?       =>      Comparator (for customized sorting)
               e.g. Employee, Student

         */

    }
}
