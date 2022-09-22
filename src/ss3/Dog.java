package ss3;

public class Dog extends Animal {
    public int year;

    public Dog(){
    }



    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }




    public void run(){
        System.out.println("Dog run");
        super.run();
        this.name = "abc";
    }
    public void eat(){
        System.out.println("Eat...");
    }
}
