package Lab8;

import java.util.Scanner;

public final class XPoly {

    public static double sum (double...x){  // Bai 1
        double s=0;
        for (int i = 0; i<x.length;i++){
            s+= x[i];
        }
        System.out.println("Sum = "+s);
        return 0;
    }


    public static double min (double...x) { // Bai 2
        double mi = x[0];
        for (int i = 0; i<x.length;i++){
            if (x[i]<mi) mi = x[i];
        }
        System.out.println("Min = "+mi);
        return 0;
    }


    public static double max (double...x) {   // Bai 2
        double ma = x[0];
        for (int i = 0; i<x.length;i++){
            if (x[i]>ma) ma = x[i];
        }
        System.out.println("Max = "+ma);
        return 0;
    }


    public static void toUpper (){   // Bai 3
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String s = in.nextLine();

        String[] words = s.split(" ");
         for (int i = 0; i<words.length; i++) {
             char firstChar = words[i].charAt(0);
             String upperFirstChar = String.valueOf(firstChar).toUpperCase();
             words[i] = upperFirstChar + words[i].substring(1);
         }
         String ss = String.join(" ", words);
        System.out.println("Ten sau khi chinh: "+ ss);
    }

}
