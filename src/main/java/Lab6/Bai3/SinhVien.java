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
            System.out.print("\n\nHo va ten: ");
            x.name = in.nextLine();


            System.out.print("Email: ");
            x.email = in.nextLine();
            String reEmail = "\\w+@\\w+\\.\\w+";
            while (!x.email.matches(reEmail)) {
                System.out.println("Khong dung dang email!" + "\nXin hay nhap lai");
                System.out.print("Email: ");
                x.email = in.nextLine();
            }


            System.out.print("So dien thoai: ");
                x.soDienThoai = in.nextLine();
                String reSoDT = "0\\d{9,10}";
                while (!x.soDienThoai.matches(reSoDT)) {
                    System.out.println("Khong dung dang so dien thoai!" + "\nXin hay nhap lai");
                    System.out.print("So dien thoai: ");
                    x.soDienThoai = in.nextLine();
                }


            System.out.print("Chung minh nhan dan: ");
                x.cmnd = in.nextLine();
                String reCMND = "\\d{12}";
                while (!x.cmnd.matches(reCMND)) {
                    System.out.println("Khong dung dang chung minh nhan dan!" + "\nXin hay nhap lai");
                    System.out.print("Chung minh nhan dan: ");
                    x.cmnd = in.nextLine();
                }

            list.add(x);
        }

        public void xuat() {
            System.out.println("\nDanh sach sinh vien: ");
            for(int i = 0; i < 2; i++) {
                SinhVien x = list.get(i);
                System.out.println("\nHo va ten: " + x.name);
                System.out.println("Email: " + x.email);
                System.out.println("So dien thoai: " + x.soDienThoai);
                System.out.println("CMND: " + x.cmnd);
            }
        }
    }
