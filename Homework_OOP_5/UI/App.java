package Homework_OOP_5.UI;

import java.util.Scanner;

import Homework_OOP_5.Core.DB.ExternalContactsCSV;
import Homework_OOP_5.Core.DB.ExternalData;
import Homework_OOP_5.Core.MVP.Model;
import Homework_OOP_5.Core.MVP.Presenter;
import Homework_OOP_5.Core.MVP.View;
import Homework_OOP_5.Core.Models.PhoneBook;
import Homework_OOP_5.Core.Models.PhoneBookMap;

public class App {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBookMap();
        ExternalData db = new ExternalContactsCSV(phoneBook, "db.csv");
        Model model = new Model(phoneBook, db);
        View view = new ConsoleUI(scan);
        Presenter presenter = new Presenter(model, view);

        presenter.load();
        presenter.mainMenu();
        presenter.save();

        scan.close();
    }
}
