package Homework2;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Task2 {
    public static double power(int a, int b) throws IOException {
        if (b == 0) {
            return 1;}
        if (b < 0) {
            return power(1 / a, -b);}
        if (b % 2 != 0) {
            return a * power(a, b - 1); }
        return power(a * a, b / 2);
    }
}
