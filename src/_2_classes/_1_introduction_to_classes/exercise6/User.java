package _2_classes._1_introduction_to_classes.exercise6;

public class User  {
    private String firstname;
    private String lastname;
    private int age;
    private String street;
    private String Municipality;
    private int HouseNo;
    private int Postalcode;

   
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

    public void Address(String street, int HouseNo, String Municipality,int Postalcode){
        this.street = street;
        this.HouseNo = HouseNo;
        this.Municipality = Municipality;
        this.Postalcode = Postalcode;

        
    }

    @Override
    public String toString() {
        return "User is " + this.firstname + this.lastname + " and age is " +age + " and address is " + 
        this.street +
        this.HouseNo +
        this.Municipality +
        this.Postalcode;
    }
}
