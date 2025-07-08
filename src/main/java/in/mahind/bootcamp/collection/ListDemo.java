package in.mahind.bootcamp.collection;

public class ListDemo {


    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        // Arrays
        int[] integers = new int[1000];
        Integer[] integers2 = new Integer[1000];

        Object[] objects = new Object[1000];

        Object object = objects[10];

        // 1. Fixed in size
        // 2. Not memory efficient
        //                             -> High Performance
        // 3. No inbuilt method support

        // Collection Framework -> Java 1.2

        // 1. Growable collections  -> Memory efficient
        //                          -> Low Performance
        // 2. Underneath Data-Structure
        // 3. Inbuilt method support

        // Collection Framework:
            // Several Interfaces
            // Several Classes

        // Collection and Collections

        // Interface       Class


        /*
        Collection interface important methods

        add(Object o)
        addAll(Collection c)
        remove(Object o)
        removeAll(Collection c)
        retainAll(Collection c)
        clear()
        contains(Object c)
        containsAll(Collection c)
        isEmpty()
        size()
        toArray()
        iterator()
         */

        /*
        List interface important methods

        add(int index, Object o)
        addAll(index, c)
        get(index)
        remove(index)
        set(index, o)
        indexOf(o)
        lastIndexOf(o)
        listIterator()
         */

        /*

        ArrayList

        Resizable (growable) array -> consecutive memory location
        Duplicates are allowed
        Insertion order is preserved
        Heterogeneous objects are allowed (if we don't use Generics)
        'null' insertion allowed

        Best case   when the frequent operation is Retrieve
        Worst case  when the frequent operation is Insertion or Deletion in the middle

         */

        /*
            -- Exercise--

            Create a custom class and use it in a foreach loop
         */

    }

}

