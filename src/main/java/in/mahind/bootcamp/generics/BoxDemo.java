package in.mahind.bootcamp.generics;

class Box<B, S> {
    private final B bigItem;
    private final S smallItem;

    Box(B bigItem, S smallItem) {
        this.bigItem = bigItem;
        this.smallItem = smallItem;
    }

    public B getBigItem() {
        return bigItem;
    }

    public S getSmallItem() {
        return smallItem;
    }

    @Override
    public String toString() {
        return "[bigItem=" + bigItem + ", smallItem=" + smallItem + "]";
    }
}

class Item {
    private final int id;
    private final String name;

    Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class BigItem extends Item {
    BigItem(int id, String name) {
        super(id, name);
    }
}

class SmallItem extends Item {
    SmallItem(int id, String name) {
        super(id, name);
    }
}

public class BoxDemo {

    public static void main(String[] args) {
        BigItem bigItem = new BigItem(1, "item 1");
        SmallItem smallItem = new SmallItem(2, "item 2");

        Box<BigItem, SmallItem> box = new Box<>(bigItem, smallItem);
    }
}
