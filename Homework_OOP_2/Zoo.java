package Homework_OOP_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static ArrayList<Animal> zooAnimal = new ArrayList<>();
    {
        zooAnimal.add(new Cat("Афоня", "Британец", "Да", "Голубой", "15.02.2008", 32, 7, "Оранжевые", "Да"));
        zooAnimal.add(new Tiger(110, 140, "Голубые", "Россия", "21.03.2021"));
        zooAnimal.add(new Dog("Альма", "Колли", "Нет", "Рыже-белый", "13.04.2016", 52, 27,"Карие", "Да"));
        zooAnimal.add(new Wolf(69, 48, "Зеленые", "Россия", "23.09.2019", "Да"));
        zooAnimal.add(new Chicken(30, 2, "Темно-красные", 1));
        zooAnimal.add(new Stork(75, 8, "Желтые", 150));
    
    }

    public int size() {
        return zooAnimal.size();
    }


    public void addCat(Scanner input) {
        String nickname; String breed; String vaccination; String coatColor; String dateBirthday; 
        int height; int weight; String colorEye; String wool;

        System.out.print("Имя: ");
        nickname = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccination = input.next();
        System.out.print("Введите цвет: ");
        coatColor = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();
        Zoo.zooAnimal.add(new Cat(nickname, breed, vaccination, coatColor, dateBirthday, height, weight, colorEye, wool));
    }

    public void addDog(Scanner input) {
        String nickname; String breed; String vaccination; String coatColor; String dateBirthday; 
        int height; int weight; String colorEye; String training;

        System.out.print("Имя: ");
        nickname = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccination = input.next();
        System.out.print("Введите цвет: ");
        coatColor = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие дресировки: ");
        training = input.next();

        Zoo.zooAnimal.add(new Dog(nickname, breed, vaccination, coatColor, dateBirthday, height, weight, colorEye, training));
    }

    public void addTiger(Scanner input) {
        int height; int weight; String colorEye; String habitat; String date_of_finding;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        date_of_finding = input.next();

        Zoo.zooAnimal.add(new Tiger(height, weight, colorEye, habitat, date_of_finding));
    }

    public void addWolf(Scanner input) {
        int height; int weight; String colorEye; String habitat; String date_of_finding; String leader;
    
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        date_of_finding = input.next();
        System.out.print("Вожак стаи?: ");
        leader = input.next();

        Zoo.zooAnimal.add(new Wolf(height, weight, colorEye, habitat, date_of_finding, leader));
    }

    public void addChicken(Scanner input) {
        int height; int weight; String colorEye; int hightFly;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();
        Zoo.zooAnimal.add(new Chicken(height, weight, colorEye, hightFly));
    }

    public void addStork(Scanner input) {
        int height; int weight; String colorEye; int hightFly;
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();
        Zoo.zooAnimal.add(new Stork(height, weight, colorEye, hightFly));
    }
      
    void showAll() {
        int index = 0;
        for (Animal animal : zooAnimal) {
            System.out.println();
            System.out.printf("%d) ", index);
            System.out.println(animal);
            System.out.println("-------------");
            index++;
        }
    }

    void removeAnimal(int num) {
        zooAnimal.remove(num);
    }

    void showAnimal(int num) {
        System.out.println(zooAnimal.get(num));
        if (zooAnimal.get(num) instanceof Home) {
            ((Home)zooAnimal.get(num)).showAffection();
        }
        if (zooAnimal.get(num) instanceof BirdFly) {
            ((BirdFly)zooAnimal.get(num)).toFly();
        }
    }

    void animalSound(int num) {
        zooAnimal.get(num).animalSound();
    }

    void soundAllAnimals() {
        for (Animal animal : zooAnimal) {
            animal.animalSound();
        }
    }
}
