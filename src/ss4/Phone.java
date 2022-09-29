package ss4;

import java.util.ArrayList;

public abstract class Phone {
    public int name;
    ArrayList<String> phone;
    public String oldPhone;
    public String newPhone;

    abstract void insertPhone(String name, String phone);

    abstract void removePhone(String name);

    abstract void updatePhone(String name, String oldPhone ,String newPhone);

    abstract void searchPhone(String name);

    abstract void sort();
}
