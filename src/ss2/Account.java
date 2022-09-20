package ss2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
        int soTK;
        String tenTK;
        double soTienTrongTK;

        Scanner sc = new Scanner(System.in);

        public Account() {
        }

        public Account(int soTK, String tenTK, double soTienTrongTK) {
                this.soTK = soTK;
                this.tenTK = tenTK;
                this.soTienTrongTK = soTienTrongTK;
        }

        public long getSoTK() {
                return this.soTK;
        }

        public void setSoTK(int soTK) {
                this.soTK = soTK;
        }

        public String getTenTK() {
                return this.tenTK;
        }

        public void setTenTK(String tenTK) {
                this.tenTK = tenTK;
        }

        public double getSoTienTrongTK() {
                return this.soTienTrongTK;
        }

        public void setSoTienTrongTK(double soTienTrongTK) {
                this.soTienTrongTK = soTienTrongTK;
        }

        public String toString() {
                NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
                String str1 = currencyEN.format(soTienTrongTK);
                return soTK + "-" + tenTK + "-" + str1;
        }

        public double napTien() {
                double nap;
                System.out.print("Nhập số tiền bạn cần nạp: ");
                nap = sc.nextDouble();
                if (nap >= 0) {
                        soTienTrongTK = nap + soTienTrongTK;
                        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
                        String str1 = currencyEN.format(nap);
                        System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
                } else {
                        System.out.println("Số tiền nạp vào không hợp lệ!");
                }
                return nap;
        }
        public double thanhToan() {
                double thanhToan;
                System.out.print("Nhập số tiền bạn cần thanh toán: ");
                thanhToan = sc.nextDouble();
                if (thanhToan <= (soTienTrongTK)) {
                        soTienTrongTK = soTienTrongTK - thanhToan;
                        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
                        String str1 = currencyEN.format(thanhToan);
                        System.out.println("Bạn vừa thanh toán " + str1 + "Đã từ tài khoản.");
                } else {
                        System.out.println("Số tiền muốn rút không hợp lệ!");
                        return thanhToan();
                }
                return thanhToan;
        }
}
