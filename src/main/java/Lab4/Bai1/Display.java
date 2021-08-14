
//Tao lop SanPham gom 3 thuoc tinh la ten, gia va giam gia. Lop cung gom 2 phuong thuc la tinh thue nhap khau
// (10% gia san pham) va xuat thong tin ra man hinh. Thong tin xuat ra man hinh gom:
//  	Ten san pham:
//  	Don gia:
//  	Giam gia:
//  	Thue nhap khau:


package Lab4.Bai1;

public class Display {
    public static void main (String []args){
        SanPham sp = new SanPham();
        sp.nhap();
        sp.getThueNhapKhau();
        sp.xuat();
    }
}
