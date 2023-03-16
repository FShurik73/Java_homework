package Homework_OOP_3.Figures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Homework_OOP_3.Figures.Base.Figure;
import Homework_OOP_3.Figures.Base.Lengthable;
import Homework_OOP_3.Figures.Base.Perimeterable;
import Homework_OOP_3.Figures.Base.Polygon;

public class CollectionFigures <T extends Figure> {
    private List<T> listfig = new ArrayList<T>();
 
    public void add(T obj) {
        this.listfig.add(obj);
    }

    public void delete(int index) {
        this.listfig.remove(index);
    }

    public void showFigures() {
        for (T figure : listfig) {
            System.out.println(figure);
            System.out.println("------");
        }
    }

    public void showAll() {
        for (Figure figure : listfig) {

            System.out.println(figure);
            System.out.printf("Площадь: %.2f\n", figure.area());
            if (figure instanceof Lengthable) {
                System.out.printf("Длина окружности: %.2f\n", ((Lengthable) figure).length());
            }
            if (figure instanceof Perimeterable) {
                System.out.printf("Периметр: %.2f\n", ((Polygon) figure).perimeter());
            }
            System.out.println("------");
        }

    }

    public void sort() {
        Collections.sort(this.listfig);
    }
}
 
 
