package PartIIOOP.Lesson42;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating mouse");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }
}
