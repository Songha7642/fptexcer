package Lab7.Bai2;

public abstract class SinhVienPoly {
    protected String hoTen, nganh;
    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    protected abstract double getDiem();
    public void getHocLuc(){
        if((getDiem()<0) && (getDiem()>10)) System.out.println("XIN HAY NHAP LAI");
        else{
            if(getDiem()<5) System.out.println("Yeu");
            else if(getDiem()>=5&&getDiem()<6.5) System.out.println("Trung Binh");
            else if(getDiem()>=6.5&&getDiem()<7.5) System.out.println("Kha");
            else if(getDiem()>=7.5&&getDiem()<9) System.out.println("Gioi");
            else if(getDiem()<=10) System.out.println("Xuat sac");
        }
    }
}
