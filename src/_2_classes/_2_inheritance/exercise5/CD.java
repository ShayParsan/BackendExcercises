package _2_classes._2_inheritance.exercise5;

public class CD implements Packable{

    private int publicationyear;
    private String nameCD;
    private String artist;
    private double weight = 0.1;

    public CD(String artist, String nameCD, int publicationyear) {

        this.artist = artist;
        this.nameCD = nameCD;
        this.publicationyear = publicationyear;
        
    }

    @Override
    public double weight() {
        return this.weight;
    }
    @Override
    public String toString(){
        return this.artist + this.nameCD + "("+this.publicationyear+")";
    }
    
}
