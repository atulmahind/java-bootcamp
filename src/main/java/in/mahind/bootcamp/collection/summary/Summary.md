# Collections Framework: Summary

## Collection Interface
A Collection represents a group of objects known as its elements.
The `Collection` interface is used to pass around collections of objects where maximum generality is desired.
For example, by convention all general-purpose collection implementations have a constructor that takes a `Collection` argument.
This constructor, known as a _conversion constructor_, initializes the new collection to contain all the elements in the specified collection, whatever the given collection's subinterface or implementation type. In other words, it allows you to _convert_ the collection's type.

## List Interface
A List is an ordered Collection (sometimes called a _sequence_).
Lists may contain duplicate elements.
In addition to the operations inherited from `Collection`, the `List` interface includes operations for the following:

* Positional access — manipulates elements based on their numerical position in the list. This includes methods such as `get`, `set`, `add`, `addAll`, and `remove`.
* Search — searches for a specified object in the list and returns its numerical position. Search methods include `indexOf` and `lastIndexOf`.
* Iteration — extends Iterator semantics to take advantage of the list's sequential nature. The `listIterator` methods provide this behavior.
* Range-view — The `sublist` method performs arbitrary _range operations_ on the list.
The Java platform contains two general-purpose List implementations. ArrayList, which is usually the better-performing implementation, and LinkedList which offers better performance under certain circumstances.

## Set Interface
A Set is a Collection that cannot contain duplicate elements.
It models the mathematical set abstraction.
The `Set` interface contains _only_ methods inherited from `Collection` and adds the restriction that duplicate elements are prohibited.
Set also adds a stronger contract on the behavior of the `equals` and `hashCode` operations, allowing Set instances to be compared meaningfully even if their implementation types differ.
Two Set instances are equal if they contain the same elements.

The Java platform contains three general-purpose Set implementations: `HashSet`, `LinkedHashSet`, and `TreeSet`.
1. **HashSet** stores its elements in a hash table, is the best-performing implementation; however it makes no guarantees concerning the order of iteration.
2. **LinkedHashSet** is implemented as a hash table with a linked list running through it, orders its elements based on the order in which they were inserted into the set (insertion-order). `LinkedHashSet` spares its clients from the unspecified, generally chaotic ordering provided by `HashSet` at a cost that is only slightly higher.
3. **TreeSet** stores its elements in a balanced tree, orders its elements based on their values; it is substantially slower than `HashSet`.


Reference: https://docs.oracle.com/javase/tutorial/collections/intro/index.html
