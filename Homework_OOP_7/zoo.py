import classes
import copy

class Zoo():

    all = []
    animal = classes.Wolf("Волк", 85, 70, "Голубые", "Россия", "12.04.2010", True)
    all.append(copy.copy(animal))
    animal = classes.Wolf("Волк", 85, 70, "Зеленые", "Германия", "21.06.2018", False)
    all.append(copy.copy(animal))
    animal = classes.Cat("Кот", 15, 6, "Оранжевые", "Максик", "Британец", "Да", "Голубой","12.12.2015", "Да")
    all.append(copy.copy(animal))
    animal = classes.Dog("Собака", 55, 35, "Зеленые", "Лесси", "Колли", "Бело-рыжий", "Нет", "30.05.2019", "Да")
    all.append(copy.copy(animal))
    animal = classes.Chicken("Курица", 25, 3, "Красные", 0)
    all.append(copy.copy(animal))
    animal = classes.Stork("Аист", 65, 6, "Желтые", 45)
    all.append(copy.copy(animal))