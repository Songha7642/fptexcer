package Lab7.Bai4;

import Lab7.Bai3.SinhVienPoly;

public class SinhVienBiz extends SinhVien {
    protected double marketing, sales;

    public SinhVienBiz(double marketing, double sales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.marketing = marketing;
        this.sales = sales;
    }
    @Override
    protected double getDiem() {
        return (2*marketing + sales)/3;
    }
}
