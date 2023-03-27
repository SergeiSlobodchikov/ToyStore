import java.util.Scanner;

public class Menu {
    public static void menu() {
        ToyStore store = new ToyStore();
        Scanner scanner = new Scanner(System.in);
        // добавляем игрушки в магазин
        Toy toy1 = new RubberToy(1, "Мяч", 10, 20);
        Toy toy2 = new RubberToy(2, "Кукла", 10, 40);
        Toy toy3 = new PlasticToy(3, "Конструктор замок", 10, 50);
        Toy toy4 = new SoftToy(4, "Мишка", 10, 71);
        Toy toy5 = new SoftToy(5, "Малый мишка", 10, 20);
        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить игрушку в розыгрыш");
            System.out.println("2. Изменить вес вероятности выигрыша");
            System.out.println("3. Начать розыгрыш");
            System.out.println("4. Показать список всех игрушек");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ перевода строки

            if (choice == 1) {
                addNewToy(store, scanner);
            } else if (choice == 2) {
                changeToyWeights(store, scanner);
            } else if (choice == 3) {
                startToyDraw(store);
            } else if (choice == 4) {
                printAllToys(store);
            } else if (choice == 5) {
                break;
            }

        }
        scanner.close();
    }

    public static void addNewToy(ToyStore store, Scanner scanner) {
        System.out.println("Выберите тип игрушки (1 - пластиковая, 2 - резиновая, 3 - мягкая):");
        int toyType = scanner.nextInt();
        scanner.nextLine(); // Считываем символ перевода строки

        System.out.println("Введите id, название, количество и вес игрушки:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Считываем символ перевода строки
        String name = scanner.nextLine();
        int quantity = scanner.nextInt();
        int weight = scanner.nextInt();

        switch (toyType) {
            case 1:
                store.addToy(new PlasticToy(id, name, quantity, weight));
                break;
            case 2:
                store.addToy(new RubberToy(id, name, quantity, weight));
                break;
            case 3:
                store.addToy(new SoftToy(id, name, quantity, weight));
                break;
            default:
                System.out.println("Выбран некорректный тип игрушки.");
                break;
        }
    }


    public static void changeToyWeights(ToyStore store, Scanner scanner) {
        System.out.printf("Изменение веса вероятности выигрыша игрушек сейчас\n" +
                          " Маленькие игрушки 65 %% вес до: %s\n" +
                          " Средние игрушки  35 %% вес до: %s\n" +
                          " Большие игрушки  10 %% вес до: %s\n" +
                          " Супер большие 1 %% \nВес маленьких: ", store.getSmallToys(), store.getMediumToys(), store.getBigToys());
        int small = scanner.nextInt();
        store.setSmallToys(small);
        scanner.nextLine(); // Считываем символ перевода строки
        System.out.print("Вес средних: ");
        int medium = scanner.nextInt();
        store.setMediumToys(medium);
        System.out.print("Вес больших: ");
        int big = scanner.nextInt();
        store.setBigToys(big);
    }

    public static void startToyDraw(ToyStore store) {
        Toy toy = store.drawToy();
        if (toy != null) {
            System.out.println("Вы выиграли игрушку " + toy.getName());
            store.saveToyToFile(toy, "src/prizes.txt");
        } else {
            System.out.println("К сожалению, призовые игрушки закончились");
        }
    }

    public static void printAllToys(ToyStore store) {
        System.out.println("Список всех игрушек:");
        for (Toy toy : store.getToys()) {
            System.out.println(toy.toString());
        }
    }
}
