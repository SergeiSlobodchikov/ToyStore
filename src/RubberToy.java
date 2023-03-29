public class RubberToy extends Toy {
    private String material = "резина";

    public RubberToy(int id, String name, int quantity, int weight) {
        super(id, name, quantity, weight);
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    public String toString() {
        return "ID: " + getId() + ", Название игрушки: " + getName() + ", количество: " + getQuantity() + ", вес " + getWeight() + ", материал: " +this.material;
    }
}