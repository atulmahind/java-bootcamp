package in.mahind.bootcamp;

abstract class World {

    abstract void sayHello();
}

class Earth extends World {

    @Override
    void sayHello() {
        System.out.println("Hello Earth!");
    }
}

class Mars extends World {

    @Override
    void sayHello() {
        System.out.println("Hello Mars!");
    }
}

class SpaceTravel {

    World from;
    World to;
}


public class HelloWorld {

    public static void main(String[] args) {

        World world = new Earth();
        world.sayHello();
    }

}
