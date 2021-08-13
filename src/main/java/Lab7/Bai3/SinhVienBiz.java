package Lab7.Bai3;

public class SinhVienBiz extends SinhVienPoly {
    protected double marketing, sales;
    public SinhVienBiz(double marketing, double sales){
        this.marketing = marketing;
        this.sales = sales;
    }
    protected double getDiem() {
        return (2*marketing + sales)/3;
    }
}
