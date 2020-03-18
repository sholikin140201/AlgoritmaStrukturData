package arraybalok;
import java.util.Scanner;
public class segitiga {
    
    public int alas, tinggi;
    
    segitiga(){
    }
    public static void main (String[] args){
        Scanner sholikin=new Scanner(System.in);
        segitiga[] sgtga=new segitiga[4];
        
        for(int i=0; i<4; i++){
            sgtga[0]=new segitiga();
            System.out.println("---------------");
            System.out.println("Segitiga ke-"+i);
            System.out.print("Masukkan Alas: ");
            sgtga[0].alas=sholikin.nextInt();
            System.out.print("Masukkan Tinggi: ");
            sgtga[0].tinggi=sholikin.nextInt();
        }
        
        System.out.println("~~~~~~");
        System.out.println("Hasil");
        System.out.println("~~~~~~");
        
        for(int i=0; i<4; i++){
            System.out.println("Segitiga ke-"+i);
            System.out.println("Alas: "+sgtga[0].alas+", Tinggi: "+sgtga[0].tinggi);
            System.out.println("--------------------------------");
        }
    }
    
    public segitiga(int x, int y){
        alas=x;
        tinggi=y;
    }
    int hitungLuas(int x, int y){
        return x*y/2;
    }
    double hitungKeliling(int x, int y){
        double a=new Double ((x*x)+(y*y));
        return (Math.sqrt(a)*2)+x;
    }
    }

