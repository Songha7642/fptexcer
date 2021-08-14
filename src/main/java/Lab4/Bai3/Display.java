
// Nang cap lop SanPham bang cach bo sung public cho cac dat ta truy xuat cho phuong thuc xuat()
//    va private cho getThueThuNhap(). Dong thoi bo sung 2 ham tao,ham tao thu nhat
//    gom 3 tham so la ten, gia va giam gia, ham tao thu 2 gom 2 tham so la ten va gia (ngam hieu khong giam gia).
// Viet chuong trinh tao 2 san pham co giam gia va khong giam gia sau do xuat thong tin 2 san pham ra man hinh

package Lab4.Bai3;

public class Display {

    public static void main (String []args){
        SanPham sp1 = new SanPham("Keo",2500);
        sp1.getThueNhapKhau();
        sp1.xuat();
        System.out.println();
        SanPham sp2 = new SanPham("Banh",3000,50);
        sp2.getThueNhapKhau();
        sp2.xuat();

    }
}
