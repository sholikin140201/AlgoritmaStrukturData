package jobsheet2;
import java.util.Scanner;
public class pertama {
    static Scanner sholikin = new Scanner (System.in);
    public static void main (String []args){
        hitungLs();   
        hitungKl();  
        
    }
    static void hitungLs(){
        double phi=3.14;
        double r;
        double hasil;
                
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukan jari-jari : ");
        r=sholikin.nextDouble();
        
        hasil = phi*r*r;
        System.out.println("hasil : "+hasil);
        System.out.println("-------------------------");
        
    }
    static void hitungKl(){
        double phi=3.14;
        double r;
        double hasil;
        
        
        System.out.println("Menghitung Keliling Lingkaran ");
        System.out.print("Masukan jari-jari: ");
        r=sholikin.nextDouble();
        
       hasil = 2*phi*r ;
        System.out.println("Hasil " + hasil);
       
    }
}
