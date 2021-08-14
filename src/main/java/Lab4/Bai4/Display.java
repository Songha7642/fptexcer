
// Nang cap lop SanPham bang cach khai bao cac truong du lieu voi dac ta truy xuat la private
// de han che truy xuat truc tiep den cac truong nay sau do bo sung cac phuong thuc getter va setter
// de doc ghi du lieu cac truong.

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
