package Lab7.Bai3;

public abstract class SinhVienPoly {
    protected String hoTen, nganh;

    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    protected SinhVienPoly() {
    }

    protected abstract double getDiem();

    public void getHocLuc(){
        double diem = getDiem();
        if((diem < 0) && (diem > 10)) System.out.println("XIN HAY NHAP LAI");
        else{
            if(diem < 5) System.out.println("Yeu");
            else if(diem >= 5 && diem < 6.5) System.out.println("Trung Binh");
            else if(diem >= 6.5 && diem < 7.5) System.out.println("Kha");
            else if(diem >= 7.5 && diem < 9) System.out.println("Gioi");
            else if(diem <= 10) System.out.println("Xuat sac");
        }
    }
}
