package ss2;

import java.util.Scanner;

public class Ass2 {
        static Scanner sc = new Scanner(System.in);
        static void nhapTK (Account tk){
            System.out.println("Nhập số tài khoản: ");
            tk.setSoTK(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập tên tài khoản: ");
            tk.setTenTK(sc.nextLine());
            tk.setSoTienTrongTK(50);
        }
    }
