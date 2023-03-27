from ..interfeces.dogTraining import DodTraining
from .home import Home

class Dog(Home, DodTraining):
    def __init__(self, name, height, weight, colorEye, name2, breed, vaccination, color, date, wool):
        self.wool = wool
        super(Dog, self).__init__(name, height, weight, colorEye, name2, breed, vaccination, color, date)

    def animalSay(self):
        print(f"{super().animalSay()} 'Гав-гав'")

    def caressing(self):
        return(super().caressing())
    
    def training(self):
        DodTraining.training(self)

    def __str__(self) -> str:
        return (f"{super().__str__()} Наличие шерсти: {self.wool};")