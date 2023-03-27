import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawToy {
    public Toy drawToy(List<Toy> toys) {
        List<Toy> eligibleToys = new ArrayList<>();
        int totalWeight = 0;
        for (Toy toy : toys) {
            if (toy.getQuantity() > 0) {
                eligibleToys.add(toy);
                totalWeight += getToyWeight(toy);
            }
        }

        if (eligibleToys.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int weight = random.nextInt(totalWeight) + 1;
        int accumulatedWeight = 0;
        Toy selectedToy = null;

        for (Toy toy : eligibleToys) {
            int toyWeight = getToyWeight(toy);
            accumulatedWeight += toyWeight;
            if (accumulatedWeight >= weight) {
                selectedToy = toy;
                break;
            }
        }

        if (selectedToy != null) {
            selectedToy.decreaseQuantity();
        }

        return selectedToy;
    }

    private int smallToys = 30;
    private int mediumToys = 50;
    private int bigToys = 70;

    private int getToyWeight(Toy toy) {
        int weight = toy.getWeight();
        if (weight <= smallToys) {
            return 60;
        } else if (weight <= mediumToys) {
            return 25;
        } else if (weight <= bigToys) {
            return 10;
        } else {
            return 5;
        }
    }

    public void setSmallToys(int smallToys) {
        this.smallToys = smallToys;
    }

    public void setMediumToys(int mediumToys) {
        this.mediumToys = mediumToys;
    }

    public void setBigToys(int bigToys) {
        this.bigToys = bigToys;
    }

    public int getSmallToys() {
        return smallToys;
    }

    public int getMediumToys() {
        return mediumToys;
    }

    public int getBigToys() {
        return bigToys;
    }
}
