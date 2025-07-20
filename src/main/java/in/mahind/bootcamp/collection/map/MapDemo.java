package in.mahind.bootcamp.collection.map;

import java.util.TreeMap;

public class MapDemo {

    /*

    What is a hash table?

    https://www.youtube.com/watch?v=KyUTuwz_b7Q

     */

    /*
                                        Map                                                 Dictionary
            _____________________________|______________________________________________________|
           |                   |                    |                   |                       |
        HashMap         IdentityHashMap         WeakHashMap         SortedMap               Hashtable
           |                                                            |                       |
     LinkedHashMap                                                 NavigableMap             Properties
                                                                        |
                                                                     TreeMap
     */

    public static void main(String[] args) throws Exception {
        /*

        1. Map<K, V>

        Collection interface is about individual objects

        - But if a group of objects is represented as Key-Value pairs => then we should go for Map interface
            e.g.     Key       |    Value
                ---------------|-----------------
                 IP address    |    Domain
                 Roll number   |    Student name
                 Mobile number |    Person

        - Duplicate keys are not allowed, but duplicate values (for different keys) are allowed
        - Map interface methods
            V put(K key, V value)           =>      add mapping from the key to the value
                                                    returns null if key is not present
                                                    returns previous value if the key is present
            void putAll(Map m)              =>      add group of key-value pairs
            V get(key)                      =>      to get the corresponding value
                                                    returns null if the key is not present
            V remove(key)                   =>      removes the mapping
            boolean containsKey(key)        =>      to check whether a particular key is available
            boolean containsValue(value)    =>      to check whether a particular value is available
            boolean isEmpty()               =>      to check if there are any mappings present in this map
            int size()                      =>      to get the number of key-value pairs (mappings)
            void clear()                    =>      remove all the mappings

            Collection views of Map

            Set keySet()                    =>      returns the Set view of the keys contained in this map
            Collection values()             =>      returns the Collection view of the values
            Set entrySet()                  =>      returns the Set view of the mappings


            Entry Specific methods

            K getKey()
            V getValue()
            V setValue()
         */

        /*

        2. HashMap

        - Underlying data structure is hash table
        - Insertion order is NOT preserved
                - based on the hash code of the keys
        - Duplicate keys are NOT allowed
                - values can be duplicate
        - 'null' is allowed for key - only once
                - 'null' is allowed for values (any number of times)
        - Implements Serializable and Cloneable but not RandomAccess
        - Best: if frequent operation is search

         */

        /*

        2a. Constructors

        HashMap m = new HashMap();      // creates an empty HashMap object
                                        // with default initial capacity 16
                                        // and with default load factor 0.75

        HashMap m = new HashMap(int initialCapacity);
        HashMap m = new HashMap(int initialCapacity, float fillRatio);

        HashMap m = new HashMap(Map m);

         */

//        HashMap map = new HashMap();
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        map.put(4, "four");
//        map.put(5, "five");
//        System.out.println(map);
//
//        System.out.println(map.put(5, "ten"));
//
//        Set set = map.keySet();
//        System.out.println(set);
//
//        Collection collection = map.values();
//        System.out.println(collection);
//
//        Set set2 = map.entrySet();
//        System.out.println(set2);
//
//        Iterator iterator = set2.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator.next();
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//            if (entry.getKey().equals(3)) {
//                entry.setValue("hundred");
//            }
//        }
//        System.out.println(map);

        /*

        3.

                HashMap                 |           Hashtable
        --------------------------------|------------------------------
        Not Synchronized                |   Synchronized
        Not thread safe                 |   Thread safe
        Relative performance is high    |   Relative performance is high
        Null as key only once           |   Not allowed
             as value multiple times    |   Not allowed
        1.2v                            |   1.0v

        Synchronized version of HashMap => Collections.synchronizedMap(map)

         */

        /*

        4. LinkedHashMap

        - Child class of HashMap
        - Exactly same as HashMap (including methods and constructors) except following differences -

                      HashMap                   |           LinkedHashMap
        1. Hash table                           |      1. LinkedList + Hash table
        2. Insertion order is not preserved     |      2. Insertion order is preserved
           - it is the order of the hash code   |
             of the keys                        |
        3. Introduced in 1.2v                   |      3. 1.4v

         */

//        LinkedHashMap linkedMap = new LinkedHashMap();
//        linkedMap.put(1, "one");
//        linkedMap.put(2, "two");
//        linkedMap.put(3, "three");
//        linkedMap.put(4, "four");
//        linkedMap.put(5, "five");
//        System.out.println(linkedMap);

        /*

        5a

        ==     vs    equals()

         */

//        IdentityHashMap hashMap = new IdentityHashMap();
//        Integer i1 = new Integer(10);
//        Integer i2 = new Integer(10);
//        hashMap.put(i1, "Zhaonan");
//        hashMap.put(i2, "Meenu");
//        System.out.println(hashMap);

        /*

        5b. IdentityHashMap

        - Exactly same as HashMap (including methods and constructors) except following difference

                In case of HashMap JVM will use equals() to identify duplicate keys
                which is meant for content comparison, but in case of IdentityHashMap
                JVM will use == operator to identify the duplicate keys
                which is meant for reference comparison (address comparison)

         */

//        IdentityHashMap hashMap = new IdentityHashMap();
//        Integer i1 = new Integer(10);
//        Integer i2 = new Integer(10);
//        hashMap.put(i1, "Zhaonan");
//        hashMap.put(i2, "Meenu");                 //     i1 == i2       =>      returns false
//        System.out.println(hashMap);

        /*

        6a. Strong, soft and weak references

        * Strong reference
            - This is the default type of reference in Java
            - If an object has at least one strong reference, it will never be garbage collected

            MyObject obj = new MyObject(); // Strong reference

            As long as obj exists and points to the object, the JVM won’t free that memory.

            Use Case:
                - Almost all your typical objects in an application (e.g., services, user sessions, configurations).
                  Example: Holding onto your current screen controller in Android or a model object in a GUI.

        * Soft reference
            - A soft reference is a reference that the garbage collector can reclaim if memory is low,
              but it tries to keep it alive as long as possible

              SoftReference<MyObject> softRef = new SoftReference<>(new MyObject());

              To access the actual object:

              MyObject obj = softRef.get();

              If obj is null, the JVM has already cleared it to free up memory.

              Real-World Use Case:
                - Caching
                - You want to cache heavy objects like images or database results,
                  but not at the cost of crashing due to OutOfMemoryError

              Example: Map<String, SoftReference<BufferedImage>> imageCache;

        * Weak reference
            - A weak reference is even weaker than a soft reference
            - The object is eligible for garbage collection immediately,
              even if memory is NOT low, as long as no strong references exist

            WeakReference<MyObject> weakRef = new WeakReference<>(new MyObject());
            MyObject obj = weakRef.get();

            Use case:
                - Say you register a listener in a component (like an event handler), but forget to unregister it
                - Use weak references to ensure the object can be GC’d even if the listener registry remains.

                WeakReference<EventListener> weakListener = new WeakReference<>(listener);

                - WeakHashMap
                - Keys are weakly referenced, so if no strong reference to the key exists elsewhere,
                  the entry is cleared

                Map<MyKey, MyValue> map = new WeakHashMap<>();
                If the MyKey instance is no longer referenced anywhere, the map entry is removed automatically

         */

        /*

        6b. WeakHashMap

        - Exactly same as HashMap except:

                In the case of HashMap even though key object doesn't have any reference
                it is not eligible for GC if it is associated with java.util.HashMap

                HashMap dominates GC

                But in the case of WeakHashMap, if key object doesn't contain any references
                it is eligible for GC even though the object is associated with java.util.WeakHashMap

                GC dominates WeakHashMap
         */

//        WeakHashMap map = new WeakHashMap();
//        TestKey tk = new TestKey();
//        map.put(tk, "Some value");
//        System.out.println(map);
//        tk = null;
//        System.gc();
//        Thread.sleep(3000);
//        System.out.println(map);

        /*

        | Reference Type | GC Eligible When?                  | Real-World Use Case                       |
        | -------------- | ---------------------------------- | ----------------------------------------- |
        | Strong         | Never (until all strong refs gone) | Normal object references                  |
        | Soft           | If memory is low                   | Caching (e.g., image cache)               |
        | Weak           | As soon as no strong refs exist    | Listeners, memory-sensitive maps, cleanup |

         */

        /*

        7. SortedMap

            - Child interface of Map
            - If we want to represent a group of key-value pairs according some sorting order of keys
              then we should go for SortedMap
            - Sorting is based on the key but not based on the value

            101 :   A
            103 :   B
            104 :   C
            107 :   D
            125 :   E
            136 :   F

            Is it a sorted map?

            Methods

            firstKey()                  =>      101
            lastKey()                   =>      136
            headMap(107)                =>      { 101=A, 103=B, 104=C }
            tailMap(107)                =>      { 107=D, 125=E, 136=F }
            subMap(103, 125)            =>      { 103=B, 104=C, 107=D }
            comparator()                =>      null

         */

        /*

        8. TreeMap

        - Underlying data structure is Red-Black tree
        - Insertion order is NOT preserved
            - Elements will be added with some sorting order of keys
        - Duplicate keys are NOT allowed
            - Duplicate values can be present
        - 'null' insertion (since v1.7)
            - RE: NPE if DNSO
            - Depending on the implementation of the sorting
        - Heterogeneous
            - if DNSO then Keys should homogenous and Comparable otherwise, RE: CCE
            - if customized sorting (using Comparator) then keys need not be homogenous and comparable
                we can take heterogeneous non-comparable objects also
            - No restrictions values

        Constructors

        TreeMap map = new TreeMap();                  =>          DNSO of keys
        TreeMap map = new TreeMap(Comparator c);      =>          CSO of keys
        TreeMap map = new TreeMap(Map m);             =>          Create a TreeMap for a given map
        TreeMap map = new TreeMap(SortedMap m);       =>          Create a TreeMap for a given sorted map

         */

//        TreeMap m = new TreeMap();
//        m.put(100, "ZZZ");
//        m.put(103, "YYY");
//        m.put(101, "XXX");
//        m.put(104, 106);
//        // m.put("FFF", "XXX");    //  RE: CCE
//        // m.put(null, "XXX");     //  RE: NPE
//        System.out.println(m);

        /*

        Exercise: Create tree map with a descending order of keys

        "XXX": 10
        "AAA": 20
        "ZZZ": 30
        "LLL": 40

         */

        /*

        NavigableMap (I)

            Child interface of SortedMap it defines several methods for navigation purposes

            Methods
                - floorKey(e)           floorEntry(e)
                - lowerKey(e)           lowerEntry(e)
                - ceilingKey(e)         ceilingEntry(e)
                - higherKey(e)          higherEntry(e)
                - pollFirstEntry()
                - pollLastEntry()
                - descendingMap()
         */

        TreeMap<String, String> map = new TreeMap<>();
        map.put("b", "banana");
        map.put("c", "cat");
        map.put("a", "apple");
        map.put("d", "dog");
        map.put("g", "gun");
        System.out.println("map\t\t\t\t\t\t" + map);
        System.out.println("map.ceilingKey(\"c\")\t\t"+map.ceilingKey("c"));
        System.out.println("map.higherKey(\"e\")\t\t"+map.higherKey("e"));
        System.out.println("map.floorKey(\"e\")\t\t"+map.floorKey("e"));
        System.out.println("map.lowerKey(\"e\")\t\t"+map.lowerKey("e"));
        System.out.println("map.pollFirstEntry()\t"+map.pollFirstEntry());
        System.out.println("map.pollLastEntry()\t\t"+map.pollLastEntry());
        System.out.println("map.descendingMap()\t\t"+map.descendingMap());
        System.out.println("map\t\t\t\t\t\t" + map);

    }
}

class TestKey {
    @Override
    public String toString() {
        return "testKey";
    }

    @Override
    public void finalize() {
        System.out.println("finalize method called");
    }
}
