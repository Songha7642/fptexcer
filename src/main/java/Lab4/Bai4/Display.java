package Lab4.Bai4;

import Lab4.Bai3.SanPham;

public class Display {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Keo", 2500);
        sp1.getThueNhapKhau();
        sp1.xuat();
System.out.println();
        SanPham sp2 = new SanPham("Banh", 3000, 50);
        sp2.getThueNhapKhau();
        sp2.xuat();

    }
}
