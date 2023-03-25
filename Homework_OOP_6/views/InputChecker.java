package Homework_OOP_6.views;

import java.util.Date;
import java.util.List;

public interface InputChecker {

    public int getInt(String message);

    public double getDouble(String message);

    public String getString(String message);

    public boolean getBoolean(String message);

    public Date getDate(String message);

    public List<String> getListString(String message);
}