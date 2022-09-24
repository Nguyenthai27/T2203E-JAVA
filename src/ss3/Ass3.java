package ss3;
 import ss3.KhachHang;

public class Ass3 {
    public static void main(String[] args){
        KhachHangVN a = new KhachHangVN(1,"Nguyen Van An","2022-09-22",520,"Ca Nhan");
        KhachHangNN b = new KhachHangNN(2,"Donal Trump","2022-09-22",612,"US");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());
        KhachHang kh = (KhachHang) new KhachHangVN(2,"Nguyen Van B","2022-09-22",5220,"Ca Nhan");
        System.out.println(kh.thanhTien());
    }

}
