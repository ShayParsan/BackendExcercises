package _2_classes._2_inheritance.exercise3;

public class Cat extends Animal implements CanMakeSound{
    public Cat (String name){
        super(name);
    }
    public Cat(){
        super("Cat");
    }
    public void meow(){
        System.out.println(super.name + "Meow");
    }
    @Override
    public void createSound() {
        System.out.println(super.name +" can make sound");
    }
}
