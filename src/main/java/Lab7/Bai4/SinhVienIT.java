package Lab7.Bai4;

import Lab7.Bai3.SinhVienPoly;

import java.util.ArrayList;

public class SinhVienIT extends SinhVien {
    protected double java, html, css;

    public SinhVienIT(double java, double html, double css, String hoTen, String nganh) {
        super(hoTen, nganh);

        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    protected double getDiem() {
        return (2 * java + html + css) / 4;
    }

    protected void xuatThongTin() {
        SinhVienIT sinhVien = new SinhVienIT(java, html, css, hoTen, nganh);
            System.out.println("ho va ten: " + sinhVien.hoTen + "\tnganh: " + sinhVien.nganh + "\tdiem java: " + sinhVien.java + "\tdiem html: " + sinhVien.html + "\tdiem css: " + sinhVien.css + "\tdiem trung binh: " + sinhVien.getDiem());
    }
}
