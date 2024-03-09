package _2_classes._2_inheritance.exercise1;

public class Student extends Person {
    public int credits;
    public boolean study;

    public Student(String name, String address) {
        super(name, address);
    }


    public boolean study(){
        return this.study = true;
        
    }

    public int credits(){
        this.credits +=1;
        return this.credits;

    }

    @Override
    public String toString() {
        return this.name + "\n" + this.address + "\nStudy credits " + this.credits();
    }
    
}
