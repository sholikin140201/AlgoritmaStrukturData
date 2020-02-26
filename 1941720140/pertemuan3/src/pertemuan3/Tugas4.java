package pertemuan3;
import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pemilihan Presiden BEM Tahun 2020");
        System.out.println();
        System.out.println("Kandidat Calon Presiden BEM");
        System.out.println("1. Haris");
        System.out.println("2. Bisma");
        System.out.println("3. Dian");
        System.out.println("4. Rani");
                
        System.out.println();
        System.out.print("Masukkan jumlah terkumpul suara : ");
        int n = sc.nextInt();
        System.out.println();
        
        Bem pilih = new Bem(n);
        
        System.out.println("Masukkan suara terpilih dengan nomor kandidat");
        for(int i = 0; i < pilih.n; i++){    
            System.out.print("Suara ke-" + (i+1) + " : ");
            pilih.suara[i] = sc.nextInt();
        }
        
        pilih.pemilihan(0);
        System.out.print("Presiden BEM Terpilih adalah : ");
        if(pilih.j1 > pilih.j2 && pilih.j1 > pilih.j3 && pilih.j1 > pilih.j4){
            System.out.println("Haris");
        }
        else if(pilih.j2 > pilih.j1 && pilih.j2 > pilih.j3 && pilih.j2 > pilih.j4){
            System.out.println("Bisma");
        }
        else if(pilih.j3 > pilih.j1 && pilih.j3 > pilih.j1 && pilih.j3 > pilih.j4){
            System.out.println("Dian");
        }
        else if(pilih.j4 > pilih.j1 && pilih.j4 > pilih.j2 && pilih.j4 > pilih.j1) {
            System.out.println("Rani");
        }
    }
}
    

