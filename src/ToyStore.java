import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;
    private DrawToy drawToy = new DrawToy();
    public ToyStore() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }
    public Toy drawToy() {
        return drawToy.drawToy(toys);
    }

    public int getSmallToys() {
        return drawToy.getSmallToys();
    }

    public int getMediumToys() {
        return drawToy.getMediumToys();
    }
    public int getBigToys() {
        return drawToy.getBigToys();
    }

    public void setSmallToys(int small) {
        drawToy.setSmallToys(small);
    }

    public void setMediumToys(int medium) {
        drawToy.setMediumToys(medium);
    }
    public void setBigToys(int big) {
        drawToy.setBigToys(big);
    }

    // код для записи игрушки в файл
    public void saveToyToFile(Toy toy, String filename) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write(toy.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void increaseToyQuantity(int toyId, int quantityToAdd) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setQuantity(toy.getQuantity() + quantityToAdd);
                return;
            }
        }
        System.out.println("Игрушка с ID " + toyId + " не найдена в магазине.");
    }
}