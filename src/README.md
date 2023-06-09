### Класс [`Toy`](https://github.com/SergeiSlobodchikov/ToyStore/blob/main/src/Toy.java) - это абстрактный класс
- который определяет основные свойства игрушки (id, имя, количество, вес, материал) и методы для получения и изменения этих свойств. Этот класс также содержит конструктор, который инициализирует id, имя, количество и вес игрушки, а также устанавливает материал по умолчанию.

### Классы [`SoftToy`](https://github.com/SergeiSlobodchikov/ToyStore/blob/main/src/SoftToy.java), [`RubberToy`](https://github.com/SergeiSlobodchikov/ToyStore/blob/main/src/RubberToy.java) и [`PlasticToy`](https://github.com/SergeiSlobodchikov/ToyStore/blob/main/src/PlasticToy.java)
- это конкретные классы которые наследуются от класса [`Toy`](https://github.com/SergeiSlobodchikov/ToyStore/blob/main/src/Toy.java). Они определяют материал каждой конкретной игрушки, используя метод setMaterial из родительского класса.

### Класс [`ToyStore`](https://github.com/SergeiSlobodchikov/ToyStore/blob/main/src/ToyStore.java)
- это класс, который представляет магазин игрушек. Он содержит список игрушек, методы для добавления и удаления игрушек, а также методы для управления количеством игрушек разных размеров (маленьких, средних и больших). Он также содержит метод для записи информации об игрушке в файл и метод для увеличения количества игрушек в магазине.

### Класс [`DrawToy`](https://github.com/SergeiSlobodchikov/ToyStore/blob/main/src/DrawToy.java)
- это класс, который представляет жеребьевку игрушек. Он принимает список игрушек и выбирает одну из них случайным образом с учетом веса и материала игрушки.
### Класс [`Menu`](https://github.com/SergeiSlobodchikov/ToyStore/blob/main/src/Menu.java)
- представляет консольное меню для управления объектом ToyStore, представляющим собой магазин, в котором разыгрываются игрушки. В меню представлены следующие опции:
    1. Добавьте новую игрушку в розыгрыш призов магазина.
    2. Измените вес категорий игрушек для розыгрыша призов.
    3. Начните розыгрыш призов, чтобы выиграть игрушку.
    4. Распечатайте список всех игрушек в магазине.
    5. Увеличьте количество игрушек в магазине.
    6. Выйдите из меню.