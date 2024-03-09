package _2_classes._2_inheritance.exercise5;

public class Application {

    public static void main(String[] args) {
        Box box = new Box(3);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 0.9));
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        
        System.out.println(box);

    }
}
