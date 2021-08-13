
// Nâng cấp lớp SanPham bằng cách khai báo các trường dữ liệu với đặc tả truy xuất là private
// để hạn chế truy xuất trực tiếp đến các trường này sau đó bổ sung các phương thức getter và setter
// để đọc ghi dữ liệu các trường.

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
