import java.util.Scanner;

public class Menu {
    public static void menu() {
        ToyStore store = new ToyStore();
        Scanner scanner = new Scanner(System.in);
        // добавляем игрушки в магазин
        Toy toy1 = new Toy(1, "Мяч", 10, 70);
        Toy toy2 = new Toy(2, "Кукла", 5, 90);
        Toy toy3 = new Toy(3, "Конструктор", 15, 20);
        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);

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
                System.out.println("Введите id, название, количество и вес игрушки:");
                int id = scanner.nextInt();
                scanner.nextLine(); // Считываем символ перевода строки
                String name = scanner.nextLine();
                int quantity = scanner.nextInt();
                int weight = scanner.nextInt();
                store.addToy(new Toy(id, name, quantity, weight));
            } else if (choice == 2) {
                System.out.printf("Изменение веса вероятности выигрыша игрушек сейчас\n" +
                                  " Маленькие игрушки 60 %% вес до: %s\n" +
                                  " Средние игрушки  25 %% вес до: %s\n" +
                                  " Большие игрушки  10 %% вес до: %s\n" +
                                  " Супер большие 5 %% \nВес маленьких: ", store.getSmallToys(), store.getMediumToys(), store.getBigToys());
                int small = scanner.nextInt();
                store.setSmallToys(small);
                scanner.nextLine(); // Считываем символ перевода строки
                System.out.print("Вес средних: ");
                int medium = scanner.nextInt();
                store.setMediumToys(medium);
                System.out.print("Вес больших: ");
                int big = scanner.nextInt();
                store.setBigToys(big);
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
