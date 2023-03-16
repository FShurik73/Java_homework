package Homework_OOP_3;

import Homework_OOP_3.Figures.Circle;
import Homework_OOP_3.Figures.CollectionFigures;
import Homework_OOP_3.Figures.Rectangle;
import Homework_OOP_3.Figures.Square;
import Homework_OOP_3.Figures.Triangle;
import Homework_OOP_3.Figures.Base.Figure;


public class Program {

    public static void main(String[] args) {

        // Инициализация класса, хранящего фигуры в списке
        CollectionFigures<Figure> listfig = new CollectionFigures<>();

        // Создание фигур
        Figure square = new Square(5.5);
        Figure rectangle = new Rectangle(5.1, 7.3);
        Figure triangle = new Triangle(3.2, 4.4, 5.8);
        Figure circle = new Circle(7.3);
        Figure sq = new Square(3.2);

        // Добавление фигур в список
        listfig.add(square);
        listfig.add(rectangle);
        listfig.add(triangle);
        listfig.add(circle);
        listfig.add(sq);
        

        // Удаление фигуры по индексу
        listfig.delete(4);

        // сортировка по площади фигур
        listfig.sort();

        // Показать все фигуры и их параметры(длины)
        listfig.showFigures();

        // Показать всю информацию о фигурах, включая площадь, периметр/длину
        listfig.showAll();

    }
}
