package in.mahind.bootcamp.collection.set;

import java.util.Comparator;

public class DescendingOrderComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2) {
            return 1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }

//        return      i1.compareTo(i2);     //      DNSO (Ascending order)
//        return     -i1.compareTo(i2);     //      Descending order
//        return      i2.compareTo(i1);     //      Descending order
//        return     -i2.compareTo(i1);     //      DNSO (Ascending order)
//        return      1;                    //      Insertion order
//        return     -1;                    //      Reverse of the insertion order
//        return      0;                    //      Only first element will get inserted and the remaining elements
//                                          //      will be considered as duplicates
    }
}
