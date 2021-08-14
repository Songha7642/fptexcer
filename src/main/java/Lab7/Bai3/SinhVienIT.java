package Lab7.Bai3;

public class SinhVienIT extends SinhVienPoly {
    protected double java, htm, css;

    public SinhVienIT(double java, double html, double css, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.java = java;
        this.htm = html;
        this.css = css;
    }
    @Override
    protected double getDiem() {
        return (2*java + htm +css)/4;
    }
}
