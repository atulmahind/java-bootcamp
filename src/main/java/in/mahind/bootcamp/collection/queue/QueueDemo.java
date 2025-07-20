package in.mahind.bootcamp.collection.queue;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        /*

        Queue (I)

        To represent a group of objects prior to processing

        Methods

            offer(obj)      add(obj)        =>      add an element into the queue
            poll()          remove()        =>      return and remove the head element
            peek()          element()       =>      return the head element

         */

        /*

        PriorityQueue

            - to represent a group of individual objects prior to processing according to some priority
            - Default Natural Sorting Order
              Customized Sorting Order
            - insertion order not preserved -> elements are added as per some priority
            - duplicates are NOT allowed
            - if DNSO   then objects are homogenous and Comparable      => otherwise RE: CCE
              if CSO    then objects need not be homogenous and Comparable
            - 'null' insertion not possible even as a first element

            Constructors

                PriorityQueue queue = new PriorityQueue();        // initial capacity 11
                                                                  // DNSO

                PriorityQueue queue = new PriorityQueue(int initialCapacity);

                PriorityQueue queue = new PriorityQueue(int initialCapacity, Comparator c);

                PriorityQueue queue = new PriorityQueue(SortedSet s);

                PriorityQueue queue = new PriorityQueue(Collection c);
         */


        PriorityQueue q = new PriorityQueue();
//         System.out.println(q.peek());       // null
//         System.out.println(q.remove());     // RE: NSEE

        for (int i = 0; i < 10; i++) {
            q.offer(i);
        }
//
        System.out.println(q);              // [0, 1, ... , 9]
        System.out.println(q.poll());       // 0
        System.out.println(q);              // ???
                                            // Some platforms won't provide proper support for PriorityQueues
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

    }
}
