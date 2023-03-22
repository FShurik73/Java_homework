package Homework_OOP_5.Core.CustomExceptions;

public class BadCsvContentException extends Exception{
    public BadCsvContentException() {
        super("Указан неверный CSV-файл, невозможно загрузить телефонную книгу");
    }
}
