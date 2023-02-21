package Homework3;

public class Task3 {
    public static int[] sortArray(int[] arrayA) { // сортировка массива который передается в функцию
        if (arrayA == null) { // проверяем, что массив не пустой
            return null;
        }
        if (arrayA.length < 2) { // проверяем , что в массиве не 1 элемент
            return arrayA;
        }
        int[] arrayB = new int[arrayA.length / 2]; // копируем левую часть от начала до середины
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        // копируем правую часть от середины до конца массива, вычитаем из длины превую часть
        int[] arrayC = new int[arrayA.length - arrayB.length]; 
        System.arraycopy(arrayA, arrayB.length, arrayC, 0, arrayA.length - arrayB.length);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        //  пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        mergeArray(arrayA, arrayB, arrayC); // далее опять рекурсия возврата слияния двух отсортированных массивов
        return arrayA;
    }
}
