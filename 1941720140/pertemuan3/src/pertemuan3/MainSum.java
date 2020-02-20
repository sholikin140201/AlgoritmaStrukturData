package pertemuan3;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args){
        Scanner sholikin=new Scanner(System.in);
        
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elm=sholikin.nextInt();
        
        sum sm=new sum(elm);
        System.out.println("======================================================");  
        for(int i=0; i<sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke- "+(i+1)+" = ");
            sm.keuntungan[i]=sholikin.nextDouble();
        }
        
        System.out.println("==============================================");
        System.out.println("Algortitma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("==============================================");
        System.out.println("Algortitma Divide and Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
    }
}
