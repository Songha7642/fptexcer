package Lab1;

import java.util.Scanner;

public class Lab1_Bai1 {
    public static void main (String[] args){
        String HovaTen;
        double diem;
           Scanner sc = new Scanner(System.in);
             HovaTen = sc.nextLine();
             diem = sc.nextDouble();
        System.out.printf("%s %f ",HovaTen,diem);
    }
}

