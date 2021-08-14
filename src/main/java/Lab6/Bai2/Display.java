
// Nhap vao mang 5 san pham (moi san pham gom ten, gia va hang).
// Xuat thong tin cac san pham co hang la Nokia.

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


