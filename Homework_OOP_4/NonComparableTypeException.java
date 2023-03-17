package Homework_OOP_4;

public class NonComparableTypeException extends Exception{
    public NonComparableTypeException(String type) {
        super(String.format("Type %s is not comparable", type));
    }
}
