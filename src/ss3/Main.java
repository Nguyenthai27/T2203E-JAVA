package ss3;

import ss2.Account;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        a.run();
        Dog d = new Dog();
        d.run();
        d.eat();
        BullDog bd = new BullDog();
        bd.run();
    }


    public static void main2(String[] args){
        int[] intarrays = new int[5];
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Hello World");
        arrayList.add(new Account());

        ArrayList<String> strArray = new ArrayList<>();

        strArray.add("Hello");
        strArray.add("World");

        for(String s : strArray ){
            System.out.println(s);
        }
        for(int i=0; i<=strArray.size(); i++){
            //same like top
        }
    }
}
