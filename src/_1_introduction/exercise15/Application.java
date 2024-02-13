package _1_introduction.exercise15;

public class Application {

    public static void main(String[] args) {
        printStars(5);
        printSquare(5);
        printRectangle(2,3);

    }

    public static void printStars(int n){
        if (n<=0){
            throw new IllegalArgumentException("needs to be one or more");
        } else{
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void printSquare(int n){
        if (n<=0){
            throw new IllegalArgumentException("needs to be one or more");
        } else {
            for(int k = 0; k < n; k++){
               printStars(n);
            }
        }

    }

    public static void printRectangle(int height, int width){
        if ( height <= 0 || width <=0){
            throw new IllegalArgumentException("Cannot be zero");
        }
        else {
            for (int i = 0; i < height; i ++){
                printStars(width);
            }
        }
    }
}
