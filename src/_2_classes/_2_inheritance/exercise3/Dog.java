package _2_classes._2_inheritance.exercise3;

public class Dog extends Animal implements CanMakeSound {

    public Dog (String name){
        super(name);
    }
    public Dog(){
        super("Dog");
    }
    public void bark(){
        System.out.println(super.name + "barks");
    }

    @Override
    public void createSound() {
        System.out.println(super.name +" can make sound");
    }
}
