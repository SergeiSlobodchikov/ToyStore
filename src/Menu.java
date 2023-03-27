import java.util.Scanner;

public class Menu {
    public static void menu() {
        ToyStore store = new ToyStore();
        Scanner scanner = new Scanner(System.in);

        // добавляем игрушки в магазин
        Toy toy1 = new Toy(1, "Мяч", 10, 50);
        Toy toy2 = new Toy(2, "Кукла", 5, 30);
        Toy toy3 = new Toy(3, "Конструктор", 15, 20);
        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить игрушку в розыгрыш");
            System.out.println("2. Изменить вес игрушки");
            System.out.println("3. Начать розыгрыш");
            System.out.println("4. Показать список всех игрушек");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ перевода строки

            if (choice == 1) {
                System.out.println("Введите id, название, количество и вес игрушки:");
                int id = scanner.nextInt();
                scanner.nextLine(); // Считываем символ перевода строки
                String name = scanner.nextLine();
                int quantity = scanner.nextInt();
                int weight = scanner.nextInt();
                store.addToy(new Toy(id, name, quantity, weight));
            } else if (choice == 2) {
                System.out.println("Введите id игрушки и новый вес:");
                int id = scanner.nextInt();
                int weight = scanner.nextInt();
                store.setToyWeight(id, weight);
            } else if (choice == 3) {
                Toy toy = store.drawToy();
                if (toy != null) {
                    System.out.println("Вы выиграли игрушку " + toy.getName());
                    store.saveToyToFile(toy, "src/prizes.txt");
                } else {
                    System.out.println("К сожалению, призовые игрушки закончились");
                }
            } else if (choice == 4) {
                System.out.println("Список всех игрушек:");
                for (Toy toy : store.getToys()) {
                    System.out.println(toy.toString());
                }
            } else if (choice == 5) {
                break;
            }

        }
        scanner.close();
    }
}
