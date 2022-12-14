package ss3;

public class KhachHang {
    int id;
    String fullName;
    String date;
    int quantity;

    public KhachHang(int id, String fullName, String date, int quantity) {
        this.id = id;
        this.fullName = fullName;
        this.date = date;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int thanhTien(){
        return quantity*2000;
    }
}
