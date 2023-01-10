package PartIIOOP.Lesson40a;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Dog");
        d.eat();
        d.bark();

        BabyDog bb = new BabyDog("BabyDog");
        bb.weep();
        bb.eat();
        bb.bark();
    }
}
