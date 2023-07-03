package Exception_HW2;
/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {
       public static void main(String[] args) {
        try{
            String input = emptyString();
            System.out.println("Вы ввели строку: " + input );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String emptyString() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые сроки вводить нельзя");
        }
        return input;
    }
}
