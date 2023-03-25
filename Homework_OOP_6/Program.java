package Homework_OOP_6;

import java.util.Scanner;

import Homework_OOP_6.models.zoo.Zoo;
import Homework_OOP_6.presenters.Presenter;
import Homework_OOP_6.views.ConsoleView;
import Homework_OOP_6.views.View;
    
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Zoo javaZoo = new Zoo();
        View view = new ConsoleView(scan);
        Presenter presenter = new Presenter(view, javaZoo);
        presenter.Run();
        scan.close();
    }
}
