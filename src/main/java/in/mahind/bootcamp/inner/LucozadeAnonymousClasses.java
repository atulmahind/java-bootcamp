package in.mahind.bootcamp.inner;

class Lucozade {
    public void taste() {
        System.out.println("Sweet");
    }
    public void printLabel() {
        System.out.println("Generic Label Design");
    }
}

public class LucozadeAnonymousClasses {

    public static void main(String[] args) {

        Lucozade generic = new Lucozade();
        generic.taste();

        Lucozade pink = new Lucozade() {
            public void taste() {
                System.out.println("Pink");
            }
        };
        pink.taste();
        pink.printLabel();

        Lucozade blue = new Lucozade() {
            public void taste() {
                System.out.println("Blue");
            }
        };
        blue.taste();
        blue.printLabel();

        if (blue instanceof Lucozade) {
            System.out.println("Blue Lucozade!!");
        }

//        System.out.println(generic.getClass().getName());
//        System.out.println(pink.getClass().getName());
//        System.out.println(blue.getClass().getName());
    }
}


