package Homework_OOP_6.views;

import java.util.List;

import Homework_OOP_6.models.animals.base.Animal;

public interface AnimalProcesser {

    public void PrintAnimal(Animal animal);

    public void PrintAnimals(List<Animal> animals);

    public void SoundAnimal(Animal animal);

    public void SoundAnimals(List<Animal> animals);

    public void FlyAnimal(Animal animal);

    public void PetAnimal(Animal animal);

    public void TrainAnimal(Animal animal);
}
