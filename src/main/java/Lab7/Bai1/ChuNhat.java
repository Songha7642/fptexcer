package Lab7.Bai1;

import java.util.Scanner;

public class ChuNhat {
    double rong;
    double dai;
    public ChuNhat(double rong, double dai){
        this.rong = rong;
        this.dai = dai;
    }
    double getChuVi(){
        return (dai+rong)*2;
    }
    double getDienTich(){
        return dai*rong;
    }
    void xuat(){
        System.out.println("Chu vi: "+ getChuVi());
        System.out.println("Dien tich: "+ getDienTich());
    }
}
