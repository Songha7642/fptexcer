
// Tao lop SinhVienIT va SinhVienBiz ke thua tu lop SinhVienPoly.
// 	SinhVienIT gom cac thuoc tinh diem java, html, css. Ghi de phuong thuc getDiem()
//          de tinh diem cho sinh vien IT theo cong thuc (2*java + html + css)/4
// 	SinhVienBiz gom cac thuoc tinh diem marketing, sales. Ghi de phuong thuc getDiem()
//          de tinh diem cho sinh vien Biz theo cong thuc (2*marketting + sales)/3


package Lab7.Bai3;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String hoTen = in.nextLine();

        System.out.println("Nhap nganh hoc: ");
        String nganh = in.nextLine();

        if (nganh.equals("IT")) {
            System.out.println("Diem java: ");
            double java = in.nextDouble();
            System.out.println("Diem html: ");
            double html = in.nextDouble();

            System.out.println("Diem css: ");
            double css = in.nextDouble();

            SinhVienPoly sv1 = new SinhVienIT(java, html, css, hoTen, nganh);
            sv1.getDiem();
            sv1.getHocLuc();

        } else if (nganh.equals("Biz")) {
            System.out.println("Diem marketing: ");
            double marketing = in.nextDouble();
            System.out.println("Diem sales: ");
            double sales = in.nextDouble();

            SinhVienPoly sv2 = new SinhVienBiz(marketing, sales, hoTen, nganh);
            sv2.getDiem();
            sv2.getHocLuc();
        }
    }
}