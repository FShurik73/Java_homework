package Homework_OOP_2;

public abstract class HomeAnimal extends Animal implements Home {
    private String nickname;
    private String breed;
    private String vaccination;
    private String  coatColor;
    private String dateBirthday;

    protected HomeAnimal(String nickname, String breed, String vaccination, String coatColor, String dateBirthday, int height, int weight, String colorEye) {
        super(height, weight, colorEye);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.dateBirthday = dateBirthday;
    }

    public String getNickame() {
        return this.nickname;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getVaccination() {
        return this.vaccination;
    }

    public String getCoatColor() {
        return this.coatColor;
    }

    public String getDateBirthday() {
        return this.dateBirthday;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s; %s;",
        getNickame(),getBreed(), getVaccination(), getCoatColor(), getDateBirthday(), super.toString());
    }

    @Override
    public abstract void showAffection();

    @Override
    public abstract void animalSound();
}
