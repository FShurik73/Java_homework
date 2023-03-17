package Homework_OOP_4;

public class Program {
    public static void main(String[] args) {
        // Работаем с цифрами
        final DynamicArray<Integer> intList = new DynamicArray<>();
        intList.add(37); // добавление элемента
        intList.add(47);
        intList.add(2);
        intList.add(27);
        intList.add(55);
        intList.add(13);
        intList.add(51);
        intList.add(42);
        intList.add(12);
        intList.add(12);
        intList.add(87);
        intList.add(88);
        intList.printArray(); // печать масива
        intList.removeIndex(5); // удаление элемента по индексу
        //intList.removeIndex(5);
        intList.printArray();
        intList.removeData(12); // удаление элемента по значению
        intList.removeData(88);
        intList.printArray();
        System.out.println(intList.minData()); // Поиск минимального значения
        System.out.println(intList.maxData()); // Поиск максимального значения
        System.out.println(intList.sumData()); // Сумма элементов массива
        System.out.println(intList.multData()); // Произведение элементов массива
        System.out.println(intList.findInd(87)); // Поиск элемента по индексу (если его нет то возвращает -1)
        System.out.println(intList.findData(874)); // Проверка наличия элемента в массиве. Возвращает true, если элемент
                                                   // в массиве есть, false – нет.
        try {
            intList.SelectionSort();
            System.out.print("Результат:"); // Пузырьковая сортировка
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        DynamicArray<String> stringList = new DynamicArray<>();
        stringList.add("Свитер"); // добавление элемента
        stringList.add("Рубашка");
        stringList.add("Галстук");
        stringList.add("Кокошник");
        stringList.add("Полувер");
        stringList.add("Джинсы");
        stringList.add("Брюки");
        stringList.add("Толстовка");
        stringList.add("Футболка");
        stringList.add("Платье");
        stringList.add("Блузон");
        stringList.add("Костюм");
        stringList.printArray(); // печать
        stringList.removeIndex(1);
        stringList.printArray();


    }
}
