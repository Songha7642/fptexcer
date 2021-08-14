
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

        System.out.println("Nhap so luong sinh vien: ");
        int soLuong = in.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();

        for (int i = 0; i < soLuong; i++) {

            in.nextLine();
            System.out.println("Nhap loai sinh vien: ");
            String loaiSV = in.nextLine();
            if (loaiSV.equals("IT")) {

                System.out.println("Nhap ho va ten: ");
                String hoTen = in.nextLine();

                System.out.println("Nhap diem java: ");
                double java = in.nextDouble();

                System.out.println("Nhap diem html: ");
                double html = in.nextDouble();

                System.out.println("Nhap diem css: ");
                double css = in.nextDouble();

                SinhVien s1 = new SinhVienIT(java, html, css, hoTen, "IT");
                list.add(s1);

            } else {
                System.out.println("Nhap ho va ten: ");
                String hoTen = in.nextLine();

                System.out.println("Nhap diem marketing: ");
                double marketing = in.nextDouble();

                System.out.println("Nhap diem sales: ");
                double sales = in.nextDouble();

                SinhVien s2 = new SinhVienBiz(marketing, sales, hoTen, "Biz");
                list.add(s2);
            }
        }

        System.out.println("danh sach sinh vien");
        xuatDanhSach(list);

        System.out.println("\nsinh co hoc luc gioi");
        xuatHocLucGioi(list);

        System.out.println("\nsinh vien duoc sap xep giam dan");
        xepDanhSach(list);
    }


    public static void xuatDanhSach (ArrayList<SinhVien> list) {
        for (int i=0; i<list.size(); i++) {
            SinhVien sinhVien = list.get(i);
            if (sinhVien.nganh.equals("IT")) {
                SinhVienIT sIt = (SinhVienIT) sinhVien;
                System.out.println("ho va ten: " + sIt.hoTen + "\tnganh: " + sIt.nganh + "\tdiem java: " + sIt.java + "\tdiem html: " + sIt.html + "\tdiem css: " + sIt.css + "\tdiem trung binh: " + sIt.getDiem());
            }
            else {
                SinhVienBiz sBiz = (SinhVienBiz) sinhVien;
                System.out.println("ho va ten: " + sBiz.hoTen + "\tnganh: " + sBiz.nganh + "\tdiem java: " + sBiz.marketing + "\tdiem html: " + sBiz.sales + "\tdiem trung binh: " + sBiz.getDiem());
            }
        }
    }


    public static void xuatHocLucGioi (ArrayList<SinhVien> list) {
        for (int i = 0; i<list.size(); i++) {
            SinhVien sinhVien = list.get(i);
            String hocluc = sinhVien.getHocLuc();
            if (hocluc.equals("Gioi")) {
                System.out.println("ho va ten: " + sinhVien.hoTen + "\tnganh: " + sinhVien.nganh);
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

