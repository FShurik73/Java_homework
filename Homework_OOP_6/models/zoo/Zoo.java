package Homework_OOP_6.models.zoo;

import java.util.ArrayList;
import java.util.List;

import Homework_OOP_6.models.animals.base.Animal;

public class Zoo {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public Animal getAnimal(int idx) {
        return this.animals.get(idx);
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(int idx) {
        this.animals.remove(idx);
    }

    public boolean isEmpty() {
        return this.getAnimals().size() == 0;
    }
}
