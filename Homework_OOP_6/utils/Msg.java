package Homework_OOP_6.utils;

import java.util.Map;
import static java.util.Map.entry;

public class Msg {
    public static final String welcomeMsg = "Добро пожаловать в зоопарк!\n";
    public static final String byeMsg = "Пока!\n";
    public static final String chooseActionsMsg = "Выберите одно из следующих действий:";
    public static final String addAnimalMsg = """
        Вы решили добавить новое животное (посмотрите, какие это могут быть виды)
            1 - Кот
            2 - Собака
            3 - Тигр
            4 - Волк
            5 - Курица
            6 - Аист
            """;

    public static final String askAnimalClassMsg = "Какой у него тип? ";
    public static final String askAnimalHeightMsg = "Какая у него высота?  ";
    public static final String askAnimalWeightMsg = "Какова его масса? ";
    public static final String askAnimalEyeColorMsg = "Какой у него цвет глаз? ";
    public static final String askPetNameMsg = "Как его зовут? ";
    public static final String askPetBreedMsg = "Какая у него порода? ";
    public static final String askPetVaccinationsMsg = "Какие прививки у него есть (через пробел)? ";
    public static final String askPetFurColorMsg = "Какого цвета его шерсть? ";
    public static final String askPetBirthDaterMsg = "Дата его рождения (в формате гггг-мм-дд)? ";
    public static final String askWildAnimalHabitatMsg = "Какая у него среда обитания? ";
    public static final String askWildAnimalFoundDateMsg = "Дата обнаружения (формат гггг-мм-дд)? ";
    public static final String askBirdFeathersColorMsg = "Какой цвет его оперения? ";
    public static final String askBirdFlightAltitudeMsg = "Какая у него высота полета? ";
    public static final String askIsDogTrainedMsg = "Дрессирована ли собака (ответ y / n)? ";
    public static final String askIsWolfLeaderdMsg = "Он лидер волков(ответ y / n)? ";
    public static final String askIsCatWoollyMsg = "Кошка пушистая (ответ y / n)? ";

    public static final String getIndexlMsg = "Введите число: ";
    public static final String getAnimalIDMsg = "Enter animal ID: ";
    public static final String invalidAnimalIDMsg = "Введите идентификатор животного ";
    public static final String incorrectInputMsg = "Это неверный ответ, попробуйте еще раз!";
    public static final String cannotDoItMsg = "Невозможно (неверный идентификатор животного)";

    public static final String animalWasAddedMsg = "Животное было добавлено в зоопарк";
    public static final String animalNotAddedMsg = "Животное не было добавлено в зоопарк";
    public static final String nobodyRemovedMsg = "Из зоопарка никого не удалили (неверный идентификатор животного)";
    public static final String animalWasRemovedMsg = "Животное удалили из зоопарка";

    public static final String nobodyLivesInZooMsg = "В зоопарке пока никого нет";
    public static final String notImplementedMsg = "Он еще не реализован";

    public static final String cannotFlyMsg = "Животное не может летать... Извините";
    public static final String cannotPetMsg = "Животное нельзя гладить... Извините";
    public static final String cannotTrainMsg = "Животное не поддается дрессировке... Извините";

    public static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новое животное в зоопарк"),
            entry(2, "Удалить животное из зоопарка"),
            entry(3, "Распечатать информацию о конкретном животном"),
            entry(4, "Распечатать информацию обо всех животных в зоопарке"),
            entry(5, "Издать звук определенного животного"),
            entry(6, "Издать звуки всех животных в зоопарке"),
            entry(7, "Выпустите полетать"),
            entry(8, "Погладьте животное"),
            entry(9, "Подрессируйте животное"),
            entry(0, "Выйти из зоопарка"));
}
