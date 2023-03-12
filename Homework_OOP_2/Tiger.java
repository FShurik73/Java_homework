package Homework_OOP_2;

public class Tiger extends WildAnimal{

    protected Tiger(int height, int weight, String colorEye, String habitat, String date_of_finding) {
        super(height, weight, colorEye, habitat, date_of_finding);
    } 

    @Override
    public void animalSound() {
        System.out.println("РРРРР");
    }

    @Override
    public String toString() {
        return String.format("Тигр: %s", super.toString());
        }
    
}
