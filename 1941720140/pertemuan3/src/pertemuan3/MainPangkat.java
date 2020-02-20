package pertemuan3;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args){
        Scanner sholikin= new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen=sholikin.nextInt();
        
        pangkat[] png=new pangkat[elemen];
        for(int i=0; i<elemen; i++){
            png[i]=new pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+": ");
            png[i].nilai=sholikin.nextInt();
            System.out.print("Masukkan nilai pangkat ke-"+(i+1)+": ");
            png[i].pangkat=sholikin.nextInt();
        }
        
        System.out.println("====================================================");
        System.out.println("Nilai pangkat dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah: "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("====================================================");
        System.out.println("Nilai pangkat dengan Divide and Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah: "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        System.out.println("====================================================");
    }
}
