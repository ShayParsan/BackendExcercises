package _2_classes._1_introduction_to_classes.exercise5;

public class User  {
    private String firstname;
    private String lastname;
    private int age;
   
     public User ( String firstname , String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        
    } 
    public User ( String firstname , String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = 0;
        
    } 

    public int age(){
        return this.age + 1;
    }
    
    public int age (int number){
        return this.age * number;

    }

    @Override
    public String toString() {
        return "User is " + this.firstname + this.lastname + " and age is " +age;
    }
}
