
//CHUA XONG
// Viet chuong trinh quan ly sinh vien:
//1.	Nhap danh sach sinh vien
//2.	Xuat thong tin danh sach sinh vien
//3.	Xuat danh sach sinh vien co hoc luc gioi
//4.	Sap xep danh sach sinh vien theo diem
//5.	Ket thuc

package Lab7.Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Check {
    public static void main (String[] args){
        menu();
    }

    public static void menu() {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = in.nextInt();

        ArrayList<SinhVien> list = new ArrayList<>();

        for (int i = 0; i < soLuong; i++) {

            in.nextLine();
            System.out.print("\nNhap loai sinh vien: ");
            String loaiSV = in.nextLine();
            if (loaiSV.equals("IT")) {

                System.out.print("Nhap ho va ten: ");
                String hoTen = in.nextLine();

                System.out.print("Nhap diem java: ");
                double java = in.nextDouble();

                System.out.print("Nhap diem html: ");
                double html = in.nextDouble();

                System.out.print("Nhap diem css: ");
                double css = in.nextDouble();

                SinhVien s1 = new SinhVienIT(java, html, css, hoTen, "IT");
                list.add(s1);

            } else {
                System.out.print("Nhap ho va ten: ");
                String hoTen = in.nextLine();

                System.out.print("Nhap diem marketing: ");
                double marketing = in.nextDouble();

                System.out.print("Nhap diem sales: ");
                double sales = in.nextDouble();

                SinhVien s2 = new SinhVienBiz(marketing, sales, hoTen, "Biz");
                list.add(s2);
            }
        }

        System.out.println("\n\tDanh sach sinh vien");
        xuatDanhSach(list);

        System.out.println("\n\tSinh co hoc luc gioi");
        xuatHocLucGioi(list);

        System.out.println("\n\tSinh vien duoc sap xep giam dan");
        xepDanhSach(list);
    }


    public static void xuatDanhSach (ArrayList<SinhVien> list) {
        for (int i=0; i<list.size(); i++) {
            SinhVien sinhVien = list.get(i);
           sinhVien.xuatThongTin();
        }
    }

    public static void xuatHocLucGioi (ArrayList<SinhVien> list) {
        for (int i = 0; i<list.size(); i++) {
            SinhVien sinhVien = list.get(i);
            String hocluc = sinhVien.getHocLuc();
            if (hocluc.equals("Gioi")) {
                System.out.println("Ho va ten: " + sinhVien.hoTen + "\tNganh: " + sinhVien.nganh);
            }
        }
    }


    public  static void xepDanhSach (ArrayList<SinhVien> list) {
        for (int i = 0; i<list.size(); i++) {
            for (int j=i+1; j<list.size(); j++) {
                double diem1 = list.get(i).getDiem();
                double diem2 = list.get(j).getDiem();

                 if (diem1 < diem2) {
                     SinhVien temp = list.get(i);
                     list.set(i, list.get(j));
                     list.set(j, temp);
                 }
            }
        }
        xuatDanhSach(list);
    }


}

