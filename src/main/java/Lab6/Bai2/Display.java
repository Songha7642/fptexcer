
// Nhập vào mảng 5 sản phẩm (mỗi sản phẩm gồm tên, giá và hãng).
// Xuất thông tin các sản phẩm có hãng là Nokia.

package Lab6.Bai2;

public class Display {

    public static void main(String[] args) {
        SanPham x = new SanPham();

        for (int i = 0; i < 5; i++) {
            x.nhap();
        }
         x.xuat();
    }
}


