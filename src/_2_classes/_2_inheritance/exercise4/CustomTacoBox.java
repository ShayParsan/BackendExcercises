package _2_classes._2_inheritance.exercise4;
class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int initialTacos) {
        this.tacos = initialTacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos > 0) {
            tacos--;
            System.out.println("Enjoy your taco!");
        } else {
            System.out.println("No tacos left in the box.");
        }
    }
}
