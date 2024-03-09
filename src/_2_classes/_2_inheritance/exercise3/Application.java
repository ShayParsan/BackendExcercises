package _2_classes._2_inheritance.exercise3;


interface CanMakeSound {
    void createSound();
    
}
public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
        
        Cat garfield = new Cat("Garfield");
        garfield.meow();

    }
}
