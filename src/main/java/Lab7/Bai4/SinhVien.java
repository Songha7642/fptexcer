package Lab7.Bai4;

public abstract class SinhVien {
    protected String hoTen, nganh;

    public SinhVien(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    protected abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();

        if(diem < 5) return "Yeu";
        else if(diem >= 5 && diem < 6.5) return "Trung Binh";
        else if(diem >= 6.5 && diem < 7.5) return "Kha";
        else if(diem >= 7.5 && diem < 9)  return "Gioi";
        else return "Xuat sac";
    }
}

