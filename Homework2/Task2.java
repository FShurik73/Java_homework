package Homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {
        int[] array = file_Read();
        int a = array[0];
        int b = array[1];
        System.out.println(a);
        System.out.println(b);
        //System.out.println(res);
        if (a == 0 && b == 0) 
            fileWrite("не определено");
        else if(b < 0) fileWrite(negativPow(a, b)); // Вычисляем и записываем в случае отрицательной степени
        else fileWrite(positivPow(a, b)); // Вычисляем и записываем в случае положительной степени
    }

    public static int[] file_Read() throws IOException { // метод чтения из файла
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        int[] intArray = new int[2];
        String[] s = line.split(" ");
        if (line.contains("a")) {
            intArray[0] = Integer.parseInt(s[1]);
            s = sc.nextLine().split(" ");
            intArray[1] = Integer.parseInt(s[1]);
        } else {
            intArray[1] = Integer.parseInt(s[1]);
            s = sc.nextLine().split(" ");
            intArray[0] = Integer.parseInt(s[1]);
        }
        sc.close();
        return intArray;
    }

     // Вычисление положительной степени
     public static String positivPow(int a, int b) {
        int temp = 1;
        String result = "";
        for(int i = 0; i < b; i++){
            temp *= a;
        }
        result = String.valueOf(temp);
        return result;
    }

      // Вычисление отрицательной степени
      public static String negativPow(int a, int b) {
        double temp = 1;
        String result = "";
        for(int i = 0; i < b * -1; i++){
            temp *= a; 
        }
        result = String.valueOf(1/temp);
        return result;
    }

    public static void fileWrite(String string) throws FileNotFoundException {
        File file = new File("output.txt"); // метод записи в файл
        PrintWriter pw = new PrintWriter(file);
        pw.println(string);
        pw.close();
    }
}
