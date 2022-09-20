package ss1;

import java.util.Scanner;

public class Ass1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo f1 = new PhanSo();
        f1.setTuSo(sc.nextInt());
        f1.setMauSo(sc.nextInt());
        f1.inPhanSo();

        PhanSo f2 = new PhanSo();
        f2.setTuSo(sc.nextInt());
        f2.setMauSo(sc.nextInt());
        f2.inPhanSo();

        PhanSo t = f1.mul(f2);
        t.inPhanSo();
        t.rutGon();
    }
}
