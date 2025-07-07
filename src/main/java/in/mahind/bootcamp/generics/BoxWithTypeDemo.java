package in.mahind.bootcamp.generics;

class Box1<T> {
    T bigItem;
    T smallItem;
    public Box1(T bigItem, T smallItem) {
        this.bigItem = bigItem;
        this.smallItem = smallItem;
    }
    public static boolean isCompatible(Item1 item1, Item1 item2) {
        return item1.getType()!=item2.getType();
    }
}

enum ItemType { BIG, SMALL}

class Item1 {
    private ItemType type;
    public Item1(ItemType type) {
        this.type = type;
    }

    public ItemType getType() {
        return type;
    }
}

public class BoxWithTypeDemo {

    public static void main(String[] args) {
        Item1 item1 = new Item1(ItemType.BIG);
        Item1 item2 = new Item1(ItemType.SMALL);

        Box1<Item1> box1;

        if (Box1.isCompatible(item1, item2)) {
            box1 = new Box1<>(item1, item2);
        }
    }

}
