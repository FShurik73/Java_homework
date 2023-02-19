package Homework2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static double power(int a, int b) throws IOException {  //метод возведения числа в степень
        if (b == 0) {
            return 1;}
        if (b < 0) {
            return power(1 / a, -b);}
        if (b % 2 != 0) {
            return a * power(a, b - 1); }
        return power(a * a, b / 2);
    }

    public static int[] fileRead() throws IOException {  //метод чтения из файла
        Scanner scanner = new Scanner(new File("input.txt"));
        String line = scanner.nextLine();
        int[]intArray = new int[2];
        String[]s = line.split(" ");
        if (s[0] == "a") {
            intArray[0] = Integer.parseInt(s[1]);
            s = scanner.nextLine().split(" ");
            intArray[1] = Integer.parseInt(s[1]);
        }
        else{
            intArray[1] = Integer.parseInt(s[1]);
            s = scanner.nextLine().split(" ");
            intArray[0] = Integer.parseInt(s[1]);
        }
        scanner.close();
        return intArray;  
    }

    public static void fileWrite(String string) throws FileNotFoundException {
        File file = new File("output.txt");  // метод записи в файл
        PrintWriter pw = new PrintWriter(file); 
        pw.println(string); 
        pw.close(); 
    }

    public static void main(String[] args) throws IOException {
        
    }

}
