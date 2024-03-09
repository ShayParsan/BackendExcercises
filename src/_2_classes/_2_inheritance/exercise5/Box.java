package _2_classes._2_inheritance.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Box {
     private List <Packable> items;
    private double maxWeight;
    private double totalWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        
    }
    public void add(Packable item) {
        if (totalWeight + item.weight() <= maxWeight && items.size() < 3) {
            items.add(item);
            totalWeight += item.weight();

            System.out.println("Added " + item.toString() + " to the box.");
        } else {
            System.out.println("Failed to add " + item.toString() + " to the box.");
        }
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Box contents:\n");
        for (Packable item : items) {
            result.append("- ").append(item.toString()).append("\n");
        }
        result.append("Total weight: ").append(totalWeight).append(" kg\n");
        return result.toString();
    }
}



