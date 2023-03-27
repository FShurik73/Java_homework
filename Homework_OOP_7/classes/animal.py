from abc import ABC, abstractmethod

class Animal(ABC):
    def __init__(self, name, height, weight, colorEye):
        self.name = name
        self.height = height
        self.weight = weight
        self.colorEye = colorEye

        def __str__(self) -> str:
            return f"{self.name}; Рост: {self.height}; Вес: {self.weight}; Цвет глаз: {self.colorEye};"
        
        @abstractmethod
        def animalSay(self):
            return(f"{self.name} сказал(а): ")


        