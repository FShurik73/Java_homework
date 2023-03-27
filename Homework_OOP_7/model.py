import copy
import classes
import zoo

def showAll():
    for i in range(len(zoo.Zoo.all)):
        print(f"{i + 1}) {zoo.Zoo.all[i]}") 

def showInfo(num):
    print(f"{num - 1}) {zoo.Zoo.all[num - 1]}")
    if (isinstance(zoo.Zoo.all[num - 1], classes.Home)):
        zoo.Zoo.all[num - 1].caressing()
    if (isinstance(zoo.Zoo.all[num - 1], classes.DogTraining)):
        zoo.Zoo.all[num - 1].training()
    if (isinstance(zoo.Zoo.all[num-1]. classes.BirdFly)):
        zoo.Zoo.all[num - 1].birdFly()

def sayAll():
    for i in range(len(zoo.Zoo.all)):
        zoo.Zoo.all[i].animalSay()

def sayAnimal(num):
    zoo.Zoo.all[num-1].animalSay()

def addAnimal(num):
    match num:
        case 1:
            addCat()
        case 2:
            addTiger()
        case 3:
            addDog()
        case 4:
            addWolf()
        case 5:
            addChicken()
        case 6:
            addStork()

def addCat():
    name = "Кот"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    name2 = input("Кличка: ")
    breed = input("Порода: ")
    vaccination = input("Наличие прививки: ")
    color = input("Цвет: ")
    date = input("Дата рождения: ")
    wool = input("Наличие шерсти: ")
    animal = classes.Cat(name, height, weight, colorEye,
                         name2, breed, vaccination, color, date, wool)
    zoo.Zoo.all.append(copy.copy(animal))

def addTiger():
    name = "Тигр"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    place = input("Среда обитания: ")
    date = input("Дата обнаружения: ")
    animal = classes.Tiger(name, height, weight, colorEye, place, date)
    zoo.Zoo.all.append(copy.copy(animal))

def addDog():
    name = "Собака"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    name2 = input("Кличка: ")
    breed = input("Порода: ")
    vaccination = input("Наличие прививки: ")
    color = input("Цвет: ")
    date = input("Дата рождения: ")
    wool = input("Наличие шерсти: ")
    animal = classes.Dog(name, height, weight, colorEye,
                         name2, breed, vaccination, color, date, wool)
    zoo.Zoo.all.append(copy.copy(animal))

def addWolf():
    name = "Волк"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    place = input("Среда обитания: ")
    date = input("Дата обнаружения: ")
    leader = bool(input("Вожак стаи? True/False: "))
    animal = classes.Wolf(name, height, weight, colorEye, place, date, leader)
    zoo.Zoo.all.append(copy.copy(animal))

def addChicken():
    name = "Курица"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    fly = 0
    animal = classes.Hen(name, height, weight, colorEye, fly)
    zoo.Zoo.all.append(copy.copy(animal))

def addStork():
    name = "Аист"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    fly = int(input("Высота полета: "))
    animal = classes.Stork(name, height, weight, colorEye, fly)
    zoo.Zoo.all.append(copy.copy(animal))

def deleteAnimal(num):
    zoo.Zoo.all.pop(num-1)