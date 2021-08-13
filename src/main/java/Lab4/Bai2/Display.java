
// Viết chương trình tạo ra 2 sản phẩm thông tin được nhập từ bàn phím
// sau đó gọi phương thức xuất để xuất thông tin 2 đối tượng sản phẩm đã tạo


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
