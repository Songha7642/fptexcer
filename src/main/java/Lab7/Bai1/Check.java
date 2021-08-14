
// Xay dung lop ChuNhat gom 2 thuoc tinh la rong va dai va cac phuong thuc getChuVi() va getDienTich() de tinh chu vi va dien tich.
// Phuong thuc xuat() se xuat ra man hinh chieu rong, chieu dai, dien tich va chu vi.
//        Xay dung lop Vuong ke thua tu lop ChuNhat va ghi de phuong thuc xuat() de xuat
//        thong tin canh, dien tich va chu vi.
//        Viet chuong trinh nhap 2 hinh chu nhat va mot hinh vuong sau do xuat ra man
//        hinh.

package Lab7.Bai1;

public class Check {
    public static void main(String[] args) {
        double dai = 20, rong = 10, canh = 15;
        ChuNhat ABCD = new ChuNhat(dai,rong);
        Vuong abcd = new Vuong(canh);
        ABCD.xuat();
        abcd.xuat();
    }
}
