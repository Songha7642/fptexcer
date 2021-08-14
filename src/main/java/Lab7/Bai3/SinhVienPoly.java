package Lab7.Bai3;

public abstract class SinhVienPoly {
    protected String hoTen, nganh;

    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    protected abstract double getDiem();

    public void getHocLuc(){
        double diem = getDiem();
        if((diem < 0) && (diem > 10)) System.out.println("XIN HAY NHAP LAI");
        else{
            if(diem < 5) System.out.println("\nYeu");
            else if(diem >= 5 && diem < 6.5) System.out.println("\nTrung Binh");
            else if(diem >= 6.5 && diem < 7.5) System.out.println("\nKha");
            else if(diem >= 7.5 && diem < 9) System.out.println("\nGioi");
            else if(diem <= 10) System.out.println("\nXuat sac");
        }
    }
}
