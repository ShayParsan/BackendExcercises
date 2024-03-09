package _2_classes._1_introduction_to_classes.exercise4;

public class Flat {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Flat(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean largerThan(Flat toCompare){
        if (this.squareMeters > toCompare.squareMeters){
            return true;
        } else {
            return false;
        }
    }
    
        public int priceDifference(Flat toCompare){
            int PriceDiff = Math.abs(this.pricePerSquareMeter - toCompare.pricePerSquareMeter);
            return PriceDiff;

        }


}
