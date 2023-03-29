public class SoftToy extends Toy {
    private String material = "мягкая";

    public SoftToy(int id, String name, int quantity, int weight) {
        super(id, name, quantity, weight);

    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return "ID: " + getId() + ", Название игрушки: " + getName() + ", количество: " + getQuantity() + ", вес " + getWeight() + ", материал: " +this.material;
    }
}