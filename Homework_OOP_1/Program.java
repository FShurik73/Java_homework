package Homework_OOP_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> prod = new ArrayList<>();
        Lemonade ld = new Lemonade("Черноголовка", 115, 2, "Литр", 1);
        Bread bd = new Bread("Бородинский", 42, 4, "Штука", "Ржаная");
        Eggs eg = new Eggs("Синявинские", 99, 2, "Штука", "10 дней", 10);
        Masks ms = new Masks("Медицинская", 18, 5, "Штука", 5);
        ToiletPaper tp = new ToiletPaper("Familia", 283, 2, "Штука", 3);
        Diapers dp = new Diapers("Pampers", 1560, 1, "Штука", 1, "Нет", 2, 3, 8, "Baby-dry");
        Nipple ni = new Nipple("Соска", 20, 3, "Штука", 0, "Нет");
        Milk mk = new Milk("Авида", 87, 2, "Литр", "10 дней", 3.2);
        prod.add(ld);
        prod.add(bd);
        prod.add(eg);
        prod.add(ms);
        prod.add(tp);
        prod.add(dp);
        prod.add(ni);
        prod.add(mk);
        for (Product product : prod) {
            System.out.println(product.toString());
        }
    }
}
    
