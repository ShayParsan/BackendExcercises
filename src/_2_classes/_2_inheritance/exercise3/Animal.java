package _2_classes._2_inheritance.exercise3;

public class Animal {
    String name ;
    public Animal (String name){
        this.name = name;
    }
    public void sleep(){
        System.out.println(this.name + "sleeps");

    }
    public void eat(){
        System.out.println(this.name + "eats");

    }
    public String getName(){
        return this.name;
    }
}
