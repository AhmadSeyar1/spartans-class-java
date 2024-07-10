package week_13.day_1.abstraction;

public class Dog1 extends Animal {


    public Dog1(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");

    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking");

    }
}
