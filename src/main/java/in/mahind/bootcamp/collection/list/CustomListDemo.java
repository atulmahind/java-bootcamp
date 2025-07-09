package in.mahind.bootcamp.collection.list;

import java.util.List;

public class CustomListDemo {
    public static void main(String[] args) {

        CustomList list = new CustomList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        for (int value : list) {
//            System.out.println(value);
//        }

        for (List<Integer> pair : list) {
            System.out.println(pair);
        }
    }
}
