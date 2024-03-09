package _2_classes._1_introduction_to_classes.exercise8;

public class Person {

    private String name;
    private Person mother;
    private Person father;
    private Person sibling;
    private Person grandparent;

    public Person(String name) {
        this.name = name;
        
    }
   
    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    public Person(String name, Person mother, Person father, Person sibling) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.sibling = sibling;
    }

    public boolean isSiblingOf(Person person) {
        if ((this.sibling).equals(person)){
            return true;
        } else{
        // Return "true" if this object is the sibling of the person given as a parameter
        return false;
        }
    }

    public Person sibling(Person sibling){
        return this.sibling = sibling;
    }

    public Person grandparent(Person grandparent){
        return this.grandparent = grandparent;
    }

    public boolean isGrandparentOf(Person person) {
        if ((this.grandparent).equals(person)){
            return true;
        } else{
        return false;
        }
    }

    public boolean isGrandchildOf(Person person) {
        // Return "true" if this object is the grandchild of the person given as a parameter
        return false;
    }

    public boolean isAncestorOf(Person person) {
        // Return "true" if this object is an ancestor of the person given as a parameter
        return false;
    }

    public boolean isDescendantOf(Person person) {
        // Return "true" if this object is a descendant of the person given as a parameter
        return false;
    }
}
