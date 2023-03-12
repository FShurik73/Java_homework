package Homework_OOP_2;

public class Wolf extends WildAnimal{
    private final String leader;

    protected Wolf(int height, int weight, String colorEye, String habitat, String date_of_finding, String leader) {
        super(height, weight, colorEye, habitat, date_of_finding);
        this.leader = leader;
    }

    public String getLeader() {
        return this.leader;
    }
    
    @Override
    public void animalSound() {
        System.out.println(" УУУУУУУУУ");
    }
    @Override
    public String toString() {
        return String.format("Волк: %s; Вожак стаи: %s", super.toString(), getLeader());
    }
}

