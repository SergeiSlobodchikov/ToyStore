public class PlasticToy extends Toy {
    private String material = "пластиковая";

    public PlasticToy(String name, int quantity, int weight) {
        super(name, quantity, weight);
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return "ID: " + getId() + ", Название игрушки: " + getName() + ", количество: " + getQuantity() + ", вес " + getWeight() + ", материал: " +this.material;
    }
}
