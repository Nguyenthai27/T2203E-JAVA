package ss4;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList;

   public PhoneBook(){
       PhoneList = new ArrayList<>();
   }

    @Override
    void insertPhone(String name, String phone) {
        for(PhoneNumber p : PhoneList){
            if(p.getName().equals(name)){
                if(p.getPhone().contains(phone)){
                    System.out.println("Lien lac nay da ton tai");
                    return;
                }
                //co ten nhung chua co so
                p.getPhone().add(phone);
                System.out.println("da them so"+phone+"vao lien lac co san");
                return;
            }
        }
        //neu ma khong co ten
        PhoneNumber pn = new PhoneNumber(name,phone);
        PhoneList.add(pn);
        System.out.println("da them"+name+"vao lien lac");
    }

    @Override
    void removePhone(String name) {
        for(PhoneNumber p : PhoneList){
            if(p.getName().equals(name)){
                PhoneList.remove(p);
            }
        }

    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber p : PhoneList){
            if(p.getName().equals(name)){
                p.getPhone().remove(oldPhone);
                p.getPhone().add(newPhone);
            }
        }
    }

    @Override
    PhoneNumber searchPhone(String name) {
        for(PhoneNumber p : PhoneList){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    void sort() {

    }
}
