// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package Exception_HW1;

public class Task1 {
    public static void main(String[] args) {
        String[] sArray = {"family", null, "name"};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        division(10, 0);
        printValueByIndex(array, 13);
        printStringfArray(sArray);
    }

    // деление на ноль
    public static void division(double firstNum, double secondNum) {
        if (secondNum == 0) throw new ArithmeticException("На ноль делить нельзя!");
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }

    // индекс за пределами массива
    public static void printValueByIndex(int[] array, int index) {
        if (index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
    }

    // исключение нулевого указателя
    public static void printStringfArray(String[] sArray) {
        for (String item: sArray){
            if (item == null) throw new NullPointerException("Элемент отсутствует!");
            System.out.println((item));
        }
    }
}
