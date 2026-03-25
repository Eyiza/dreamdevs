package Day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    @Test
    public void polymorphismTest() {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Goat();
        animals[4] = new Lion();
        for (Animal animal : animals) {
            System.out.println("Class is " + animal.getClass().getSimpleName());
            animal.speak();
        }
        Lion simba = (Lion)animals[4];
        simba.move(); // The move

        Animal animal = new Dog(); // Implicit casting
        // Dog dog = (Dog) new Animal(); // Explicit casting
    }

    @Test
    public void dynamicBindingTest() {
        Animal animal = new Dog(); // Type Animal but still retaining the Dog methods that existed in Animal
        animal.speak();
        // animal.say() won't work even though animal is a Dog until it is downcast to Dog
        System.out.println(animal.getClass().getSimpleName()); // Dog
    }

}