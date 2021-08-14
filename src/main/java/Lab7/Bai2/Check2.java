
// Xay dung lop ChuNhat gom 2 thuoc tinh la rong va dai va cac phuong thuc getChuVi() va getDienTich() de tinh chu vi va dien tich.
// Phuong thuc xuat() se xuat ra man hinh chieu rong, chieu dai, dien tich va chu vi.
//        Xay dung lop Vuong ke thua tu lop ChuNhat va ghi de phuong thuc xuat() de xuat
//        thong tin canh, dien tich va chu vi.
//        Viet chuong trinh nhap 2 hinh chu nhat va mot hinh vuong sau do xuat ra man
//        hinh.

package Lab7.Bai2;

import java.util.Scanner;

public class Check2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap nganh hoc: ");
        String nganh = sc.nextLine();
        System.out.print("Diem thi: ");
        double Diem = sc.nextDouble();

        SinhVienPoly SV = new SinhVienPoly(hoTen,nganh) {
            protected double getDiem() {
                return Diem;
            }
        };
        SV.getHocLuc();
    }
}
