package _2_classes._2_inheritance.exercise1;

public class Person {
    protected String name;
    protected String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString(){
        return (" " + this.name + this.address);

    }

}
