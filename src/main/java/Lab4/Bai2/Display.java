
// Viet chuong trinh tao ra 2 san pham thong tin duoc nhap tu ban phim
// sau do goi phuong thuc xuat de xuat thong tin 2 doi tuong san pham da tao


package Lab4.Bai2;

public class Display {
    public static void main (String []args){
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
          sp1.nhap();
          sp2.nhap();
          sp1.getThueNhapKhau();
          sp2.getThueNhapKhau();
          sp1.xuat();
        System.out.println();
          sp2.xuat();
    }
}
