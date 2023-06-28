package Exeption_HW2;

import java.util.Scanner;

// 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
// (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//  вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task1 {
    public static void main(String[] args) {
        float num = numFloat();
        System.out.println("Вы ввели число: " + num);
    }

    public static float numFloat() {
        final Scanner sc = new Scanner(System.in);
        float res;
        while (true) {
            System.out.println("Введите дробное число (тип float): ");
            String input = sc.nextLine();
            try {
                res = Float.parseFloat(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные. Введите снова");
            }
        }
        return res;
    }
}
