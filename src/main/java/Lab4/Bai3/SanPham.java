package Lab4.Bai3;

public class SanPham {
    public String name;
    public double donGia;
    public double giamGia;
    private double thuenhapkhau;

    public SanPham(String name,double donGia, double giamGia){
        this.name = name;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String name,double donGia) {
        this(name,donGia,0);
    }

    public void xuat(){
        System.out.printf("\n Ten san pham: %s",name);
        System.out.printf("\n Don gia: %.2f",donGia);
        System.out.printf("\n Giam gia: %.2f",giamGia);
        System.out.printf("\n Thue nhap khau: %.2f",getThueNhapKhau());
    }
    public double getThueNhapKhau(){
        return thuenhapkhau=0.1*donGia;
    }

}

