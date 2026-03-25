package Day6;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("I am barking");
    }

    public void say() {
        System.out.println("I'm alive");
    }
}
