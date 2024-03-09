package _3_arrays_collections.exercise11;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
        } else {
            Item newItem = new Item(product, 1, price);
            items.put(product, newItem);
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : items.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}

