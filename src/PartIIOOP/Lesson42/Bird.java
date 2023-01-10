package PartIIOOP.Lesson42;

public class Bird extends Animal {
    public Bird() {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating bugs");
    }

    @Override
    public void makeSound() {
        System.out.println("Líu lo");
    }
}
