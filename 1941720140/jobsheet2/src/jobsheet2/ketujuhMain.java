package jobsheet2;
import java.util.Scanner;
public class ketujuhMain {
    public static void main(String[] args) {
        Scanner sholikin=new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int jml=sholikin.nextInt();
        ketujuh kmps[]=new ketujuh[jml];
        
        for(int a=0; a<kmps.length; a++){
            System.out.print("Mhs "+(a+1));
            kmps[a]=new ketujuh();
            System.out.print("Nilai 1: ");
            kmps[a].nilai1=sholikin.nextInt();
            System.out.print("Nilai 2: ");
            kmps[a].nilai2=sholikin.nextInt();
        }
        System.out.println();
        for(int a=0; a<kmps.length; a++){
            System.out.println("Mhs "+(a+1));
            System.out.println("Nilai 1: "+kmps[a].nilai1);
            System.out.println("Nilai 2: "+kmps[a].nilai2);
            
        }
        System.out.println();
        for(int a=0; a<kmps.length; a++){
            System.out.println("Nilai Terbaik Mhs "+(a+1)+" : "+kmps[a].nilaiTerbaik());
            
        }
    }
}
