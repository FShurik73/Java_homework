from ..animal import Animal

class Wild(Animal):
    def __init__(self, name, height, weight, colorEye, place, date):
        self.place = place
        self.date = date
        super(Wild, self).__init__(name, height, weight, colorEye)