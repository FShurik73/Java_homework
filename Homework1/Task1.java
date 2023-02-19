package Homework1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = scanner.nextInt();
        scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }
    
    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    
    } 
}
