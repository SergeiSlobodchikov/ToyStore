
public abstract class Toy {
    private int id;
    private static int count = 0;
    private String name;
    private int quantity;
    private int weight;
    private String material = "Неизвестно";

    public Toy(String name, int quantity, int weight) {
        this.id = ++count;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity() {
        quantity--;
    }

    public abstract String toString();
    public abstract String getMaterial();
}