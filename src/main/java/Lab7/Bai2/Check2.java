package Lab7.Bai2;

import java.util.Scanner;

public class Check2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap nganh hoc: ");
        String nganh = sc.nextLine();
        System.out.print("Diem thi: ");
        double Diem = sc.nextDouble();
        SinhVienPoly SV = new SinhVienPoly(hoTen,nganh) {
            protected double getDiem() {
                return Diem;
            }
        };
        SV.getHocLuc();
    }
}
