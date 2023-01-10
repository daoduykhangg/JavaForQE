package PartIIOOP.Lesson40b;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        dog.eat();
        dog.bark();

        Cat c = new Cat("Cat");
        c.eat();
        c.meow();

        Bird b = new Bird("Bird");
        b.eat();
        b.fly();
    }
}
