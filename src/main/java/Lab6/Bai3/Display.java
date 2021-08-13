
// Nhập mảng 5 sinh viên (mỗi sinh viên gồm họ tên, email, số điện thoại, chứng minh nhân dân).
// Kiểm tra và thông báo lỗi nếu nhập không đúng định dạng email, số điện thoại và CMND.

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
