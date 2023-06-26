//  Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

package Exception_HW1;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] firstArray = getFilledArray(10);
        int[] secondArray = getFilledArray(9);
        int[] divArray = divArrays(firstArray, secondArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(divArray));
    }

    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Длинны масивов не равны!");
        int[] resultArray = new int[firstArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = firstArray[i] - secondArray[i];
        }
        return resultArray;
    }

    public static int[] getFilledArray(int length) {
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(20);
        }
        return array;
    }
}
