package Lab6.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
        public String name;
        public String email;
        public String soDienThoai;
        public String cmnd;
        public boolean check = false;

        ArrayList<SinhVien> list = new ArrayList<>();

        public void nhap() {
            SinhVien x = new SinhVien();
            Scanner in = new Scanner(System.in);
            System.out.print("\n Ho va ten: ");
            x.name = in.nextLine();

            System.out.print("Email: ");
            do {
                x.email = in.nextLine();
                String reEmail = "\\w+@\\w+\\.\\w+";
                if (!email.matches(reEmail)) {
                    System.out.println("Khong dung dang email!");
                }
                else {check=true;}
            }
            while (check==false);

            do {
                x.soDienThoai = in.nextLine();
                String reSoDT = "0\\d{9,10}";
                if (!soDienThoai.matches(reSoDT)) {
                    System.out.println("Khong dung dang so dien thoai!");
                }
                else {check=true;}
            }
            while (check==false);

            do {
                x.cmnd = in.nextLine();
                String reCMND = "\\d{12}";
                if (!cmnd.matches(reCMND)) {
                    System.out.println("Khong dung dang chung minh nhan dan!");
                }
                else {check=true;}
            }
            while (check==false);

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
