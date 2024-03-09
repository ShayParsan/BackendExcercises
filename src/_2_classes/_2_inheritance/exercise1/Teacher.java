package _2_classes._2_inheritance.exercise1;

public class Teacher extends Person {
    private int salary;


    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

   

    @Override
    public String toString() {
        return this.name + "\n" + this.address + "\n" + "salary " + salary + " euro/month";
    }


}

