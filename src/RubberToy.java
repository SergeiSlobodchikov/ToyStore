public class RubberToy extends Toy {
    private String material = "резина";

    public RubberToy(String name, int quantity, int weight) {
        super( name, quantity, weight);
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    public String toString() {
        return "ID: " + getId() + ", Название игрушки: " + getName() + ", количество: " + getQuantity() + ", вес " + getWeight() + ", материал: " +this.material;
    }
}