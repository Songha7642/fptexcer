package Lab7.Bai1;

public class ChuNhat {
    protected double dai;
    protected double rong;

    public ChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }

    public ChuNhat() {
    }

    public double getChuVi(){
        return (dai+rong)*2;
    }
    public double getDienTich(){
        return dai*rong;
    }
    public void xuat(){
        System.out.println("Chu vi = "+ getChuVi());
        System.out.println("Dien tich = "+ getDienTich());
    }
}
