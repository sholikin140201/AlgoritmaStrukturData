package arrayobjects;
import java.util.Scanner;
public class ArrayObjects {
    public static void main (String[] args){
        persegiPanjang[] ppArray=new persegiPanjang[3];
        Scanner sholikin=new Scanner (System.in);
    
        for (int i=0; i<3; i++){
            ppArray[0]=new persegiPanjang();
            System.out.println("---------------------");
            System.out.println("Peregi Panjang ke-"+i);
            System.out.print("Masukkan Panjang: ");
            ppArray[0].panjang=sholikin.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[0].lebar=sholikin.nextInt();
        }
        
        for (int i=0; i<3; i++){
            System.out.println("");
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[0].panjang+", lebar: "+ppArray[0].lebar);
        }
}
}
