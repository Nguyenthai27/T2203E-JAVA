package ss3;

public class KhachHangNN extends KhachHang{
    public String quocTich;
    public KhachHangNN(int id, String fullName, String date, int quantity, String quocTich) {
        super(id, fullName, date, quantity);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public int thanhTien(int gia) {
        return super.thanhTien(gia);
    }
}
