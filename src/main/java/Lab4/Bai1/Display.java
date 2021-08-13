
//Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2 phương thức là tính thuế nhập khẩu
// (10% giá sản phẩm) và xuất thông tin ra màn hình. Thông tin xuất ra màn hình gồm:
//  	Tên sản phẩm:
//  	Đơn giá:
//  	Giảm giá:
//  	Thuế nhập khẩu:


package Lab4.Bai1;

public class Display {
    public static void main (String []args){
        SanPham sp = new SanPham();
        sp.nhap();
        sp.getThueNhapKhau();
        sp.xuat();
    }
}
