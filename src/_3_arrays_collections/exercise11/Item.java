package _3_arrays_collections.exercise11;

public class Item {
    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return quantity * unitPrice;
    }

    public void increaseQuantity() {
        quantity++;
    }

    @Override
    public String toString() {
        return product + ": " + quantity;
    }
}

