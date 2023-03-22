package Homework_OOP_5.UI;

import java.util.Map;
import static java.util.Map.entry;

public class Msg {
    static final String welcomeMsg = "Добро пожаловать в программу телефонной книги!\n";
    static final String byeMsg = "\nПока!";

    static final String chooseActionsMsg = "Выберите одно из действий: ";
    static final String invalidCmdMsg = "Неверная команда, попробуйте еще раз";

    static final String getCommandMsg = "Введите команду: ";
    static final String getNameMsg = "Введите имя: ";
    static final String getEmailMsg = "Введите e-mail: ";
    static final String getPhoneNumberMsg = "Введите номер телефона: ";
    static final String invalidEmailMsg = "Ошибка e-mail";
    static final String invalidPhoneNumberMsg = "Ошибка номера телефона";
    static final String successAddMsg = "Контакт добавлен в телефонную книгу";
    static final String successEditMsg = "Контакт успешно отредактирован";
    static final String successRemovedMsg = "Контакт успешно удален";
    static final String ContactFoundMsg = "Найден следующий контакт";
    static final String noContactFoundMsg = "Контакт не найден";

    static final String showAllContactsMsg = "Были найдены следующие контакты: ";
    static final String editContactMsg = "Для редактирования заполните следующие поля: ";
    static final String askAddContactMsg = "Контакт с данным именем не найден. Добавить новый (y/n): ";

    static final String getSearchStrMsg = "Введите имя для поиска: ";
    static final String notDigitMsg = "Это не цифра, попробуйте еще раз!";
    static final String removeContacMsg = "Следующий контакт будет удален: ";
    static final String askRemoveContactMsg = "Вы уверены? (y/n): ";

    static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новый контакт"),
            entry(2, "Изменить существующий контакт в коллекции"),
            entry(3, "Удалить контакт из коллекции"),
            entry(4, "Показать все контакты"),
            entry(5, "Показать подробную информацию о контакте"),
            entry(0, "Выйти из программы"));

    static final Map<Integer, String> mainMenuEntriesMsg = Map.ofEntries(
            entry(1, "Вы добавили ноовый контакт."),
            entry(2, "Вы изменяете контакт."),
            entry(3, "ВЫ удаляете контакт."),
            entry(4, "Печать всей контактной информации: "),
            entry(5, "Печать подробной инфомации контакта."),
            entry(0, "Пока!"));
}
