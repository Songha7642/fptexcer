package Lab7.Bai4;

import Lab7.Bai3.SinhVienPoly;

import java.util.ArrayList;

public class SinhVienBiz extends SinhVien {
    protected double marketing, sales;

    public SinhVienBiz(double marketing, double sales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    protected double getDiem() {
        return (2 * marketing + sales) / 3;
    }

    protected void xuatThongTin() {
            SinhVienBiz sinhVien = new SinhVienBiz(marketing, sales, hoTen, nganh);
            System.out.println("ho va ten: " + sinhVien.hoTen + "\tnganh: " + sinhVien.nganh + "\tdiem marketing: " + sinhVien.marketing + "\tdiem sales: " + sinhVien.sales +  "\tdiem trung binh: " + sinhVien.getDiem());

    }
}