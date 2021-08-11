package Lab4.Bai2;

public class Display {
    public static void main (String []args){
        SanPham sp1 = new SanPham();
          sp1.nhap();
          sp1.getThueNhapKhau();
          sp1.xuat();
        System.out.println();
        SanPham sp2 = new SanPham();
          sp2.nhap();
          sp2.getThueNhapKhau();
          sp2.xuat();
    }
}
