package Lab6.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
        public String name;
        public String email;
        public String soDienThoai;
        public String cmnd;

        ArrayList<SinhVien> list = new ArrayList<>();

        public void nhap() {
            SinhVien x = new SinhVien();
            Scanner in = new Scanner(System.in);
            System.out.print("\n Ho va ten: ");
            x.name = in.nextLine();


            System.out.print("Email: ");
            x.email = in.nextLine();
            String reEmail = "\\w+@\\w+(\\.\\w){1,2}";
            if (!email.matches(reEmail)) {
                System.out.println("Khong dung dang email!");
            }


            System.out.print("So dien thoai: ");
                x.soDienThoai = in.nextLine();
                String reSoDT = "0\\d{9,10}";
                if (!soDienThoai.matches(reSoDT)) {
                    System.out.println("Khong dung dang so dien thoai!");
                }


            System.out.print("Chung minh nhan dan: ");
                x.cmnd = in.nextLine();
                String reCMND = "\\d{12}";
                if (!cmnd.matches(reCMND)) {
                    System.out.println("Khong dung dang chung minh nhan dan!");
                }

            list.add(x);
        }

        public void xuat() {
            System.out.println("\n Danh sach sinh vien: ");
            for(int i = 0; i < 2; i++) {
                SinhVien x = list.get(i);
                System.out.println("\n Ho va ten: " + x.name);
                System.out.println("Email: " + x.email);
                System.out.println("So dien thoai: " + x.soDienThoai);
                System.out.println("CMND: " + x.cmnd);
            }
        }
    }
