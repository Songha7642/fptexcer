
// Nhap mang 5 sinh vien (moi sinh vien gom ho ten, email, so dien thoai, chung minh nhan dan).
// Kiem tra va thong bao loi neu nhap khong dung dinh dang email, so dien thoai va CMND.

package Lab6.Bai3;


public class Display {
    public static void main(String[] args) {
        SinhVien x = new SinhVien();

        for (int i = 0; i < 2; i++) {
            x.nhap();
        }
        x.xuat();
    }
}
