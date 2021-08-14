package Lab7.Bai3;

public class SinhVienBiz extends SinhVienPoly {
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
