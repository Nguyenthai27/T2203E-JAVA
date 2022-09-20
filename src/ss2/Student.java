package ss2;

import ss1.Car;

import java.security.PublicKey;
import java.util.Scanner;

public class Student {
    public String name;
    public String telephone;
    public String address;
    public  int age;
    public String[] girlFriends;

    Scanner sc = new Scanner(System.in);

    public Car myCar;

    public Student(){

    }
    public Student(String name, String telephone, String address, int age,Car myCar) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.age = age;
        girlFriends = new String[10];
        this.myCar = myCar;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
