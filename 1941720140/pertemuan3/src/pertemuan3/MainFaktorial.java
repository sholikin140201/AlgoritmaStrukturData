package pertemuan3;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args){
        Scanner sholikin=new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen=sholikin.nextInt();
        
        faktorial[] fk=new faktorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i]=new faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+": ");
            fk[i].nilai=sholikin.nextInt();
        }
        
        System.out.println("====================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialBF(fk[i].nilai));
        }
        
        System.out.println("====================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("====================================================");
    }
}
