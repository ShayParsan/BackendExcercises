package _2_classes._1_introduction_to_classes.exercise6;

public class Application {

    public static void main(String[] args) {
        User user1 = new User("Max", "Field", 27);
        User user2 = new User("Brandy","Blue");
        user1.Address("Jb-v", 127, "Leuven", 3000);
        System.out.print(user1);
        System.out.println(user2);

    }
}
