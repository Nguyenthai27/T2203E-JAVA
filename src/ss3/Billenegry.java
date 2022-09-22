package ss3;

public class Billenegry {
    int id;
    String fullname;
    int number;
    String doituong;
    int price;
    int dinhmuc;

    public Billenegry(int id, String fullname, int number, String doituong, int price, int dinhmuc) {
        this.id = id;
        this.fullname = fullname;
        this.number = number;
        this.doituong = doituong;
        this.price = price;
        this.dinhmuc = dinhmuc;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }
}
