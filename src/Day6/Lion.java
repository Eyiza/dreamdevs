package Day6;

public class Lion extends Animal implements Moveable {
    @Override
    public void speak() {
        System.out.println("Roar!");
    }

    public void move() {
        System.out.println("I am walking!");
    }
}
