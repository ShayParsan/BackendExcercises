package _2_classes._1_introduction_to_classes.exercise8;

public class Application {

    public static void main(String[] args) {
        Person p2 = new Person("Tom", null, null, null);
        Person p1 = new Person("Tom", null, null, p2);
        p2.sibling(p1);
        System.out.println(p2.isSiblingOf(p1));


    }
}
