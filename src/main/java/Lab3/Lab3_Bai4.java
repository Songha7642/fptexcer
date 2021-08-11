package Lab3;

import java.util.Scanner;

public class Lab3_Bai4 {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so hoc sinh: ");
        int n = in.nextInt();
        String[] HovaTen = new String[n];
        double[] Diem = new double[n];
        in.nextLine();
        System.out.println("Nhap ten hoc sinh: ");
           for(int i=0;i<n;i++) {
               HovaTen[i] = in.nextLine();
           }

        System.out.println("Nhap diem cua hoc sinh: ");
           for (int i=0;i<n;i++) {
            Diem[i] = in.nextDouble();
           }

           for (int i = 0;i<n;i++) {
               if (Diem[i]<5) {
                   System.out.printf("\n %s : %.2f Hoc luc Yeu",HovaTen[i],Diem[i]);
               }
               else if (Diem[i] >=5 && Diem[i]<6.5) {System.out.printf("\n %s : %.2f Hoc luc Trung Binh",HovaTen[i],Diem[i]);}
               else if (Diem[i] >=6.5 && Diem[i]<7.5) {System.out.printf("\n %s : %.2f Hoc luc Kha",HovaTen[i],Diem[i]);}
               else if (Diem[i] >=7.5 && Diem[i]<9) {System.out.printf("\n %s : %.2f Hoc luc Gioi",HovaTen[i],Diem[i]);}
               else if (Diem[i] >=9 ) {System.out.printf("\n %s : %.2f Hoc luc Xuat Sac",HovaTen[i],Diem[i]);}
           }

        System.out.print("\n \n Sap xep: ");
        for (int i = 1;i<n;i++){
            for (int j=i;j>=0;j--) {
                if (Diem[i]<Diem[j]) {
                    double temp = Diem[i];
                    Diem[i]=Diem[j];
                    Diem[j]=temp;
                }
            }
        }
        for (int i = 0;i<n;i++){
            System.out.printf("\n %s : %.2f",HovaTen[i],Diem[i]);
        }



    }
}
