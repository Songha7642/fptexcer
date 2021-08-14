
//Viet chuong trinh xuat ra man hinh bang cuu chuong

package Lab3;

public class Lab3_Bai2 {
    public static void main (String []args){
        for (int i=1; i<10; i++) {
            System.out.println('\t');
            for(int j =1; j < 11; j++) {
                System.out.printf("\n%d * %d = %d", i,j,i*j);
            }
        }

    }
}
