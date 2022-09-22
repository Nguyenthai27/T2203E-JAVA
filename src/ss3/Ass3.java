package ss3;

public class Ass3 {
    public static void main(String[] args){
        KhachHangVN a = new KhachHangVN(1,"Nguyen Van An","2022-09-22",520,"Ca Nhan");
        KhachHangNN b = new KhachHangNN(2,"Donal Trump","2022-09-22",612,"US");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());
    }
}
