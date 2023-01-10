package PartIIOOP.Lesson42;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("I'm Eating .........");
    }

    public void makeSound() {
        System.out.println("I'm .........");
    }

    public void sleep() {
        System.out.println("Sleep....zzzzzzzzzzzz");
    }
}
